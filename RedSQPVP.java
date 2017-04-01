import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedSQPVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedSQPVP extends Square
{

    int speed = 9;
    public RedSQPVP(){
        setRotation(90);
    }
    public void act() 
    {
        super.squareCheck();
        move(speed);
    }    
}
