public class demoEx1 {
    public static void main(String[] args) {
        char[] lowerChar = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        printCArray(lowerChar);
        printCArray_string(upperChar);
    }    
    private static void printCArray_string(String upperChar) {
        for(int i=0;i<upperChar.length();i++)System.out.println(upperChar.charAt(i));
    }
    public static void printCArray(char[] cArr) {
        for(int i = 0; i< cArr.length;i++ )System.out.println(cArr[i]);
    }
}
