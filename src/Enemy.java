public abstract class Enemy
{
    String name;
    int might;
    boolean isHostile;
    static int countEnemies= 0;

    public Enemy(String name, int might, boolean isHostile)
    {
        this.name = name;
        this.might = might;
        this.isHostile = isHostile;
        countEnemies++;
    }// end full constructor

    public Enemy()
    {
        this.name = null;
        this.might = 0;
        this.isHostile = true;
        countEnemies++;
    }// end full constructor


    //getters
    public String getName()
    {
        return name;
    }//end getName

    public int getMight()
    {
        return might;
    }// end getMight

    public boolean getIsHostile()
    {
        return  isHostile;
    }//end getIsHostile

    //setters
    public void setName(String name)
    {
        this.name = name;
    } //end setName

    public void setMight(int might)
    {
        this.might = might;
    }//end setMight

    public void setIsHostile(boolean isHostile)
    {
        this.isHostile = isHostile;
    }//end setIsHostile

    public String toString()
    {
        return "\n\tName = " + name +
                "\n\tmight = " + might +
                "\n\tisHostile = " + isHostile;
    } // end toString (there is only one!)
}//end class Enemy
