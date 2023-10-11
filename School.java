package com.company;

public class School_pQ1 {

    String name,Address,Branch,grade,bmlId;
    int sub1,sub2,sub3,sub4,roll;
    float per;

    void getData(String n, int r,String a,String b,int s1,int s2,int s3,int s4) {
        name = n;
        Address=a;
        Branch=b;
        roll = r;
        sub1=s1;
        sub2=s2;
        sub3=s3;
        sub4=s4;

        per = (float) ((sub1+sub2+sub3+sub4)/4.0);

        if (per >= 80) {
            grade = "A";
        } else if (per >= 60) {
            grade = "B";
        } else if (per >= 45) {
            grade = "C";
        } else if (per >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    void rollNum(){
        int Id = 100+roll;
        bmlId = "BML "+Id+"2019";
    }

    void putData(){
        System.out.println("Marks in sub1:"+sub1);
        System.out.println("Marks in sub2:"+sub2);
        System.out.println("Marks in sub3:"+sub3);
        System.out.println("Marks in sub4:"+sub4);
        System.out.println("name:"+ name +" roll:"+ roll + " Address:"+ Address + " Branch:"+ Branch + " Grade:" + grade +" BmlId:"+ bmlId +"per:"+per);
    }

    public static void main(String[] args) {
        School_pQ1 ob1= new School_pQ1() ;
        ob1.getData("gopal",4,"Delhi","Cse",64,80,95,68);
        ob1.rollNum();
        ob1.putData();

        School_pQ1 ob2= new School_pQ1() ;
        ob2.getData("siva",12,"Delhi","Cse",45,60,35,20);
        ob2.rollNum();
        ob2.putData();
    }
}
