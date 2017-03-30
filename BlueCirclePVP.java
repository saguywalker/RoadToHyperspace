import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCirclePVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCirclePVP extends CirclePVP
{
    /**
     * Act - do whatever the BlueCirclePVP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 9;
    public BlueCirclePVP(){
        setRotation(90);
    }
    
    public void act() 
    {
        super.circleCheck();
        move(speed);
    }    
}
