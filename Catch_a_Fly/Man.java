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
    int speed = 10;
    public void act()
    {
        // Add your action code here.
        /*if (Greenfoot.isKeyDown("UP")){
            this.setLocation(this.getX(),this.getY()-speed);
        }
        if (Greenfoot.isKeyDown("DOWN")){
            this.setLocation(this.getX(),this.getY()+speed);
        }
        if (Greenfoot.isKeyDown("RIGHT")){
            this.setLocation(this.getX()+speed,this.getY());
        }
        if (Greenfoot.isKeyDown("LEFT")){
            this.setLocation(this.getX()-speed,this.getY());
        }  */
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse!=null){
            this.setLocation(mouse.getX(), mouse.getY());
        }
        if (this.isTouching(Enemy.class)){
            for(int i=1;i<=10;i++){
                this.setRotation(this.getRotation()+36);
                Greenfoot.delay(1);
            }
            Enemy catchedEnemy = (Enemy)this.getOneIntersectingObject(Enemy.class);
            catchedEnemy.catched(this.getX(),this.getY());
        }
        if (this.isTouching(Poison.class)){
            World myWorld = this.getWorld();
            myWorld.showText("GAME OVER", 250, 180);  
            Greenfoot.stop();
        }
    }
}
