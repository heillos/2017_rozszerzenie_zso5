import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        Adam adam = new Adam();
        addObject(adam,101,336);
        
        Ewa ewa = new Ewa();
        addObject(ewa,533,86);
        
        Wychodek wychodek = new Wychodek();
        addObject(wychodek,74,78);
        
        Drzewo drzewo = new Drzewo();
        addObject(drzewo,521,334);
    }
}
