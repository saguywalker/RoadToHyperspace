import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButt extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            MainMenu.soundtrack.stop();
            Greenfoot.stop();
        }
    }
}
