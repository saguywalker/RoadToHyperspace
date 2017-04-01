import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Hyperspace
{
    int lv;
    public Easy(int lv)
    {
        this.lv=lv;
    }
    
    public void act(){
        super.playing(lv);
    }
}
