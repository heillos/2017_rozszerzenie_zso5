import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Adam extends Actor
{
    int miejsceWBrzuszku = 5 ;

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
        if(Greenfoot.isKeyDown("p")) 
        {
            String odpowiedz = Greenfoot.ask("Czy na pewno" ) ;
        }   
    }

    public void zjadanieJablek()
    {
        if( this.isTouching( Jablko.class ) &&
        miejsceWBrzuszku > 0)
        {
            this.removeTouching( Jablko.class ) ; 
            miejsceWBrzuszku--;
        }
    }

    public void wychodek()
    {
        if( this.isTouching( Wychodek.class ) )
        {
            this.miejsceWBrzuszku = 5;
        }
    }

    public void act() 
    {
        klawisze();
        zjadanieJablek();
        wychodek();
        // Add your action code here.
    }    
}
