package com.testenum;

public class Test {
    public static void main(String[] args) {
        System.out.println(ColoreEnum.RED);
        System.out.println(ColoreEnum.RED.name());
        // 返回序列号
        System.out.println(ColoreEnum.RED.ordinal());
        System.out.println(ColoreEnum.RED.getColorName());
        // 获取父类
        System.out.println(ColoreEnum.class.getSuperclass());
        // 获取指定类型的枚举成员
        System.out.println(ColoreEnum.valueOf("RED"));
        // java.lang.IllegalArgumentException
        //System.out.println(ColoreEnum.valueOf("RED1"));
        // 返回枚举成员数组
        ColoreEnum[] values = ColoreEnum.values();
        // 枚举类实现接口
        ColoreEnum.RED.show();
        ColoreEnum.GREEN.show();
    }
}
