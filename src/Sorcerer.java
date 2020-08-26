public class Sorcerer
{
    //instance variables
    boolean hasWand;
    boolean hasStaff;
    String name;
    int age;
    double distanceOfSpells;// how far can the Sorcerer cast a spell (in feet)
    static int countSorcerers;

    // constructors
    public Sorcerer(String name, boolean hasWand, boolean hasStaff, int age, double distanceOfSpells)
    {
        this.name = name;
        this.hasWand= hasWand;
        this.hasStaff= hasStaff;
        this.age= age;
        this.distanceOfSpells= verifyDistanceOfSpells(distanceOfSpells);
        countSorcerers++;
    }//end full constructor

    public Sorcerer()
    {
        hasWand=false;
        hasStaff= false;
        name= "null";
        age= 30;
        distanceOfSpells= 5.0;
        countSorcerers++;
    }//end null constructor


    //getters
    public int getAge()
    {
        return age;
    }//end getAge

    public String getName()
    {
        return name;
    }//end getName

    public boolean getHasStaff()
    {
        return hasStaff;
    }//end getHasStaff

    public boolean getHasWand()
    {
        return hasWand;
    }//end getHasWand

    public double getDistanceOfSpells()
    {
        return distanceOfSpells;
    }//end getDistanceOfSpell


    //setters
    public void setName(String name)
    {
        this.name = name;
    }//end setName

    public void setAge(int age)
    {
        this.age = age;
    }//end setAge

    public void setHasWand(boolean hasWand)
    {
        this.hasWand = hasWand;
    }//end setHasWand

    public void setHasStaff(boolean hasStaff)
    {
        this.hasStaff = hasStaff;
    }//end setHasStaff

    public void setDistanceOfSpells(double distanceOfSpells)
    {
        this.distanceOfSpells = distanceOfSpells;
    }//end setDistanceOfSpells


    //Brain Methods
    public String toAttackOrNot()
    {
        if(hasStaff==true&& hasWand==false)
        {
            return "You can't cast spells...so WACK THEN ENEMY!!!";
        }//end if
        else if(hasWand==true && hasStaff==false)
        {
            return "Cast a spell to attack the Enemy";
        }//end else if hasWand == true & hasStaff==false
        else if (hasWand==true && hasStaff==true)
        {
            return "Cast a spell, then...WACK THE ENEMY!!!";
        }//end else both true
        else
        {
            return "RUNNN!!!! YOU HAVE NO WEAPON!!";
        }
    }//end toAttackOrNot

    //data validation
    public double verifyDistanceOfSpells(double distanceOfSpells)
    {
        if(distanceOfSpells<=0)
        {
            System.out.println("You can't have a distanceOfSpells be less than or equal to zero.");
            while (distanceOfSpells<=0)
            {
                distanceOfSpells++;
            }//end while loop
            System.out.println(name +"'s distanceOfSpells is now: "+ distanceOfSpells);
        }//end if

        return distanceOfSpells;
    }//end verifyDistanceOfSpells


    //toString
    @Override
    public String toString()
    {
        return "\nThis Sorcerer has:\n\tName: " + name +
                "\n\thasWand= " + hasWand +
                "\n\thasStaff= " + hasStaff +
                "\n\tage= " + age +
                "\n\tdistanceOfSpells= " + distanceOfSpells +" feet";
    }//end toString
}//end class Sorcerer
