package com.company;

public class Main {

    public static String playPass(String s, int n) {
        StringBuilder result = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                if(ch+n > 90){
                    //c = (char) (ch - 24);
                    int lastLetter = 64;
                    for(int j=0;j<n;j++){
                        if(ch == 90){
                            lastLetter++;
                        }else{
                            ch++;
                        }
                    }
                    c = (char) lastLetter;
                }else{
                    c = (char) (ch + n);
                }
                if (i % 2 != 0) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            } else{
            if (Character.isDigit(ch)) {
                result.append(57 - ch);
            } else {
                result.append(ch);
            }
        }
    }
        return result.reverse().toString();

}

    public static void main(String[] args) {
        System.out.println(playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
        //4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO
        //!!!vPz fWpM J
    }

}
