package workshop7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
    book b1=new book();
    b1.title="Harry Potter";
    b1.author="JK Rowling";
    b1.price=750;
    
    b1.read();
    System.out.println(b1.title);
    System.out.println(b1.author);
    System.out.println(b1.price);
    
    book b2=new book();
    b2.title="Wimpy kid ";
    b2.author="Jeff Kinney";
    b2.price=750;
    
    b2.read();
    System.out.println(b2.title);
    System.out.println(b2.author);
    System.out.println(b2.price);
    
    System.out.println();
    
    Rectangle r1=new Rectangle();
    r1.length = 5.5;
    r1.breadth=6;
    
    
    System.out.println(r1.length);
    System.out.println(r1.breadth);
    r1.area();
    
    Rectangle r2=new Rectangle();
    r2.length = 5;
    r2.breadth=6.6;
    
   
    System.out.println(r2.length);
    System.out.println(r2.breadth);
     r2.area();
     
     System.out.println();
     Employee e1=new Employee();
     e1.id=123;
     e1.name="Doma";
     e1.salary=600000;
     
     System.out.println(e1.id);
      System.out.println(e1.name);
       System.out.println(e1.salary);
       
System.out.println();         
     Employee e2=new Employee();
     e2.id=1233;
     e2.name="Dma";
     e2.salary=60000;
     
     System.out.println(e2.id);
      System.out.println(e2.name);
       System.out.println(e2.salary);
       
       System.out.println();
         
     Employee e3=new Employee();
     e3.id=12333;
     e3.name="Dom";
     e3.salary=6000;
     
     System.out.println(e3.id);
      System.out.println(e3.name);
       System.out.println(e3.salary);
       
       if(e1.salary>e2.salary && e1.salary>e2.salary)
       {
        System.out.println(e1.salary+ "e1's salary is Highest");
        }
        else if(e2.salary>e3.salary)
        {
            System.out.println(e2.salary+ "e2's salary is Highest");
        }
        else
        {
        System.out.println(e3.salary+ "e3's salary is Highest");
        }
     
        System.out.println();
        
        laptop l1= new laptop("Asus", 12, 80000);
        laptop l2= new laptop("Dell", 16 ,90000);
        laptop l3= new laptop("HP", 8 , 70000);
        
        l1.display();
        l2.display();
        l3.display();
    
        System.out.println();
         
        mobile m1=new mobile("Apple",500);
        mobile m2=new mobile("Samsung" ,400);
        mobile m3=new mobile("one plus" ,300);
        m1.isAffordable();
        m2.isAffordable();
        m3.isAffordable();
        
        Result student1 = new Result(80, 75, 90);
        Result student2 = new Result(65, 70, 85);
        student1.displayResult();
        student2.displayResult();
         
        BankAccount account1 = new BankAccount(101, "Ram", 5000);
        BankAccount account2 = new BankAccount(102, "Sita", 3000);
        account1.deposit(2000);
        account1.withdraw(1500);

        account2.deposit(1000);
        account2.withdraw(500);

        account1.displayBalance();
        account2.displayBalance();
}    
}