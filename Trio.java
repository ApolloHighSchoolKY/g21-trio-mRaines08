//Write your answer here
public class Trio //implements MenuItem
{
    //why did we need this? I assumed these were created and instantiated in other classes in a runable file.
    //Sandwhich sandwhich;
    //Salad salad;
    //Drink drink;

    private String name;
    private double price;

    public Trio(Sandwhich sandy, Salad sal, drink beverage)
    {
        //the varibles are not needed here, the name varibel can be put under the getName meathod and same for pirce
        name = "" + sandy.getName() + " / " + sal.getName() + " / " + beverage.getName() + " Trio";

        if(sal.getPrice() > sandy.getPrice() && beverage.getPrice() > sandy.getPrice())
            price = sal.getPrice() + beverage.getPrice();
        else if(sandy.getPrice() > sal.getPrice() && beverage.getPrice() > sal.getPrice())
            price = sandy.getPrice() + beverage.getPrice();
        else
            price = sandy.getPrice() + sal.getPrice();
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        return "The trio " + getName() + " costs $" + getPrice() + ".";
    }
}