import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButt extends Actor
{
    /**
     * Act - do whatever the BackButt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MainMenu());
            Greenfoot.playSound("pop.wav");
        }
    }    
}