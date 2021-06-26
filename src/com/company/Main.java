package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(passPhrase(str));
    }

    public static String passPhrase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch++;
                if(i%2 != 0){
                    result.append(Character.toLowerCase(ch));
                }else {
                    result.append(ch);

                }

                //result = new StringBuilder(str.replace(str.charAt(i), ch));

            } else {
                if (Character.isDigit(ch)) {
                    result.append(9 - Integer.parseInt(String.valueOf(ch)));
                } else {
                    result.append(ch);
                }
            }
        }
        return result.reverse().toString();

    }
}
