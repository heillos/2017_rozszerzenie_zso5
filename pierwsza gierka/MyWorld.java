import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ludzik ludzik = new Ludzik();
        addObject(ludzik,84,98);
        Ludzik ludzik2 = new Ludzik();
        addObject(ludzik2,210,233);
        Ludzik ludzik3 = new Ludzik();
        addObject(ludzik3,385,361);
        Potworek potworek = new Potworek();
        addObject(potworek,96,314);
    }
}
