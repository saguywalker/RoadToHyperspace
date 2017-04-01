import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueTri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueTri extends Triangle
{
    int speed = 9;
    public BlueTri(){
        setRotation(90);
    }
    public void act() 
    {
        super.triCheck();
        move(speed);
    }      
}
