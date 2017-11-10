import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kocik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kocik extends Actor
{
    public void ruch()
    {
        if( Greenfoot.isKeyDown("right") ) move(2);
        if( Greenfoot.isKeyDown("left") ) move(-2);    
    }
    /**
     * Act - do whatever the Kocik wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ruch();
    }    
}
