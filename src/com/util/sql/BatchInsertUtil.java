package com.util.sql;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BatchInsertUtil {
    public static void main(String[] args) {
        // 表名
        String table = "invoice_pocket_relation";
        // 变量名
        String str = "invoicePocketNumber,sourceDocNumber,status,attributeCategory,attribute1,attribute2,attribute3,attribute4,attribute5,attribute6,attribute7,attribute8,attribute9,attribute10,attribute11,attribute12,attribute13,attribute14,attribute15";
        List<String> params = Arrays.asList(str.split(","));
        StringBuilder builder = new StringBuilder();

        builder.append("insert into ").append(table);
        builder.append(" (");
        for (String param : params) {
            builder.append(humpToUnderline(param)).append(", ");
        }
        builder.deleteCharAt(builder.length()-2);
        builder.append(")\n");

        builder.append("values \n");
        builder.append("<foreach collection=\"list\" item=\"item\" separator=\",\" index=\"index\">\n");
        builder.append("     (");
        for (String param : params) {
            builder.append("#{item.").append(param).append("},");
        }
        builder.append(")");
        builder.deleteCharAt(builder.length()-2);
        builder.append("\n</foreach>\n");

        System.out.println(builder.toString());
    }

    private static final Pattern compile = Pattern.compile("[A-Z]");

    /**
     * 驼峰转下划线
     * @param str 变量名
     * @return
     */
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
