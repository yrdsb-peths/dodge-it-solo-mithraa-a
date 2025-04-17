import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pet extends Actor
{
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
