package day04.demo01;

public class diguidemo {
    public static void main(String[] args) {
        System.out.println( sum(5));
    }

    private static int sum(int n) {
        if(n==1){
            return 1;
            };
        return n*sum(n-1);
    }
}
