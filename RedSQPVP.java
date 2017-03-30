import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedSQPVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedSQPVP extends Square
{
    /**
     * Act - do whatever the RedSQPVP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
