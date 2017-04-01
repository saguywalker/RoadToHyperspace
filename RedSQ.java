import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedHex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedSQ extends Square
{

    int speed=6;
    public RedSQ(int lv){
        setRotation(90);
        if(lv!=0) speed+=3;
    }
    public void act() 
    {
        super.squareCheck();
        move(speed);
    }    
}
