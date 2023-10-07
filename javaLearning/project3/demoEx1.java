public class demoEx1 {
    public static void main(String[] args) {
        char[] lowerChar = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] upperChar = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        printCArray(lowerChar);
        printCArray(upperChar);
    }    
    public static void printCArray(char[] cArr) {
        for(int i = 0; i< cArr.length;i++ )System.out.println(cArr[i]);
    }
}
