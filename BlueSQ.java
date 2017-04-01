import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueHex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueSQ extends Square
{

    int speed=3;
    public BlueSQ(int lv){
        setRotation(90);
        speed=(lv+1)*3+speed;
    }
    public void act() 
    {
        super.squareCheck();
        move(speed);
    }    
}
