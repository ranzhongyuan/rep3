package day04.demo01;

import java.math.BigDecimal;
import java.util.*;
import java.util.logging.Logger;

public class HelloWorld {
    public static void main(String[] args) {
        /*System.out.println(Math.round(2.4));
        System.out.println(Math.random());
        Random r = new Random();
        System.out.println(r.nextInt(2));
        System.out.println(Math.rint(2.5));*/
       /* BigDecimal b1= new BigDecimal(5.0);
        BigDecimal b2= new BigDecimal(3.7);
        BigDecimal divide = b1.divide(b2,7,BigDecimal.ROUND_FLOOR);
        System.out.println(divide);*/
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("a");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
    }

}




