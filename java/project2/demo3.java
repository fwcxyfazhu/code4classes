// package java.project2;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        int rabbit=0;
        int chicken;
        int f,h;
        h=8;
        f=3*2+5*4;
        System.out.println("h="+h+",f="+f);

        // Scanner reader =new Scanner(System.in);
        // System.out.println("请入f的值（n>0）:");
        // f=reader.nextInt();
        // if (f<=0) {
        //     System.out.println("输入错误，程序退出");
        //     System.exit(-1);
        // }System.out.println("请入h的值（n>0）:");
        // h=reader.nextInt();
        // if (h<=0) {
        //     System.out.println("输入错误，程序退出");
        //     System.exit(-1);
        // }
        for (chicken=0; chicken <= h; chicken++) {
            rabbit=h-chicken;
            System.out.println(rabbit*4+","+chicken*2);
            if((2*chicken+4*rabbit)==f)break;
        }
        System.out.println("兔子有："+rabbit+"只"); 
        System.out.println("鸡有："+chicken+"只");
    }
}
//h=5,f=3*2+2*4