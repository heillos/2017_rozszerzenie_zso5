import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Adam extends Actor
{
    public void klawisze()
    {
        if( Greenfoot.isKeyDown("d") ) 
        {
            move(1);
        }

        if( Greenfoot.isKeyDown("a") ) 
        {
            move(-1);
        }

        if( Greenfoot.isKeyDown("w") ) 
        {
            turn( -90 );
            move( 1 );
            turn( 90 );
        }        

        if( Greenfoot.isKeyDown("s") ) 
        {
            turn( -90 );
            move( -1 );
            turn( 90 );
        }
    }

    public void zjadanieJablek()
    {
    }
    
    public void act() 
    {
        klawisze();
        zjadanieJablek();
        // Add your action code here.
    }    
}
