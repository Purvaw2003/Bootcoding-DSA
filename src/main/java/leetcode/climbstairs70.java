package leetcode;

public class climbstairs70 {
    public static int climbStairs(int n) {
        int pre=1;
        int curr=1;
        int temp=0;
        for (int i=1;i<n;i++){
            temp=curr;
            curr=pre+curr;
            pre=temp;
        }
        return curr;
    }


    public static void main(String[] args) {
        int n=2;
        System.out.println(climbstairs70.climbStairs(n));

    }
}
