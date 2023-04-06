package com.util.sql;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 写插入sql的工具类
 */
public class InsSelectiveUtil {

    public static void main(String[] args) {
        // 表名
        String table = "con_contract_invoice";
        // 变量名
        String str = "purchaserName,purchaserTaxpayerNumber,checkCode,purchaserAddressTel";
        List<String> params = Arrays.asList(str.split(","));
        StringBuilder builder = new StringBuilder();
        // 主键
        String pk = "invoiceLineId";
        builder.append("insert into ").append(table).append("\n");
        builder.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" >\n");

        for (String param : params) {
            builder.append("    <if test=\"").append(param).append(" != null and ").append(param).append("!= ''\">\n");
            builder.append("        ").append(humpToUnderline(param)).append(",\n");
            builder.append("    </if>\n");
        }
        builder.append("</trim>\n\n");
        
        builder.append("<trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >\n");
        for (String param : params) {
            builder.append("    <if test=\"").append(param).append(" != null and ").append(param).append("!= ''\">\n");
            builder.append("        #{").append(param).append("},\n");
            builder.append("    </if>\n");
        }
        builder.append("</trim>\n");

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
