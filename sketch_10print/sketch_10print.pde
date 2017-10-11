int rozmiar;
int x, y;

void setup()
{
  frameRate( 50 );
  size(640, 480);
  rozmiar = 15;
  x = 0;
  y = 0;
}


void draw() 
{
  int los = (int)random(0, 101);
  if (los >= 100)
  {
    line( x, y, x+rozmiar, y+rozmiar );
  } else {
    line( x, y+rozmiar, x+rozmiar, y );
  }

  x = x + rozmiar;
  if ( x >= width )
  {
    x = 0;
    y = y + rozmiar;
  }
}