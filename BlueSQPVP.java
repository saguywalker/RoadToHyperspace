import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueSQPVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueSQPVP extends Square
{
    /**
     * Act - do whatever the BlueSQPVP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
