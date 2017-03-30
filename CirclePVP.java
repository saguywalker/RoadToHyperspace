import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CirclePVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CirclePVP extends Actor
{
    /**
     * Act - do whatever the CirclePVP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void circleCheck(){
        if(this.getY() == getWorld().getHeight()-1){
            Greenfoot.playSound("fade.wav");
            ((PVPHyperspace)getWorld()).gameOver();
        }
        if(this.isTouching(Square.class)) this.removeTouching(Square.class);
    }
}
