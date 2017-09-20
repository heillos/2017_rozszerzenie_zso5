import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ludzik extends Actor
{
    int kierunek = 1;
    
    
    public void act() 
    {
        // Add your action code here.
        move( kierunek );
        
        //jeżeli dotykasz ściany, to zmień kierunek
        //na przeciwny!
        if( isAtEdge() ) kierunek = kierunek * (-1);
    }    
}
