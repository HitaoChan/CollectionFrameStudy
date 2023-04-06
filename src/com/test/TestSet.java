package com.test;

import java.util.*;

public class TestSet {

    public static void main(String[] args) {
        List<AcpInvoiceHeader> list = new ArrayList<>();
        AcpInvoiceHeader header = new AcpInvoiceHeader();
        header.setA("b");
        list.add(header);
        String test ="";
        Optional<AcpInvoiceHeader> result = list.stream().filter(x->x.getA().equals("a")).findFirst();
        System.out.println(result.isPresent());
    }

    static class AcpInvoiceHeader{
        private String a;
        private String b;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        @Override
        public String toString() {
            return "AcpInvoiceHeader{" +
                    "a='" + a + '\'' +
                    ", b='" + b + '\'' +
                    '}';
        }
    }
}
