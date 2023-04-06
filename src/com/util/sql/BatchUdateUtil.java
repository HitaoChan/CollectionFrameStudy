package com.util.sql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 根据主键批量更新
 * 1.修改 table 指定表名
 * 2.修改 str 指定字段名
 * 3.修改 pk 指定主键
 */
public class BatchUdateUtil {

    public static void main(String[] args) {
        // 表名
        String table = "acp_invoice_line";
        // 变量名
        String str = "purchaserName,purchaserTaxpayerNumber,checkCode,purchaserAddressTel";
        List<String> params = Arrays.asList(str.split(","));
        StringBuilder builder = new StringBuilder();
        // 主键
        String pk = "invoiceLineId";
        builder.append("update ").append(table).append("\n");
        builder.append("<trim prefix=\"set\" suffixOverrides=\",\">\n");
        for (String param : params) {
            builder.append("    <trim prefix=\"").append(humpToUnderline(param)).append("=  case  ").append(humpToUnderline(pk)).append("\" ").append("suffix=\"end,\">\n");
            builder.append("        <foreach collection=\"list\" item=\"item\" index=\"index\">\n");
            builder.append("             <if test=\"item.").append(param).append(" != null and item.").append(param).append(" != ''\">\n");
            builder.append("                when #{item.").append(pk).append("} then #{item.").append(param).append("}\n");
            builder.append("             </if>\n");
            builder.append("        </foreach>\n");
            builder.append("    </trim>\n");


        }
        builder.append("</trim>\n");
        builder.append("where ").append(humpToUnderline(pk)).append(" in\n");
        builder.append("<foreach collection=\"list\" open=\"(\" separator=\",\" close=\")\" index=\"index\" item=\"item\">\n");
        builder.append("    #{item.").append(pk).append("}\n");
        builder.append("</foreach>");


        System.out.println(builder.toString());
    }


    private static final Pattern compile = Pattern.compile("[A-Z]");

    static String humpToUnderline(String str){
        Matcher matcher = compile.matcher(str);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()) {
            matcher.appendReplacement(sb,  "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
