package com.company.day01;

public class task05_SplitAndAddNumbers {

    public static void main(String[] args) {

        String input = "jav45ai15sgre1at82";
        int sum = 0 ;
        String num = "";

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                num += input.charAt(i);

                if (i == input.length()-1  ||!Character.isDigit(input.charAt(i+1))) {
                    sum =+ Integer.parseInt(num);
                    num = "";
                }
            }

        }
        System.out.println(sum);
    }
}
