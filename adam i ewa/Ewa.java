import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ewa extends Actor
{
    int koszyczek = 5; 
    
    public void klawisze()
    {
        if( Greenfoot.isKeyDown("right") ) 
        {
            move(1);
        }

        if( Greenfoot.isKeyDown("left") ) 
        {
            move(-1);
        }

        if( Greenfoot.isKeyDown("up") ) 
        {
            turn( -90 );
            move( 1 );
            turn( 90 );
        }        

        if( Greenfoot.isKeyDown("down") ) 
        {
            turn( -90 );
            move( -1 );
            turn( 90 );
        }
        
        if( Greenfoot.isKeyDown("j") ) 
        { 
            String ile = Greenfoot.ask("Ile mam jabłek dodać?");
            koszyczek = Integer.parseInt(ile);
        }
        
        
    }

    private void stawianieJablek()
    {
        // tu będzie stawianie jabłek
        if( Greenfoot.isKeyDown("space") && 
            !this.isTouching(Jablko.class) && 
            koszyczek > 0)
        {
            int x = this.getX();
            int y = this.getY();

            Jablko jablko = new Jablko();
            World world = this.getWorld();
            world.addObject( jablko, x , y);
            koszyczek--; // zmniejsz koszyczek o 1
        }
    }        

    private void zrywanieJablek()
    {
        if( this.isTouching( Drzewo.class ) ) 
        {
            koszyczek = 5;
        }
        
       
    }
    
    public void act() 
    {
        klawisze();
        stawianieJablek();
        zrywanieJablek();
    }    
}











