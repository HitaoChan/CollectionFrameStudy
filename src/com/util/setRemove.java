package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class setRemove {

    public static void main(String[] args) {
        String str1 = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99,101,103,105,107,109,111,113,115,117,119,121,123,125,127,129,131,133,135,137,139,141,143,145,147,149,151,153,155,157,159,161,163";
        List<String> list1= new ArrayList<>(Arrays.asList(str1.split(",")));
        String str2 = "33";
        List<String> list2= new ArrayList<>(Arrays.asList(str2.split(",")));

        list1.removeAll(list2);
        System.out.println(list1.toString());
        System.out.println(list1.size());
    }
}
