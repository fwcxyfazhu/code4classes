import java.util.Arrays;

public class demoEx2 {
    public static void main(String[] args) {
        int[] arr_a={1,2,3,4,5,6,7,8,9,10,11,12};
        int[] arr_b= Arrays.copyOf(arr_a, arr_a.length);
        int[] arr_c = Arrays.copyOfRange(arr_a, arr_a.length-4, arr_a.length);
        System.out.println("输出a数组");
        printIArray(arr_a);
        System.out.println("输出b数组");
        printIArray(arr_b);
        System.out.println("输出c数组");
        printIArray(arr_c);
    }    
    public static void printIArray(int[] iArr) {
        for(int i = 0; i< iArr.length;i++ )System.out.println(iArr[i]);
    }

}
