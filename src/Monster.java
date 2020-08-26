public class Monster extends Enemy
{
    //instance variables
    double height;//in inches
    boolean isFurry;
    String terrain;
    static int countMonsters;
    //constructors
    public Monster(String name, int might, boolean isHostile, double height, boolean isFurry,String terrain)
    {
        super(name, might, isHostile);
       this.height = height;
      this.isFurry= isFurry;
      this.terrain = terrain;
      countMonsters++;
    }// end full constructor

    public Monster()
    {
        super();
        height= 80.2;
        isFurry= false;
        terrain= "land";
        countMonsters++;
    }//end null constructor


    //getters
    public double getHeight()
    {
        return height;
    }//end getHeight

    public boolean getIsFurry()
    {
        return isFurry;
    }//end isFurry

    public String getTerrain()
    {
        return terrain;
    }//end getTerrain

    //setters
    public void setHeight(double height)
    {
        this.height = height;
    }//end setHeight

    public void setIsFurry(boolean isFurry)
    {
        this.isFurry = isFurry;
    }//end setIsFurry

    public void setTerrain(String terrain)
    {
        this.terrain = terrain;
    }//end setTerrain

    //Brain Methods
    public String mightReact()
    {
        if (might < 10)
        {
            return "Weakling!!";
        } //end might<18
        else if (might >= 10 && might < 20)
        {
            return "Be Careful";
        }//end else if
        else
        {
            return "AAAAHHHH!!! RUNNN!!";
        }//end else might>= 20
    }//end mightReact

    public String compareTerrain()
    {
        if (terrain.equalsIgnoreCase("land")) {
            return "Run away";
        } //end if
        else if (terrain.equalsIgnoreCase("water"))
        {
            return "Swim away";
        }//end else if
        else
        {
            return "Fly away";
        }//end else
    }//end compareTerrain


    //toString
    @Override
    public String toString() {
        return "\nThis Monster has:" +
                super.toString()+
                "\n\tHeight = " + height +
                "\n\t isFurry=" + isFurry ;
    }//end toString
}//end class Enemy
