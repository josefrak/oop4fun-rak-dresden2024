import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clovek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Act - do whatever the Clovek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("UP")){
            this.setLocation(this.getX(),this.getY()-5);
        }
        if (Greenfoot.isKeyDown("DOWN")){
            this.setLocation(this.getX(),this.getY()+5);
        }
        if (Greenfoot.isKeyDown("RIGHT")){
            this.setLocation(this.getX()+5,this.getY());
        }
        if (Greenfoot.isKeyDown("LEFT")){
            this.setLocation(this.getX()-5,this.getY());
        }  
        if (this.isTouching(Fly.class)){
            for(int i=1;i<=10;i++){
                this.setRotation(this.getRotation()+36);
                Greenfoot.delay(1);
            }
            Fly catchedFly = (Fly)this.getOneIntersectingObject(Fly.class);
            catchedFly.catched();
        }
    }
}
