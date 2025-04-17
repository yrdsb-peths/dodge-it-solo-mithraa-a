import greenfoot.*;

public class sceneryTree extends Actor
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
            setLocation(589, 590);
        }
        else 
        {
            setLocation(580, 580);
        }
    }
}
