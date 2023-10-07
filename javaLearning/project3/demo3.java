import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        String[] mouths = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("请输入数字1~12:");
        Scanner reader = new Scanner(System.in);
        int input=reader.nextInt();
        if(input>12||input<1){
            System.out.println("输入有误");
            System.exit(-1);
        }
        System.out.println(mouths[input-1]);
    }
}
