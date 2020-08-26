public class Dragon extends Enemy
{
    //instance variables
    boolean hasFire;
    String fireColor;
    double wingspan;
    static int countDragons;

    //constructors
    public Dragon(String name, int might, boolean isHostile, boolean hasFire, String fireColor, double wingspan)
    {
        super(name, might, isHostile);
        this.hasFire = hasFire;
        this.fireColor = fireColor;
        this.wingspan = validateWingspan(wingspan);
        countDragons++;
    }// end full constructor

    public Dragon()
    {
        super();
        hasFire = false;
        fireColor = "green";
        wingspan = 0;
        countDragons++;
    }//end null constructor


    //getters
    public boolean getHasFire()
    {
        return hasFire;
    }//end getHasFire

    public String getFireColor()
    {
        return fireColor;
    }//end getHasFireColor

    public double getWingspan()
    {
        return wingspan;
    }//end getWingspan


    //setters
    public void setHasFire(boolean hasFire)
    {
        this.hasFire = hasFire;
    }//end setHasFire

    public void setFireColor(String fireColor)
    {
        this.fireColor = fireColor;
    }//setFireColor

    public void setWingspan(double wingspan)
    {
        this.wingspan = wingspan;
    }//end setWingspan


    //Brain Methods
    public String actionsToUndertake()
    {
        if (hasFire==true)
        {
            return "AAHHH!!! GET INTO A BODY OF WATER OR YOU WILL BE ROASTED!!!";
        }//end if
        else
        {
            return "Be careful of "+getName()+ "'s bite. Thankfully you don't need to worry about being burned. :)";
        }//end else
    }//end actionsToUndertake

    //Data Validation
    public double validateWingspan(double wingspan)
    {
        if (wingspan<0)
        {
            System.out.println("You can't have negative wings.");
           while (wingspan<0)
           {
               wingspan++;
           }//end while
           System.out.println(name+"'s wingspan is now: "+ wingspan);
        }//end if
        return wingspan;
    }//end validate wingspan entry

    //toString
    @Override
    public String toString()
    {
        return "\nThis Dragon has:" + super.toString() +
                "\n\thasFire = " + hasFire
                + "\n\tFire Color = " + fireColor
                +"\n\t Wingspan= " + wingspan;
    } // end toString (there is only one!)
}//end dragon class
