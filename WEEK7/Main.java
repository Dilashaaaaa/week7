package WEEK7;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
    //classname variable= new classname();
    student s1=new student();
    s1.collegeID=1011;
    s1.name="Dilasha";
    s1.age=19;
    
    s1.study();
System.out.println(s1.collegeID);
System.out.println(s1.name);
System.out.println(s1.age);
    
    
    student s2=new student();
    s2.collegeID=2059;
    s2.name="Bishruti";
    s2.age=19;
    
System.out.println(s2.collegeID);
System.out.println(s2.name);
System.out.println(s2.age);
    

    student s3=new student();
    s3.collegeID=2079;
    s3.name="shruti";
    s3.age=19;
    
System.out.println(s3.collegeID);
System.out.println(s3.name);
System.out.println(s3.age);
    
    CAR c1=new CAR();
    c1.brand="Mercedes";
    c1.color="black";
    c1.model="G-Wagon";
    c1.price=1000000;
    c1.drive();
    System.out.println(c1.brand);
System.out.println(c1.color);
System.out.println(c1.model);
System.out.println(c1.price);
    
    }
}