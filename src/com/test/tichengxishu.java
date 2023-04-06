package com.test;

import java.util.Arrays;
import java.util.List;

/**
 * 提成系数批量sql生成
 */
public class tichengxishu {
    public static void main(String[] args) {
        // 需要修改的id
        String str = "751478,760348,760354,760360,766460,770022,789518,789562,793884";
        // 需要修改的费用对象id
        String MO_EXPENSE_OBJECT_ID = "2";
        // 需要修改的费用对象描述
        String MO_EXPENSE_OBJECT_NAME = "上浮10%";

        List<String> list = Arrays.asList(str.split(","));

        StringBuilder builder = new StringBuilder();
        builder.append("INSERT INTO exp_report_object ( REQUEST_ID, PROGRAM_ID, CREATED_BY, CREATION_DATE, LAST_UPDATED_BY, LAST_UPDATE_DATE, LAST_UPDATE_LOGIN, EXP_REPORT_HEADER_ID, MO_EXP_OBJ_TYPE_ID, MO_EXPENSE_OBJECT_ID, MO_EXPENSE_OBJECT_NAME )\n" +
                "VALUES\n");
        for (String s : list) {
            builder.append("( -1,-1, 27031, NOW(), 27031, NOW(), 27031, ").append(s)
                    .append(",2, ").append(MO_EXPENSE_OBJECT_ID).append(", ").append("'").append(MO_EXPENSE_OBJECT_NAME).append("'),\n");

        }
        builder.replace(builder.length()-2,builder.length()-1,";");
        System.out.println(builder.toString());
    }
}
