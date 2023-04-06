package study.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericStudy {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        System.out.println(list);
        GeneriticClass.removeBigDataList(list, list2);
        System.out.println(list);
    }
}
