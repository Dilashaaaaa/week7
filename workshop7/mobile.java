package workshop7;


/**
 * Write a description of class mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mobile
{
    String brand;
    int price;
    public mobile(String brand, int price )
    {
        this.brand=brand; //this.brand="Asus";
        this.price= price;
    }
    void isAffordable()
    {
    if (price<20000)
    {
    System.out.println(brand+"is affordable");
    }
    
    }
}