package com.htc.Hadoopjava.day1;

public class PrintAlphabets {
    public static void main(String[] args){
        //print small letters alphabets
        for(char i = 'a'; i <='z'; i++){
            System.out.print(i);
        }
        
        System.out.println();
        
        //print captial letters alphabets
        for(char i = 'A'; i <='Z'; i++){
            System.out.print(i);
        }
    }
}

Output is as below.

abcdefghijklmnopqrstuvwxyz
ABCDEFGHIJKLMNOPQRSTUVWXYZ
