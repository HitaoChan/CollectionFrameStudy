package study.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirst {

    static class Dto {
        Long id;

        public Dto(Long id) {
            this.id = id;
        }
        public Dto() {
        }

        public Long getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Dto{" +
                    "id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Dto> list = new ArrayList<>();
        list.add(new Dto(Long.valueOf(1)));
        list.add(new Dto(Long.valueOf(2)));

//        list = list.stream().filter(x->x.getId()==2L).collect(Collectors.toList());;
        System.out.println(list.toString());

    }
}
