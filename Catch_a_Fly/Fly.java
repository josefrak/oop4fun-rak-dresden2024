import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moucha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Enemy
{
    /**
     * Act - do whatever the Moucha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Fly(String up, String down, String left, String right, String poison){
        super(up,down,left,right,poison);
        count=0;
    }    
    public void catched(int x, int y){
        count++;
        this.setLocation( (x+300)%600, (y+200)%400);
        World myWorld = this.getWorld();
        myWorld.showText("Catched flies: "+count, 100, 20);
        speed = speed + 0.1;
    }
}
