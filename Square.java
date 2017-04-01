import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hexagon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Geometric
{
    public void act() 
    {
        // Add your action code here.
    }
    
    //remove this object when it's at down edge of world
    public void squareCheck(){
        if(this.getY()==getWorld().getHeight()-1) getWorld().removeObject(this);
    }
}
