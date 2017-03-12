import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueHex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueHex extends Hexagon
{
    /**
     * Act - do whatever the BlueHex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=2;
    public BlueHex(int lv){
        setRotation(90);
        speed=(lv+1)*3+speed;
    }
    public void act() 
    {
        super.hexagonCheck();
        move(speed);
    }    
}
