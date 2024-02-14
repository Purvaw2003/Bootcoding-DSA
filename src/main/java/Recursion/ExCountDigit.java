package Recursion;

public class ExCountDigit {
    public static void main(String[] args) {
        System.out.println(digitcount(1225));
    }public static int digitcount(int n){
       if (n==1){
           return 1;
       }

    return 1+digitcount(n/10);
}}
