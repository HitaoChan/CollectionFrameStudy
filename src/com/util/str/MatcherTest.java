package com.util.str;

import java.util.HashSet;
import java.util.Set;

public class MatcherTest {

    /**
     * 发票袋号码编码规则
     */
    static final String FPD_CODE_RULE ="FPD[0-9]{9}";

    public static void main(String[] args) {
        String str = "FPD000000001";
        System.out.println(str.matches(FPD_CODE_RULE));
        Set<String> set1 = new HashSet<>();
        set1.add(str);
        Set<String> set2 = new HashSet<>();
        set2.add(str);
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
