import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AgainButt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgainButt extends Button
{
    /**
     * Act - do whatever the AgainButt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new SelectMode());
            Greenfoot.playSound("pop.wav");
        }
    }    
}

