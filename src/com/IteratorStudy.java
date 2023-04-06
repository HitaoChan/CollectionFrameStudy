package com;


import com.dto.RZHErrorInvoice;
import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 迭代器研究
 *
 * @author Administrator
 * @date 2022/04/24
 */
public class IteratorStudy {
    // testSimpleDateFormat测试用静态常量
    public static final DateFormat DATE_FORMAT=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static ThreadLocal<DateFormat> THRED_LOCAL = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };



    public static void main(String[] args) throws ParseException {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        for (String s : list) {
            System.out.println("list:"+s);
            for (String s1 : list1) {
                if(s1.equals("1")){
                    continue;
                }
                System.out.println("list1:"+s1);
            }
        }
    }



    /**
     * null字符串的值是“null”
     */
    private void nullStr(){
        String str1=null;
        System.out.println(String.valueOf(str1));
    }
    /**
     * 测试线程安全的sdf
     */
    private void testThreadLocalWithSdf(){
        for(int i=0;i<100;i++){
            new Thread(() -> {
                try {
                    Date date=THRED_LOCAL.get().parse("2020-04-04 12:00:00");
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    // 避免内存泄露
                    THRED_LOCAL.remove();
                }
            }).start();
        }
    }

    /**
     * 测试SimpleDateFormat线程不安全
     */
    private void testSimpleDateFormat(){
        for(int i=0;i<100;i++){
            new Thread(() -> {
                try {
                    Date date=DATE_FORMAT.parse("2020-04-04 12:00:00");
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }
    }

    /**
     * 测试StringJoiner
     */
    private void testStringJoiner(){
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("a");
        joiner.add("a");
        joiner.add("a");
        final String PREFIX= "[";
        final String SUFFIX= "]";
        StringJoiner joiner1 = new StringJoiner(",", PREFIX, SUFFIX);
        joiner1.add("b");
        joiner1.add("b");
        joiner1.add("b");
        System.out.println(joiner);
        System.out.println(joiner1);
    }

    /**
     * 测试equals方法
     */
    private void testEquals(){
        List<String> s1= new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        s1.add("test");
        s2=s1;
        s2.remove("test");
    }


    /**
     * 测试jcmd
     */
    private static void testJCMD(){
        Test test = new IteratorStudy.Test();
        test.foo();
    }

    static class Test{
        // 静态变量存在方法区
        static ObjectHolder staticObj = new ObjectHolder();
        // 实例变量存在Java堆
        ObjectHolder instanceObj = new ObjectHolder();

        void foo(){
            // 局部变量放在foo方法的栈帧的局部变量表中
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");//设置一个断点
        }
    }

    private static class ObjectHolder{}


    /**
     * equals 重写的测试
     */
    private void testContainsAndEquals(){
        List<RZHErrorInvoice> insertList = new ArrayList<>();
        RZHErrorInvoice e1 = new RZHErrorInvoice("4400201130", "4400201130", "1");
        RZHErrorInvoice e2 = new RZHErrorInvoice("4400201130", "4400201130", "1");

        insertList.add(e1);
        System.out.println(insertList.contains(e2));
        insertList.remove(e2);
        System.out.println(insertList.toString());
    }


    private static String getRandomName() {
        return "random";
    }


    /**
     * 分割测试
     */
    public static void splitTest(){
        List<String> list = new ArrayList<>();
        list.add("code,number");
        list.forEach(x->{
            String[] strings = x.split(",",2);
            System.out.println(strings[0]);
            System.out.println(strings[1]);
        });
    }
    /**
     * 正则表达式测试
     */
    public static void patternTest(){
        System.out.println(Pattern.matches("\\d{4}-\\d\\d-\\d\\d \\d\\d:\\d\\d", "2022-02-14 10:04"));
        System.out.println(Pattern.matches("\\d{8}", "20220214"));
        System.out.println(Pattern.matches("\\d{4}-\\d\\d-\\d\\d", "2022-02-14"));
        System.out.println(Pattern.matches("\\d{4}年\\d\\d月\\d\\d日", "2022年02月14日"));
        System.out.println(Pattern.matches("\\d{4}-\\d\\d", "2022-02"));
    }

    public static int betweenMonthByTwoCalendar(Calendar startCalendar,Calendar endCalendar){
        //判断日期大小
        if(startCalendar.after(endCalendar)){
            Calendar temp = startCalendar;
            startCalendar = endCalendar;
            endCalendar = temp;
        }
        int startYear = startCalendar.get(Calendar.YEAR);
        int endYear = endCalendar.get(Calendar.YEAR);
        int startMonth = startCalendar.get(Calendar.MONTH);
        int endMonth = endCalendar.get(Calendar.MONTH);
        int monthNum = (endYear - startYear)*12+(endMonth-startMonth);
        return monthNum;
    }

     class User{
        String name;

        public User(String s) {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }




}
