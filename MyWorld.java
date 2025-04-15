import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Villain villain = new Villain();
        addObject(villain, 605, 605);
    }
}
