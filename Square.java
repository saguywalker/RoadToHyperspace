import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hexagon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Geometric
{
    /**
     * Act - do whatever the Hexagon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public void squareCheck(){
        if(this.getY()==getWorld().getHeight()-1) getWorld().removeObject(this);
    }
}
