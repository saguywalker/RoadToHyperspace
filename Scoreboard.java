import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends World
{

    /**
     * Constructor for objects of class Scoreboard.
     * 
     */
    public Scoreboard()
    {    
        super(490, 840, 1); 
        showText("SCOREBOARD",getWidth()/2,getHeight()/5);
        addObject(new BackButt(),3*getWidth()/4,getHeight()*3/4);
        addObject(new AgainButt(),getWidth()/3,getHeight()*3/4);
        showText(""+Hyperspace.score,getWidth()/2,getHeight()/2);
        Hyperspace.score=0;
    }
}

