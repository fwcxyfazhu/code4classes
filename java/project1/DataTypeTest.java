import java.util.Scanner;

public class DataTypeTest {
    public static void test1() {
        int no = (11+20)*3/5;
        System.out.println("no="+no);
        no++;
        System.out.println("no="+no);
        boolean bool = false;
        bool = true && !bool;
        System.out.println("bool="+bool);
        byte bValue = 0x10;
        System.out.println("bValue="+bValue);
        bool=(no>bValue);
        System.out.println("bool="+bool);
    }
    public static void test2() {
        double r= 3.0;
        double pi =3.14;
        double D =2*pi*r ;
        double S =pi*r*r;
        System.out.println("半径为"+r+"的圆，周长是"+D+"，面积是"+S);
    }
    public static void test3(){
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入直角三角形的定底：");
        double base = reader.nextDouble();
        System.out.println("请输入高：");
        double height= reader.nextDouble();
        double lenght = Math.sqrt(base*base + height*height);
        System.out.println("直角三角形的斜边长为"+lenght);
    }
    public static void test4_1() {
        int amount = 100;
        double price = 12.5;
        System.out.println("数量为"+amount+"单价为"+price+"的货品总价为："+sumPrice(amount, price));
    }
    public static void test4_2(){
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入数量");
        int amount = reader.nextInt();
        System.out.println("请输入单价");
        double price = reader.nextDouble();
        System.out.println("数量为"+amount+"单价为"+price+"的货品总价为："+sumPrice(amount, price));   
    }
    private static double sumPrice(int amount, double price){
        return (double)amount*price;
    }
    public static void main(String[] args) {
        System.out.println("第一题：");
        test1();
        System.out.println("第二题：");
        test2();
        System.out.println("第三题：");
        test3();
        System.out.println("第四题：");
        test4_1();
        test4_2();
    }
}