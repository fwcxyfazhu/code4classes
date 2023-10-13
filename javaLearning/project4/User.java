// package project4;

class Vehicle{
    public double speed = 0;
    private int power = 0;
    public Vehicle(double speed){
        this.speed=speed;
    }
    public void speedUP(int s){
        this.speed+=s*power;
    }
    public void speedDOWN(int s){
        if(speed-s>=0){this.speed-=s;}
        else{
            this.speed=0;
        }
        
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }

}

public class User {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(0);
        car.setPower(10);
        System.out.println("setpower:"+car.getPower()+"\nspeed:"+car.speed);
        car.speedUP(1);
        System.out.println("speedUP>>speed:"+car.speed);
        car.speedDOWN(5);
        System.out.println("speedDOWN>>speed:"+car.speed);
        car.speedDOWN(10);
        System.out.println("speedDown>>speed:"+car.speed);
        
    }
}
