package com.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class insertSqlHelp {

    public static void main(String[] args) {

        CuxDocAuditReturnItfHelp();
    }

    /**
     * 财务权限查看批量分配
     */
    static void batchInsertSSC1060(){
        // 工号
        String employeeIdStr = "XC16927,XC17358,XC17358,XC16761,XC16606,XC17019,XC18584,XC16918,XC18584,XC16606,XC17021,XC17021,XC16606,XC16606,XC17019,XC16606,XC00318,XC16606,XC16606,XC16606,XC17004,XC16606,XC16606,XC16606,XC16606,XC17358,XC16927,XC17145,XC16606,XC17011,XC17358,XC16606,XC17004,XC16927,XC16606,XC04701,XC17242,XC17358,XC16927,XC04701,XC04701,XC17011,XC17145,XC17145,XC16606,XC17145,XC17011,XC04701,XC16606,XC16606,XC17022,XC17022,XC16606,XC16927,XC17147,XC00318,XC00318,XC17021,XC18584,XC18584,XC18584,XC17004,XC16606,XC17021,XC18584,XC17021,XC17004,XC16761,XC18584,XC17022,XC17145,XC17022,XC17022,XC17145,XC17145,XC17147,XC16606,XC04701,XC18446,XC17242,XC16628,XC16628,XC16628,XC16628,XC16628,XC16628,XC16628,XC16628,XC16628,XC16628,XC16628,XC16628";
        // 核算主体name
        String entityStr = "保定新潮文化传媒有限公司,大连新潮文化传媒有限公司,哈尔滨梯视文化传媒有限公司,广州播了么传媒科技有限公司,广州播了么传媒科技有限公司,北京新潮文化传媒有限公司,深圳新潮文化传媒有限公司,深圳新潮文化传媒有限公司,深圳新潮文化传媒有限公司,长沙播了么文化传媒有限公司岳阳分公司,武汉播了么传媒科技有限公司,武汉播了么传媒科技有限公司,宜昌播了么文化传播有限公司,武汉播了么传媒科技有限公司荆州分公司,呼和浩特声画文化传媒有限公司,常州商视传媒有限公司,常州商视传媒有限公司,常州商视传媒有限公司,常州商视传媒有限公司,北京新潮文化传媒有限公司,合肥播了么传媒科技有限公司,合肥播了么传媒科技有限公司,北京新潮文化传媒有限公司,南京播了么传媒科技有限公司,南京播了么传媒科技有限公司,沈阳声画佳业文化传播有限公司,石家庄梯视文化传媒有限公司,海南新潮传媒有限公司,长沙播了么文化传媒有限公司株洲分公司,长沙播了么文化传媒有限公司,济南声画文化传媒有限公司,青岛声画文化传媒有限公司临沂分公司,徐州梯视文化传媒有限公司,青岛声画文化传媒有限公司烟台分公司,南充新潮文化传媒有限公司,兰州新潮文化传媒有限公司,重庆新想乐文化传媒有限责任公司,青岛声画文化传媒有限公司,天津播了么传媒科技有限公司,西安新谷广告文化传播有限责任公司,贵阳新潮文化传媒有限公司,太原播了么文化传媒有限公司,太原播了么文化传媒有限公司洛阳分公司,郑州新潮文化传媒有限公司,郑州新潮文化传媒有限公司南阳分公司,郑州新潮文化传媒有限公司,南昌播了么文化传媒有限公司,西安新谷广告文化传播有限责任公司,南宁播了么文化传媒有限公司,北京新潮文化传媒有限公司,中山声画传媒有限公司,中山声画传媒有限公司,青岛声画文化传媒有限公司潍坊分公司,长春新潮文化传媒有限公司,上海新潮数字科技有限公司,常州商视传媒有限公司,宁波新声文化传媒有限公司,南京播了么传媒科技有限公司,苏州声潮文化传媒有限公司,无锡新潮传媒有限公司,台州声画文化传媒有限公司,南通商视文化传媒有限公司,金华声画文化传媒有限公司,嘉兴声画文化传播有限公司,温州梯视传媒有限公司,绍兴新想乐文化传媒有限公司,杭州播了么传媒科技有限公司,广州播了么传媒科技有限公司,深圳新潮文化传媒有限公司,厦门视梯联传媒有限公司,海南新潮传媒有限公司,南宁播了么文化传媒有限公司,中山声画传媒有限公司,福州声画传媒有限公司,泉州新潮传媒有限公司,上海声画文化传播有限公司,昆明潮画传媒有限公司玉溪分公司,昆明潮画传媒有限公司,成都新潮生活圈文化传媒有限公司,泸州蜜蜂直投文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司,牛框框（上海）文化传媒有限公司";
        // 核算主体Name映射核算主体id
        Map<String, Long> entityMap = new HashMap<>();
        Map<String, Long> employeeMap = new HashMap<>();
        Set<String> uniqueKey = new HashSet<>();
        generateMap1(entityMap);
        generateMap2(employeeMap);

        List<String> employeeList = new ArrayList<>(Arrays.asList(employeeIdStr.split(",")));
        List<String> entityList = new ArrayList<>(Arrays.asList(entityStr.split(",")));
        System.out.println(employeeList.size() == entityList.size());
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO employee_gld_acc_entity ( REQUEST_ID,PROGRAM_ID,CREATED_BY,CREATION_DATE,LAST_UPDATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_LOGIN,EMPLOYEE_ID,ACC_ENTITY_ID,ACC_ENTITY_NAME,ENABLED_FLAG ) VALUES\n");
        for (int i=0; i<employeeList.size(); i++){
            String key =employeeMap.get(employeeList.get(i))+"-"+entityMap.get(entityList.get(i));
            if(uniqueKey.contains(key)){
                continue;
            }else{
                uniqueKey.add(key);
                sql.append("(-1, -1,10001, CURRENT_TIMESTAMP, -1, CURRENT_TIMESTAMP, -1, ").append(employeeMap.get(employeeList.get(i))).append(", ").append(entityMap.get(entityList.get(i))).append(", \"").append(entityList.get(i)).append("\", \"Y\"),\n");
            }
        }
        sql.replace(sql.lastIndexOf(","),sql.lastIndexOf(",")+1,";");
        System.out.println(sql.toString());
    }

//    查找员工id
//    SELECT
//    sw.employee_id,
//    sw.enabled_flag,
//    ee.employee_code,
//    ee.NAME employee_name
//    FROM
//    ssc_worker sw
//    LEFT JOIN exp_employee ee ON ee.EMPLOYEE_ID = sw.EMPLOYEE_ID
//            WHERE
//    ee.employee_code in ()

    private static void generateMap2(Map<String, Long> map) {
        map.put("XC16739", 21297L);
        map.put("XC16544", 21057L);
        map.put("XC05040", 15449L);
        map.put("XC05357", 17333L);
        map.put("XC07826", 17945L);
        map.put("XC11002", 17955L);
        map.put("XC17218", 23337L);
        map.put("XC17229", 23357L);
        map.put("XC17241", 23378L);
        map.put("XC17451", 23784L);
        map.put("XC17490", 23860L);
        map.put("XC17707", 24154L);
        map.put("XC18107", 24630L);
        map.put("XC18251", 24852L);
        map.put("XC19061", 26200L);
        map.put("XC11810", 17201L);
        map.put("XC19772", 27222L);
        map.put("XC19748", 27188L);
        map.put("XC19763", 27212L);
        map.put("XC20022", 27680L);
        map.put("XC20021", 27678L);
        map.put("XC00318",13303L);
        map.put("XC04701",15469L);
        map.put("XC16606",21097L);
        map.put("XC16606",21097L);
        map.put("XC16628",21123L);
        map.put("XC16761",21339L);
        map.put("XC16918",20005L);
        map.put("XC16927",20023L);
        map.put("XC17004",21851L);
        map.put("XC17011",21865L);
        map.put("XC17019",23065L);
        map.put("XC17021",23069L);
        map.put("XC17022",23071L);
        map.put("XC17145",23189L);
        map.put("XC17147",23193L);
        map.put("XC17242",23380L);
        map.put("XC17358",23614L);
        map.put("XC18446",25156L);
        map.put("XC18584",25368L);
    }

    private static void generateMap1(Map<String, Long> map) {
        map.put("成都新潮传媒集团有限公司", 1L);
        map.put("成都新潮生活圈文化传媒有限公司", 3L);
        map.put("重庆新想乐文化传媒有限责任公司", 5L);
        map.put("成都新潮小区科技有限公司", 7L);
        map.put("成都声画广告有限公司", 9L);
        map.put("上海声画文化传播有限公司", 11L);
        map.put("西安新谷广告文化传播有限责任公司", 15L);
        map.put("北京新潮文化传媒有限公司", 13L);
        map.put("成都新潮数字品牌营销策划有限公司", 17L);
        map.put("成都播了么科技有限公司", 19L);
        map.put("深圳新潮文化传媒有限公司", 21L);
        map.put("深圳播了么传媒科技有限公司", 23L);
        map.put("北京播了么传媒科技有限公司", 25L);
        map.put("广州播了么传媒科技有限公司", 27L);
        map.put("杭州播了么传媒科技有限公司", 29L);
        map.put("武汉播了么传媒科技有限公司", 31L);
        map.put("天津播了么传媒科技有限公司", 33L);
        map.put("南京播了么传媒科技有限公司", 35L);
        map.put("无锡新潮传媒有限公司", 37L);
        map.put("长沙播了么文化传媒有限公司", 39L);
        map.put("沈阳声画佳业文化传播有限公司", 41L);
        map.put("苏州声潮文化传媒有限公司", 43L);
        map.put("宁波新声文化传媒有限公司", 45L);
        map.put("嘉兴声画文化传播有限公司", 47L);
        map.put("昆明潮画传媒有限公司", 49L);
        map.put("石家庄梯视文化传媒有限公司", 51L);
        map.put("济南声画文化传媒有限公司", 53L);
        map.put("郑州新潮文化传媒有限公司", 55L);
        map.put("常州商视传媒有限公司", 57L);
        map.put("厦门视梯联传媒有限公司", 59L);
        map.put("南昌播了么文化传媒有限公司", 61L);
        map.put("贵阳新潮文化传媒有限公司", 63L);
        map.put("宜昌播了么文化传播有限公司", 65L);
        map.put("合肥播了么传媒科技有限公司", 67L);
        map.put("泉州新潮传媒有限公司", 69L);
        map.put("徐州梯视文化传媒有限公司", 71L);
        map.put("福州声画传媒有限公司", 73L);
        map.put("海南新潮传媒有限公司", 75L);
        map.put("大连新潮文化传媒有限公司", 77L);
        map.put("青岛声画文化传媒有限公司", 79L);
        map.put("成都蜜蜂直投文化传媒有限公司", 81L);
        map.put("成都新潮传媒集团有限公司重庆分公司", 83L);
        map.put("南宁播了么文化传媒有限公司", 85L);
        map.put("台州声画文化传媒有限公司", 87L);
        map.put("成都梯联网文化传媒有限公司", 89L);
        map.put("温州梯视传媒有限公司", 91L);
        map.put("南通商视文化传媒有限公司", 93L);
        map.put("太原播了么文化传媒有限公司", 95L);
        map.put("珠海蜜蜂直投文化传媒有限公司", 97L);
        map.put("中山声画传媒有限公司", 99L);
        map.put("成都新潮创客科技有限公司", 101L);
        map.put("南昌播了么文化传媒有限公司九江分公司", 103L);
        map.put("郑州新潮文化传媒有限公司洛阳分公司", 105L);
        map.put("兰州新潮文化传媒有限公司", 107L);
        map.put("金华声画文化传媒有限公司", 109L);
        map.put("深圳蜜蜂直投科技有限公司", 111L);
        map.put("绍兴新想乐文化传媒有限公司", 113L);
        map.put("哈尔滨梯视文化传媒有限公司", 115L);
        map.put("牛框框（上海）文化传媒有限公司", 117L);
        map.put("南充新潮文化传媒有限公司", 119L);
        map.put("呼和浩特声画文化传媒有限公司", 121L);
        map.put("长春新潮文化传媒有限公司", 123L);
        map.put("广州蜜蜂直投科技有限公司", 125L);
        map.put("长沙播了么文化传媒有限公司株洲分公司", 127L);
        map.put("青岛声画文化传媒有限公司潍坊分公司", 129L);
        map.put("青岛声画文化传媒有限公司临沂分公司", 131L);
        map.put("青岛声画文化传媒有限公司烟台分公司", 133L);
        map.put("西宁新梯联文化传媒有限公司", 135L);
        map.put("北京梯视广告传媒有限公司", 137L);
        map.put("保定新潮文化传媒有限公司", 139L);
        map.put("绵阳新潮文化传播有限公司", 141L);
        map.put("长沙播了么文化传媒有限公司岳阳分公司", 143L);
        map.put("常州商视传媒有限公司盐城分公司", 145L);
        map.put("昆明潮画传媒有限公司玉溪分公司", 147L);
        map.put("武汉播了么传媒科技有限公司荆州分公司", 149L);
        map.put("浙江梯视传媒有限公司", 151L);
        map.put("成都百新智联科技有限公司", 153L);
        map.put("上海新潮生活圈科技有限公司", 155L);
        map.put("郑州新潮文化传媒有限公司南阳分公司", 157L);
        map.put("太原播了么文化传媒有限公司洛阳分公司", 159L);
        map.put("大同新潮传媒有限公司", 161L);
        map.put("上海新潮传媒有限公司", 163L);
        map.put("成都新锦越盛科技有限公司", 164L);
        map.put("上海新潮数字科技有限公司", 166L);
        map.put("长治新潮文化传媒有限公司", 168L);
        map.put("忻州忻潮文化传媒有限公司", 174L);
        map.put("深圳新潮文化传媒有限公司东莞分公司", 176L);
        map.put("泸州蜜蜂直投文化传媒有限公司", 178L);
        map.put("成都屏盟科技有限公司", 182L);
    }

    /**
     * 批量打开期间
     */
    static void openPeriod(){
        // 全核算主体
        String fullAcc = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99,101,103,105,107,109,111,113,115,117,119,121,123,125,127,129,131,133,135,137,139,141,143,145,147,149,151,153,155,157,159,161,163,164,166,168,174,176,178";
        List<String> fullAccList = new ArrayList(Arrays.asList(fullAcc.split(",")));
        // 排除核算主体
        String accStr = "";
        // 打开期间
        String periodName = "2023-12";
        // 期间序号
        String periodNum = "20230012";
        List<String> list = new ArrayList(Arrays.asList(accStr.split(",")));
        fullAccList.removeAll(list);

        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO gld_ae_period_status ( REQUEST_ID,PROGRAM_ID,CREATED_BY,CREATION_DATE,LAST_UPDATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_LOGIN,ACC_ENTITY_ID,PERIOD_SET_CODE,PERIOD_NAME,INTERNAL_PERIOD_NUM,PERIOD_STATUS_CODE ) VALUES\n");
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        for (String s : fullAccList) {
            sql.append("(").append("-1, -1, -1, ").append("CURRENT_TIMESTAMP").append(", -1,").append("CURRENT_TIMESTAMP").append(", -1,").append(s).append(" ,\"XC_PERIOD\", \"").append(periodName).append("\", ").append(periodNum).append(",\"O\"),\n");
        }
        sql.replace(sql.lastIndexOf(","),sql.lastIndexOf(",")+1,";");
        System.out.println(sql.toString());
    }

    /**
     * 打开同一个核算主体的期间
     */
    void openPeriodNew(){

    }

    /**
     * 批量拒绝费控sql的helper
     */
    static void CuxDocAuditReturnItfHelp(){
        String str = "XC23022300019";
        List<String> list = Arrays.asList(str.toString().split(","));
        int batchSize = 100;
        StringBuilder sqlBuilder = new StringBuilder();
        // 报账单：EXP_REPORT，借款单：PAYMENT_REQUISITION
        String DOC_CATEGORY = "EXP_REPORT";
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        sqlBuilder.append("insert into cux_doc_audit_return_itf (STATUS,APPROVAL_USER,APP_CODE,DOC_CATEGORY,BOE_NO,INTERFACE_STATUS,APPROVAL_TIME,APPROVAL_INFO) values");
        int i =0;
        for (String s : list) {
            if(i==batchSize){
                i=0;
                sqlBuilder.replace(sqlBuilder.lastIndexOf(","),sqlBuilder.lastIndexOf(",")+1,";");
                sqlBuilder.append("insert into cux_doc_audit_return_itf (STATUS,APPROVAL_USER,APP_CODE,DOC_CATEGORY,BOE_NO,INTERFACE_STATUS,APPROVAL_TIME,APPROVAL_INFO) values");
            }
            sqlBuilder.append("(\"OVERRULE\", \"FSSC001\", \"XCFSC\", ").append("\"").append(DOC_CATEGORY).append("\",").append("\"").append(s).append("\",").append("\"WAITING_SEND\",").append("\"").append(now).append("\",").append("\"批量拒绝\"),\n");
            i++;
        }
        System.out.println(sqlBuilder.toString());
    }
}
