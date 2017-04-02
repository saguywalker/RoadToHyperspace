import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends World
{
    GreenfootImage board=new GreenfootImage("button_scoreboard.png");
    GreenfootImage scorePic;
    public Scoreboard()
    {     
        super(420, 840, 1);
        MainMenu.curPage = "Score";
        scorePic=new GreenfootImage(Space.message,60,Color.DARK_GRAY,Color.LIGHT_GRAY);
        getBackground().drawImage(board, 70, 300);
        addObject(new BackButt(),3*getWidth()/4,getHeight()*3/4+100);
        addObject(new AgainButt(),getWidth()/3,getHeight()*3/4+100);
        getBackground().drawImage(scorePic,getWidth()/2-scorePic.getWidth()/2,getHeight()/2+75);
        Space.score=0;
        Space.message="";
    }
    
}


