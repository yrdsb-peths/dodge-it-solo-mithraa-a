import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Villain extends Actor
{
    boolean atBottom = true;
    
    public void act()
    {
      if(Greenfoot.mouseClicked(null))
      {
          atBottom = !atBottom;
      }
      
      if(atBottom)
      {
          setLocation(620, 620);
      }
      else 
      {
          setLocation(635, 635);
      }
    }
}
