import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectMode extends World
{
    GreenfootImage select=new GreenfootImage("button_select-mode.png");
    public SelectMode()
    {    
        super(420, 840, 1);
        MainMenu.curPage = "SM";
        getBackground().drawImage(select, 90,140);
        addObject(new BackButt(),getWidth()/2,getHeight()/2); 
        addObject(new OneButt(),getWidth()/4,2*getHeight()/5); 
        addObject(new TwoButt(),3*getWidth()/4,2*getHeight()/5); 
    }
}
