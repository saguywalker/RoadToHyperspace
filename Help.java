import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    GreenfootImage txt=new GreenfootImage("texthelp.png");
    public Help()
    {    
        super(700, 500, 1); 
        getBackground().drawImage(txt, 50,10);
        addObject(new BackButt(),3*getWidth()/4,3*getHeight()/4);
    }
}
