package com.testenum;

import java.util.EnumSet;

public interface Week {
    enum WorkingDays implements Week{
        MONDAY("周一"), TUESDAY("周二"), WENDESDAY("周三"), THURSDAY("周四"), FRIDAY("周五");
        private final String day;
        WorkingDays(String day) {
            this.day = day;
        }
    }

    enum Weekend implements Week{
        SATURDAY, SUNDAY
    }

    class WeekTest{
        public static void main(String[] args) {
            StringBuilder builder = new StringBuilder();
            builder.append("双休日:");
            for (Weekend value : Weekend.values()) {
                builder.append(value).append(",");
            }
            System.out.println(builder.toString());
            System.out.println(WorkingDays.FRIDAY);
            System.out.println(Weekend.SATURDAY);

            // 创建一个指定枚举类型所有元素的集合
            EnumSet<WorkingDays> workingDays = EnumSet.allOf(WorkingDays.class);
            // 返回这个集合的拷贝
            EnumSet<WorkingDays> clone = workingDays.clone();
            System.out.println(workingDays);
            System.out.println(clone);
        }

    }
}
