package com.string;

import java.util.StringJoiner;

public class TestStringBuilder {

    public static void main(String[] args) {
        String s = replacementInfo("123", "2", "!");
        System.out.println(s);
    }

    /**
     * @param str：原字符串
     * @param keyword：字符
     * @param before：在字符前需要插入的字段
     */
    public static String replacementInfo(String str, String keyword, String before) {
        StringBuilder sb = new StringBuilder(str);
        String rs = str;
        try {
            //字符第一次出现的位置
            int index = sb.indexOf(keyword);
            while (index != -1) {
                sb.insert(index, before);
                //下一次出现的位置，
                index = sb.indexOf(keyword, index + before.length() + 1);
            }
            rs = sb.toString();
        } catch (Exception e) {
            System.out.println("更换字符错误！！！");
            e.printStackTrace();
        }
        return rs;
    }
}
