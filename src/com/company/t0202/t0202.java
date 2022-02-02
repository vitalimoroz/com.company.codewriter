package com.company.t0202;

import java.util.Locale;

public class t0202 {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1);

        if (!str1.isEmpty()) {
            System.out.println("isEmpty");
        }

        String str2 = str1;

        System.out.println("equals, str2 = str1 :" + str1.equals(str2));


        System.out.println("to lower case " + str1.toLowerCase(Locale.ROOT));
        System.out.println("to lower case " + str1.toUpperCase(Locale.ROOT));

        System.out.println("charAt 1 : " + str1.charAt(1));
        System.out.println("charAt 2 : " + str1.charAt(2));
        System.out.println("charAt 3 : " + str1.charAt(3));
        System.out.println("charAt 4 : " + str1.charAt(4));

        System.out.println("concat : " + str1.concat(str2));
        System.out.println("contains H : " + str1.contains("H"));
        System.out.println("contains D : " + str1.contains("D"));

        System.out.println("окончание на стринг о :" + str1.endsWith("o"));
        System.out.println("окончание на стринг ф :" + str1.endsWith("ф"));

        System.out.println("длина cтроки str1 " + str1.length());
        System.out.println(str1.toString());


     }
}
