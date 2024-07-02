import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int countBee=0;
    double speed;
    Bee(){
        speed = 5;
    }
    public void catched(int x, int y){
        countBee++;
        this.setLocation( (x+300)%600, (y+200)%400);
        World myWorld = this.getWorld();
        myWorld.showText("Catched bees: "+countBee, 100, 20);
        speed = speed + 0.1;
    }
    public void act()
    {
        // Add your action code here.
        /*this.setRotation(this.getRotation()+Greenfoot.getRandomNumber(20)-10);
        if (this.isAtEdge()){
            this.setRotation(this.getRotation()+180);
        }    */
        if (Greenfoot.isKeyDown("8")){
            this.setLocation(this.getX(),this.getY()-(int)speed);
        }
        if (Greenfoot.isKeyDown("2")){
            this.setLocation(this.getX(),this.getY()+(int)speed);
        }
        if (Greenfoot.isKeyDown("6")){
            this.setLocation(this.getX()+(int)speed,this.getY());
        }
        if (Greenfoot.isKeyDown("4")){
            this.setLocation(this.getX()-(int)speed,this.getY());
        }  
        if (Greenfoot.isKeyDown("5")){
            World myWorld = this.getWorld();
            myWorld.addObject(new Poison(), this.getX(), this.getY());
        }          
        /*this.move((int)speed);*/
    }
}
