package day04.demo01;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
         char chars[][];
         chars =new char[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入第"+(i+1)+"字符串");
             String str = sc.next();
            if(str.length()!=3){
                System.out.println("你输入的字符长度不符合条件限制");
                i--;
                continue;
            }
             chars[i]=str.toCharArray();
        }

        for (int i = 2; i >=0 ; i--) {
            for (int j = 2; j >=0 ; j--) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }
}
