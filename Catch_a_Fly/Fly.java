import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moucha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Actor
{
    /**
     * Act - do whatever the Moucha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int countFly=0;
    public void catched(){
        countFly++;
        this.setLocation(10, 10);
        World myWorld = this.getWorld();
        myWorld.showText("Catched flies: "+countFly, 100, 20);
    }
    public void act()
    {
        // Add your action code here.
        this.setRotation(this.getRotation()+Greenfoot.getRandomNumber(20)-10);
        if (this.isAtEdge()){
            this.setRotation(this.getRotation()+180);
        }    
        this.move(5);
    }
}
