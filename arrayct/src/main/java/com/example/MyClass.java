package com.example;

public class MyClass {

    public static void main(String[] args) {

        String[] [] states = new String[3] [2];
        states[0][0] = " Pants I own ";
        states [0] [1] = "12";

        states[1][0] = " Shirts I own ";
        states [1] [1] = "24";

        states[2][0] = " Pairs of Socks I own ";
        states [2] [1] = "48";

        for (int i = 0; i< states.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < states[i].length; j++){
                if(j==0){
                    sb.append("The Number of");
                }
                else {
                    sb.append(" is ");
                }
                sb.append(states[i] [j]);

            }
            System.out.println(sb);
        }
    }
}



