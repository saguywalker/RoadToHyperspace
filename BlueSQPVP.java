import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueSQPVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueSQPVP extends Square
{

    int speed = 9;
    public BlueSQPVP(){
        setRotation(90);
    }
    public void act() 
    {
        super.squareCheck();
        move(speed);
    }    
}
