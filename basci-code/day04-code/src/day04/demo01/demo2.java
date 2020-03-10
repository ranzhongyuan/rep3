package day04.demo01;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
       // 定义一个二维数组接受输入的字符
       char[][] chars =new char[3][10];
        System.out.println("请输入字符串");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            String str = sc.nextLine();
            //定义正则表达式只能含有A和B
             String reg="[A-B]*";
            boolean b=str.matches(reg);
            //如果不满足正则表达式或者如果长度大于了10或者长度小于5，就重新输入
            if((!b)||str.length()>10||str.length()<=5){
                 i--;
                if(!b){
                System.out.println("请输入的字符不满足格式");
                }else {
                    System.out.println("请输入的字符数字长度不满足条件");
                }
                continue;
            }
            //将字符串转换成字符数组存储
            chars[i]=str.toCharArray();
        }
        for (int i = 0; i < 3; i++) {
            //然后又把字符数组转换成字符串，并判断是否包含ababa得到返回值
            if(String.valueOf(chars[i]).indexOf("ABABA")>=0){
                System.out.println(String.valueOf(chars[i]).indexOf("ABABA"));
            }else {
                    System.out.println("没有包含ABABA字段");
            }
        }

    }


}