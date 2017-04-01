import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedTri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedTri extends Triangle
{
    int speed = 9;
    public RedTri(){
        setRotation(90);
    }
    public void act() 
    {
        super.triCheck();
        move(speed);
    }        
}
