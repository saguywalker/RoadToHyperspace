import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedHex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedHex extends Hexagon
{
    /**
     * Act - do whatever the RedHex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=6;
    public RedHex(int lv){
        setRotation(90);
        if(lv!=0) speed+=3;
    }
    public void act() 
    {
        super.hexagonCheck();
        move(speed);
    }    
}
