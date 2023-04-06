package com.boot.jdk;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * 1.implements Lock
 * 2.写一个静态的内部类，extends AbstractQueuedSynchronizer
 */
public class CreateLock implements Lock {

    /**
     * tryAcquire 加锁
     * tryRelease 解锁
     */
    private static class Sync extends AbstractQueuedSynchronizer{
        @Override
        protected boolean tryAcquire(int arg) { // 加锁
            if(!Thread.currentThread().getName().startsWith("like-cht")){
                // log
                return false;
            }
            if(compareAndSetState(0, arg)){
                return true; // 加锁成功
            }
            return false; // 加锁失败
        }

        @Override
        protected boolean tryRelease(int arg) { // 解锁
            if(getState() == 0){
                throw new IllegalMonitorStateException();
            }
            setState(0);
            setExclusiveOwnerThread(null);
            return true;
        }

        Condition getCondition(){
            return new ConditionObject();
        }
    }

    Sync sync = new Sync();

    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1, unit.toNanos(time));
    }

    @Override
    public void unlock() {
        sync.release(1);
    }

    @Override
    public Condition newCondition() {
        return sync.getCondition();
    }
}
