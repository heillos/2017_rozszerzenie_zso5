import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Potworek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potworek extends Actor
{
    public void klawisze()
    {
         //        jeżeli klawisz right to przesuń w prawo
        if( Greenfoot.isKeyDown("right") ) move( 1 );
       //        jeżeli klawisz left to przesuń w lewo
        if( Greenfoot.isKeyDown("left") ) move( -1 );        
        
        
        if( Greenfoot.isKeyDown("up") ) 
        {
            turn( -90 );
            move( 1 );
            turn( +90 );
        }

        if( Greenfoot.isKeyDown("down") ) 
        {
            turn( -90 );
            move( -1 );
            turn( +90 );
        }
    }
    
    public void zjadanie()
    {
        // tu zaprogramujemy zjadanie
        
        //jeżeli dotykam jakiegokolwiek obiektu klasy Ludzik
        //to usuń dotykany obiekt klasy Ludzik. 
        if( isTouching( Ludzik.class ) ) removeTouching( Ludzik.class );
    }
    /**
     * Act - do whatever the Potworek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       klawisze();
       zjadanie();
 
       
    }    
}
