package com.company.day01;public class task03_Palindrome {    public static void main(String[] args) {        String str = "abcdcba";        boolean check = true;        for (int i = 0; i < str.length(); i++) {            if (str.charAt(i) != str.charAt(str.length()-1-i)){                check = false;                break;            }        }        if (check) {            System.out.println("Palindrome");        }else {            System.out.println("Palindrome");        }       //  System.out.println(check ? "Palindrome " : "Not Palindrome");//    }}