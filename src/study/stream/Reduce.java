package study.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Reduce {

    static class Money{
        BigDecimal amount;

        public Money(String amount) {
            this.amount = new BigDecimal(amount);
        }

        public BigDecimal getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {
        List<Money> list = new ArrayList<>();

        list.add(new Money("1"));
        list.add(new Money("1"));
        list.add(new Money("1"));
        list.add(new Money("1"));
        BigDecimal reduce = list.stream().map(Money::getAmount).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);

        List<String> list1 = Collections.singletonList("123");
        String s = list1.get(0);
        s = "1";
        System.out.println(list1);
    }
}
