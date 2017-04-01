import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCircle extends Circle
{

    int speed=6;
    public RedCircle(int lv){
        setRotation(90);
        if(lv!=0) speed+=3;
    }
    public void act() 
    {
        super.circleCheck();
        move(speed);
    }    
}
