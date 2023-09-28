// package java.project2;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int x_int;
        int n;
        int ans=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("请入x的值（0~9）:");
        x_int=reader.nextInt();
        if(x_int>9||x_int<0){
            System.out.println("输入错误，程序退出");
            System.exit(-1);
        }
        String x_str=Integer.toString(x_int);
        System.out.println("请入n的值（n>0）:");
        n=reader.nextInt();
        if (n<=0) {
            System.out.println("输入错误，程序退出");
            System.exit(-1);
        }
        String add ="";
        for (int i = 0; i < n; i++) { 
            add+=x_str;          
            ans=ans+Integer.parseInt(add);
            System.out.println(add);
        }
        System.out.println(ans);
    }
}