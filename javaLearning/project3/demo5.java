public class demo5 {
    public static void main(String[] args) {
        double x =10;
        System.out.println(pow(x, -5));
    }
    public static double pow(double x, int n){
        if(n == 0)return 1.0;
        if(n<0){
            return 1.0 / (x*pow(x, -n-1));
        }
        return x*pow(x, n-1);
    }
}
