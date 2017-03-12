import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hell extends Hyperspace
{

    /**
     * Constructor for objects of class Hell.
     * 
     */
    int lv;
    public Hell(int lv)
    {
        this.lv=lv;
    }
    
    public void act(){
        super.playing(lv);
    }
}
