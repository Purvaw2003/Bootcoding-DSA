package Recursion;

public class fibEx3 {
    public static void main(String[] args) {

        System.out.println(print(3));
    }public static int print(int n){
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }
        return print(n-2)+print(n-1);
    }
}
