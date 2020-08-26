public class Slime extends Enemy
{
    //instance variables
    String color;
    double absorptionSpeed;//inches per minute
    static int countSlimes;

    //constructors
    public Slime(String name, int might, boolean isHostile, String color, double absorptionSpeed)
    {
        super(name, might, isHostile);
        this.color = color;
        this.absorptionSpeed = validateAbsorptionSpeed(absorptionSpeed);
        countSlimes++;
    }// end full constructor

    public Slime()
    {
        super();
        color = "green";
        absorptionSpeed = 0.0;
        countSlimes++;
    }//end null constructor

    //getters
    public String getColor()
    {
        return color;
    }//end getColor

    public double getAbsorptionSpeed()
    {
        return absorptionSpeed;
    }//end getAbsorptionSpeed


    //setters
    public void setColor(String color)
    {
        this.color = color;
    }//end setColor

    public void setAbsorptionSpeed(double absorptionSpeed)
    {
        this.absorptionSpeed = absorptionSpeed;
    }//end setAbsorptionSpeed

    //Brain Methods
    public double validateAbsorptionSpeed(double absorptionSpeed)
    {
        if (absorptionSpeed<=0)
        {
            System.out.println("You can't have a negative absorption speed.");
           while (absorptionSpeed<0)
           {
               absorptionSpeed++;
           }//end while loop
            System.out.println(getName()+ "'s new speed is:\t"+ absorptionSpeed);
        }//end if
        return absorptionSpeed;
    }//end validate absorption speed entry

    public String determineAction()
    {
        if(absorptionSpeed< 10.0)
        {
            return ("No need to stress. "+ getName() +" has no chance at absorbing you before you can get away.");
        }//end if
        else if (absorptionSpeed<= 20)
        {
           return ("Uhhh you might want to be careful. "+ getName()+ " can absorb you if you aren't careful enough.");
        }//end else if
        else
        {
            return ("RUUUNNNNNN!!! "+ getName()+ " is going to absorb you and eat you in the blink of an eye.");
        }//end else

    }//end determineAction

    //toString
    @Override
    public String toString()
    {
        return "\nThis Slime has: " + super.toString() +
                "\n\tColor = " + color
                + "\n\tAbsorption Speed = "+ absorptionSpeed;
    }//end toString
}//end Slime class
