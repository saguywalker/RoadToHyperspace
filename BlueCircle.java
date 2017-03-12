import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCircle extends Circle
{
    /**
     * Act - do whatever the BlueCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=2;
    public BlueCircle(int lv){
        setRotation(90);
        speed=(lv+1)*3+speed;
    }
    public void act() 
    {
        super.circleCheck();
        move(speed);
    }    
}
