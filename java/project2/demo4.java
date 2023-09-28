import java.util.Random;
import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner reader =new Scanner(System.in);
        int Question =random.nextInt(101);
        while(true){
            System.out.println("请输入你猜的数");
            int ans = reader.nextInt();
            if(ans>Question){
                System.out.println("猜大了");
            }else if(ans<Question){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了！答案就是："+Question);
                break;
            }
        }

    }
}
