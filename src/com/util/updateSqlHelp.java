package com.util;

import java.util.*;

public class updateSqlHelp {
    public static void main(String[] args) {
        StringBuilder sql = new StringBuilder();
        String unitIdStr = "3,8830,8860,8828,8834,8836,8840,8848,8850,8852,8854,8856,8862,8864,8866,8868,8870,8872,8874,8876,8878,8880,8882,8884,8886,8888,8890,8892,8894,8896,8898,8900,8902,8904,8906,8908,8910,8912,8914,8916,8918,8920,8922,8924,8926,8928,8930,8932,8934,8936,8938,8942,8944,8946,8948,8950,8952,8954,8956,8958,8960,8962,8964,8966,8968,8970,8972,8974,8976,8978,8980,8982,8984,8986,8988,8990,8992,8994,8996,8998,9000,9002,9004,9006,9008,9010,9012,9014,9016,9018,9020,9022,9024,9026,9028,9030,9032,9034,9036,9038,9040,9042";
        String unitTypeIdStr = "3,3,5,1,7,7,7,7,7,7,7,3,7,3,1,1,7,7,7,7,7,3,1,1,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,3,7,3,7,7,7,1,1,7,1,7,7,7,7,3,7,1,1,7,7,7,7,7,7,7,7,7,7,7,7,3,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7";

        List<String> unitIdList = Arrays.asList(unitIdStr.split(","));
        List<String> unitTypeIdList = Arrays.asList(unitTypeIdStr.split(","));
        Map<String, List<String>> unitGroupMap = new HashMap<>();

        if(unitIdList.size() != unitTypeIdList.size()){
            System.out.println("数据错误！！！");
        }
        for(int i=0; i< unitIdList.size(); i++){
            if(unitGroupMap.keySet().contains(unitTypeIdList.get(i))){
                unitGroupMap.get(unitTypeIdList.get(i)).add(unitIdList.get(i));
            }else {
                List<String> list = new ArrayList<>();
                list.add(unitIdList.get(i));
                unitGroupMap.put(unitTypeIdList.get(i), list);
            }
        }

        for (Map.Entry<String, List<String>> stringListEntry : unitGroupMap.entrySet()) {
            sql.append("update exp_org_unit set unit_type_id = ").append(stringListEntry.getKey()).append(" where UNIT_ID in (");
            for (String s : stringListEntry.getValue()) {
                sql.append(s).append(",");
            }
            sql.deleteCharAt(sql.lastIndexOf(",")).append(");\n");
        }
        System.out.println(sql.toString());
    }

    static void updateAcpInvoiceHeaderUnit(){
        StringBuilder sql = new StringBuilder();
        String docStr= "1883326";
        List<String> docId = Arrays.asList(docStr.split(","));
        String unitStr = "2217";
        List<String> unitId = Arrays.asList(unitStr.split(","));
        // unitId Map
        Map<String, List<String>> unitGroupMap = new HashMap<>();
        for (int i=0; i <docId.size(); i++){
            if(unitGroupMap.keySet().contains(unitId.get(i))){
                unitGroupMap.get(unitId.get(i)).add(docId.get(i));
            }else {
                List<String> list = new ArrayList<>();
                list.add(docId.get(i));
                unitGroupMap.put(unitId.get(i), list);
            }
        }
        for (Map.Entry<String, List<String>> stringListEntry : unitGroupMap.entrySet()) {
            sql.append("update acp_invoice_header set unit_id = ").append(stringListEntry.getKey()).append(" where invoice_header_id in (");
            for (String s : stringListEntry.getValue()) {
                sql.append(s).append(",");
            }
            sql.deleteCharAt(sql.lastIndexOf(",")).append(");\n");
        }
        System.out.println(sql.toString());
    }

}
