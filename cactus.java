import greenfoot.*; 
public class cactus extends Actor
{
    public void act()
    {
         move(-7);
         
         if(getX() <=0)
         {
             resetCactus();
         }
    }
    
    public void resetCactus()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0)
        {
            setLocation(555, 558);
        }
        else 
        {
            setLocation(550, 552);
        }
    }
    }
