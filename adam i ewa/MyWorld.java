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

    public void act()
    {
        if( Greenfoot.isKeyDown("k") )
        {
            //zapytaj
            String odp = Greenfoot.ask("Ile węży?");
            int ile = Integer.parseInt( odp );

            int szerokosc = getWidth();
            int wysokosc = getHeight();

            for( int i=0; i < ile; i++)
            {
                int x = Greenfoot.getRandomNumber( szerokosc );
                int y = Greenfoot.getRandomNumber( wysokosc );
                Snake snake = new Snake(); 
                addObject( snake, x, y );
                // podczas gdy  wąż dotyka ewę, to przesun go w inne miejsce
                while( snake.dotykaEwe() || snake.dotykaAdama())
                {
                    x = Greenfoot.getRandomNumber( szerokosc );
                    y = Greenfoot.getRandomNumber( wysokosc );
                    snake.setLocation(x, y);
                }
                
            }
        }

    }
}