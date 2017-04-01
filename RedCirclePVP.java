import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCirclePVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCirclePVP extends Circle
{

    int speed = 9;
    public RedCirclePVP(){
        setRotation(90);
    }
    
    public void act() 
    {
        super.circleCheck();
        move(speed);
    }    
}
