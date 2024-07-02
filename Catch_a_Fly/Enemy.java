import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    double speed;
    int count;    
    String up, down, left, right, poison;
    Enemy(String up, String down, String left, String right, String poison){
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        this.poison = poison;
        speed = 5;
    }
    abstract void catched(int x, int y);
    public void act()
    {
        // Add your action code here.
        /*this.setRotation(this.getRotation()+Greenfoot.getRandomNumber(20)-10);
        if (this.isAtEdge()){
            this.setRotation(this.getRotation()+180);
        }    */
        if (Greenfoot.isKeyDown(up)){
            this.setLocation(this.getX(),this.getY()-(int)speed);
        }
        if (Greenfoot.isKeyDown(down)){
            this.setLocation(this.getX(),this.getY()+(int)speed);
        }
        if (Greenfoot.isKeyDown(right)){
            this.setLocation(this.getX()+(int)speed,this.getY());
        }
        if (Greenfoot.isKeyDown(left)){
            this.setLocation(this.getX()-(int)speed,this.getY());
        }  
        if (Greenfoot.isKeyDown(poison)){
            World myWorld = this.getWorld();
            myWorld.addObject(new Poison(), this.getX(), this.getY());
        }          
        /*this.move((int)speed);*/
    }
}
