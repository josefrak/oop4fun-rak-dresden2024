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
    double speed;
    Fly(){
        speed = 5;
    }
    public void catched(int x, int y){
        countFly++;
        this.setLocation( (x+300)%600, (y+200)%400);
        World myWorld = this.getWorld();
        myWorld.showText("Catched flies: "+countFly, 100, 20);
        speed = speed + 0.1;
    }
    public void act()
    {
        // Add your action code here.
        /*this.setRotation(this.getRotation()+Greenfoot.getRandomNumber(20)-10);
        if (this.isAtEdge()){
            this.setRotation(this.getRotation()+180);
        }    */
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(),this.getY()-(int)speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(),this.getY()+(int)speed);
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX()+(int)speed,this.getY());
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX()-(int)speed,this.getY());
        }  
        /*this.move((int)speed);*/
    }
}
