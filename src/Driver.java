import java.util.ArrayList;
import java.util.Arrays;

public class Driver
{
    public static void main(String[] args)
    {
        //create objects
        Dragon happy = new Dragon("Happy", 30, false, true,"red",-5.0);
        Dragon nobody = new Dragon();

        Slime slimy = new Slime("Slimy",10,false,"purple", -1.0);
        Slime meanie= new Slime();

        Monster ogre = new Monster("OgreBob", 25, true, 90.8,true, "water");
        Monster growl= new Monster();

        Sorcerer harryPotter = new Sorcerer("Harry Potter", true, false, 40, -30);
        Sorcerer irrelevant = new Sorcerer();

        //called toString
        System.out.println(happy.toString());
        System.out.println(nobody.toString());
        System.out.println();

        System.out.println(slimy.toString());
        System.out.println(meanie.toString());
        System.out.println();

        System.out.println(ogre.toString());
        System.out.println(growl.toString());
        System.out.println();

        System.out.println(harryPotter.toString());
        System.out.println(irrelevant.toString());
        System.out.println();

        // test getters and setters
        nobody.setName("Somebody");
        nobody.setMight(30);
        nobody.setIsHostile(false);
        nobody.setHasFire(true);
        nobody.setFireColor("red");
        nobody.setWingspan(60.0);

        meanie.setColor("Purple");
        meanie.setName("Meanie");
        meanie.setAbsorptionSpeed(20.0);

        growl.setHeight(90.0);
        growl.setIsFurry(true);
        growl.setTerrain("air");

        irrelevant.setName("Relevant");
        irrelevant.setAge(20);
        irrelevant.setHasWand(true);
        irrelevant.setHasStaff(true);
        irrelevant.setDistanceOfSpells(50.0);

        System.out.println("Nobody is now called: " +nobody.getName());         // ---|
        System.out.println("\t\tMight is now: "+happy.getMight());              //    |  Uses Enemy (parent class) getters
        System.out.println("\t\t isHostile is now: "+ happy.getIsHostile());    //----|
        System.out.println("\t\thasFire is now: "+nobody.getHasFire());      //----|
        System.out.println("\t\tFire color is now: "+nobody.getFireColor()); //    | Uses Dragon class getters
        System.out.println("\t\tWingspan is now: "+nobody.getWingspan());    //----|
        System.out.println();

        System.out.println("Meanie:\n\t\tColor is now: "+ meanie.getColor());               //----|
        System.out.println("\t\tAbsorption Speed is now: "+meanie.getAbsorptionSpeed());    //----| uses Slime class getters
        System.out.println();

        System.out.println("growl:\n\t\t Height is now: "+ growl.getHeight());  //----|
        System.out.println("\t\t isFurry is now: "+ growl.getIsFurry());        //----|uses Monster class getters
        System.out.println("\t\t Terrain is now: "+ growl.getTerrain());        //----|
        System.out.println();

        System.out.println("Irrelevant is now called: "+irrelevant.getName());                     //------|
        System.out.println("\t\tAge is now: " + irrelevant.getAge());                              //      |
        System.out.println("\t\thasWand is now: "+ irrelevant.getHasWand());                       //      | uses Sorcerer getters
        System.out.println("\t\thasStaff is now: "+ irrelevant.getHasStaff());                     //      |
        System.out.println("\t\tDistance of Spells is now: "+ irrelevant.getDistanceOfSpells());   //------|
        System.out.println();

        //Brain Methods Test
        /*dragons: happy, nobody
        Slime: slimy, meanie
        Monster: ogre, growl
        Sorcerer: harryPotter, irrelevant
        */
        nobody.setHasFire(false);
        System.out.println(happy.getName()+":\n\t\t"+ happy.actionsToUndertake());
        System.out.println(nobody.getName()+ ":\n\t\t"+nobody.actionsToUndertake());
        System.out.println();

        System.out.println("Slimy:\n\t\t"+slimy.determineAction());
        System.out.println("Meanie:\n\t\t" +meanie.determineAction());
        slimy.setAbsorptionSpeed(30.0);
        System.out.println("Slimy now has an absorption rate of: "+ slimy.getAbsorptionSpeed());
        System.out.println("\t\t"+slimy.determineAction());
        System.out.println();

        growl.setMight(9);
        System.out.println("Ogre: \n\t\t"+ ogre.mightReact());
        System.out.println("\t\t"+ogre.compareTerrain());
        System.out.println("Growl: \n\t\t"+ growl.mightReact());
        System.out.println("\t\t"+growl.compareTerrain());
        ogre.setMight(15);
        ogre.setTerrain("land");
        System.out.println("Ogre now has a might of: "+ ogre.getMight()+" and a terrain of: "+ ogre.getTerrain()+"\n\t\t"+ ogre.mightReact());
        System.out.println("\t\t"+ ogre.compareTerrain());
        System.out.println();

        System.out.println(harryPotter.getName()+":\n\t\t"+ harryPotter.toAttackOrNot());
        System.out.println(irrelevant.getName()+":\n\t\t"+irrelevant.toAttackOrNot());
        harryPotter.setHasStaff(false);
        System.out.println(harryPotter.getName()+" now has no staff\n\t\t"+ harryPotter.toAttackOrNot());

        //Output static counts
        System.out.println("Number of Enemies:" + Enemy.countEnemies);
        System.out.println("Number of Dragons: " + Dragon.countDragons);
        System.out.println("Number of Slimes: "+ Slime.countSlimes);
        System.out.println("Number of Monsters: "+ Monster.countMonsters);
        System.out.println("Number of Sorcerers: "+ Sorcerer.countSorcerers);

        //Create and output ArrayList
        System.out.printf("\nWATCH OUT, there are %d enemies attacking! %n%n", Enemy.countEnemies);
        ArrayList<Enemy> enemyArrayList= new ArrayList<>();
        enemyArrayList.add(happy);
        enemyArrayList.add(nobody);
        enemyArrayList.add(ogre);
        enemyArrayList.add(growl);
        enemyArrayList.add(slimy);
        enemyArrayList.add(meanie);

        for (int i = 0; i < enemyArrayList.size() ; i++)
        {
            System.out.println(enemyArrayList.get(i));
        }//end for loop

    }// end main method
}//end driver class