// package java.project2;

public class demo2 {
    public static void main(String[] args) {
        int number = 123456789;
        char[] numbers = Integer.toString(number).toCharArray();
        for (int i = numbers.length-1; i >=0; --i) {
            System.out.println(numbers[i]);
        }     
    }
}
