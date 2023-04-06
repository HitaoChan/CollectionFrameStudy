package com.exception;

public class Text {
    public static void main(String[] args) {
        // 数组越界
        try{
            int i =1/0;
        }catch (Exception e){
            String msg = e.getClass().getName()+":"+(e.getStackTrace().length>0 ? e.getStackTrace()[0]:"");
            System.out.println(e.getClass());
            System.out.println(msg);
        }
    }
}
