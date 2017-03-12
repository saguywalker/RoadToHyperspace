import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
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
    GreenfootImage board=new GreenfootImage("button_scoreboard.png");
    GreenfootImage scorePic=new GreenfootImage(""+Hyperspace.score,72,Color.DARK_GRAY,Color.LIGHT_GRAY);
    public Scoreboard()
    {    
        super(490, 840, 1); 
        getBackground().drawImage(board, 110, 300);
        addObject(new BackButt(),3*getWidth()/4,getHeight()*3/4+100);
        addObject(new AgainButt(),getWidth()/3,getHeight()*3/4+100);
        getBackground().drawImage(scorePic,getWidth()/2,getHeight()/2+75);
        //showText(""+Hyperspace.score,getWidth()/2,getHeight()/2+100);
        Hyperspace.score=0;
    }
}


