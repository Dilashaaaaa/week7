package workshop7;

public class laptop
{
    String brand;
    int RAM;
    double price;
    
    public laptop(String brand, int ra, double pr )
    {
        this.brand=brand; //this.brand="Asus";
        this.RAM= ra;
        this.price= pr;
    }
    // constructor is need to write all the values of object in one singel line
   void display() {
       if(RAM>8)
       {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Price: Rs. " + price);
    
        }
    }

}