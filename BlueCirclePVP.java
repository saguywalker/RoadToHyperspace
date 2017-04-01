import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCirclePVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCirclePVP extends Circle
{

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
