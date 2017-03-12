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
        getBackground().drawImage(txt, 5,10);
        addObject(new BackButt(),3*getWidth()/4,3*getHeight()/4);
    }
}
