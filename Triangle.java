import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle extends Geometric
{
    //remove this object when it's at down edge of world
    public void triCheck(){
        if(this.getY()==getWorld().getHeight()-1) getWorld().removeObject(this);
    }
}
