// package project4;

import javax.sound.sampled.Line;

class school{
    public String name;
    private int line;
    public school(String name){
        this.name=name;
        line=0;
    }
    public school(String name,int line){
        this.name=name;
        this.line=line;
    }
    public void setLine(int line){
        this.line=line;
    }
    public int getLine(){
        return this.line;
    }
}

class student{
    public String name;
    public int stuNum;
    private int total;
    private int sport;
    public student(String name,int stuNum){
        this.name=name;
        this.stuNum=stuNum;
        this.total=0;
        this.sport=0;
    }
    public student(String name,int stuNum,int total,int sport){
        this.name=name;
        this.stuNum=stuNum;
        this.total=total;
        this.sport=sport;
    }
    public void setTotal(int total){
        this.total=total;
    }
    public void setSport(int sport){
        this.sport=sport;
    }
    public int getTotal(){
        return this.total;
    }
    public int getSport(){
        return this.sport;
    }
}

class admitSystem{
    public boolean isAdmit(student stu,school sch){
        int stuTotal = stu.getTotal();
        int stuSport = stu.getSport();
        int schLine = sch.getLine();
        if(stuTotal>=schLine||(stuSport>=96&&stuTotal>300)){
            System.out.println("学生"+stu.name+"("+stu.stuNum+")"+"被学校"+sch.name+"录取");
            return true;
        }
        System.out.println("学生"+stu.name+"("+stu.stuNum+")"+"没有被学校"+sch.name+"录取");
        return false;
    }
}

public class demo2 {
    public static void main(String[] args) {
        student stuA = new student("A", 114,440,60);
        student stuB = new student("B", 514);
        stuB.setTotal(350);
        stuB.setSport(99);
        student stuC = new student("C", 1919);
        stuC.setTotal(300);
        stuC.setSport(100);

        school sch1 = new school("foo",400);
        admitSystem adm = new admitSystem();
        adm.isAdmit(stuA, sch1);
        adm.isAdmit(stuB, sch1);
        adm.isAdmit(stuC, sch1);
        

    }
}
