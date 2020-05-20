package com.company.day01;

import java.util.Scanner;

public class task02_CountJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "java is my fav and java is fun, java is cool";

        //first approach
        int count = 0 ;
        for (int i = 0; i < str.length()-3 ; i++) {
            if (str.substring(i, i+4).equalsIgnoreCase("java"))
                count++;

        }
        System.out.println("count of java "+count);

        // second approach
        int java = 0 ;

        while (str.contains("java")){
            java++;

            str = str.replaceFirst("java", "");
        }
        System.out.println(" count of java2 " + java);
    }
}
