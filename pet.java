import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pet extends Actor
{
    /**
     * Act - do whatever the pet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         move(-7);
         
         if(getX() <=0)
         {
             resetPet();
         }
    }
    
    public void resetPet()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0)
        {
            setLocation(608, 610);
        }
        else 
        {
            setLocation(600, 600);
        }
    }
}
