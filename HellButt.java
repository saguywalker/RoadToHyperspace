import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HellButt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HellButt extends Button
{
    /**
     * Act - do whatever the HellButt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Hell(2));
            Greenfoot.playSound("pop.wav");
        }
    }    
}
