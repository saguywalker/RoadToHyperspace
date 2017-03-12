import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    GreenfootImage txt=new GreenfootImage("txt.png");
    public Help()
    {    
        super(420, 840, 1); 
        getBackground().drawImage(txt, 5,50);
        addObject(new BackButt(),getWidth()/2,3*getHeight()/4);
    }
}
