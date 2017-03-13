import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    public static GreenfootSound soundtrack=new GreenfootSound("bgsound.wav");
    GreenfootImage hyperspace=new GreenfootImage("thename.png");
    public MainMenu()
    {    
        super(420, 840, 1);
        getBackground().drawImage(hyperspace, 35,140);
        addObject(new PlayButt(),getWidth()/4,2*getHeight()/5);
        addObject(new HelpButt(),getWidth()/2,2*getHeight()/5);
        addObject(new ExitButt(),3*getWidth()/4,2*getHeight()/5);
    }
    
    public void started(){
        soundtrack.playLoop();
    }
}
