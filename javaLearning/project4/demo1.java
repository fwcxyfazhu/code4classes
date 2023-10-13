// package project4
/**
 * dog
 *
 */
class dog {
    String name;
    String color;
    int age;
    public dog(){
        name="dogge";
        color="white";
        age=1;
    }
    public void show(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
    }
    
}
public class demo1 {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.show();
    }
}