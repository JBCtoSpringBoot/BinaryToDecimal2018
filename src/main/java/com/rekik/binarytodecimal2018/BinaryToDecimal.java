package com.rekik.binarytodecimal2018;

public class BinaryToDecimal {

    public static void main(String[] args) {

        int binary = 1110;
        int decimal = 0;
        int digit =0 ;
        int i = 0;
        while (binary!=0){

            digit=binary % 10;

            decimal+=digit * Math.pow(2, i);
            binary= binary/10;
            i++;
        }

        System.out.println("My decimal is "+decimal);

    }
}
