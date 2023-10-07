import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        System.out.println(isPrimeNumber(reader.nextInt()));
    }
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false; // 小于等于1的数字不是素数
        }   
        if (num <= 3) {
            return true; // 2和3是素数
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // 能被2或3整除的数字不是素数
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false; // 能被i或(i+2)整除的数字不是素数
            }
        }
        return true; // 其他情况都是素数
    }
}
