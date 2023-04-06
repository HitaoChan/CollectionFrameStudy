package com.boot.jdk;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author haitao.chen01@hand-china.com
 * @date 2022/05/23
 * 1.
 */
public class LockAndAqs {

    static ReentrantLock lock = new ReentrantLock();

    static ReentrantLock fairLock = new ReentrantLock(true);

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
        * 1.tryAcquire、tryRelease是排他锁
        * tryAcquireShared、tryReleaseShared是共享锁
        * isHeldExclusively
        *
        * 调用的lock.lock()方法 -- sync.acquire()方法 --
        * */

        /**
         * compareAndSetState
         * tryAcquire
         * 一定要加锁，不成功就创建node插入tail，等待执行
         */
//        lock.lock();
        /*
        * 成功就成功，失败就失败，不会等待和排队
        *
        * lock方法必须加锁不成功就一直等待；而tryLock只尝试一次
        * 使用tryLock情况：配和循环去使用tryLock，这样加锁
        * */
//        lock.tryLock();

        /*
        * 可以超时获取锁
        * */
//        lock.tryLock(0, null);
        /*
        * 获取锁时可以被打断
        * */
//        lock.lockInterruptibly();

        /*
        * 第二个可复写的模板方法：tryRelease*/
        lock.unlock();

        //==============================================================
        /*
        * */
//        fairLock.lock();

    }


}
