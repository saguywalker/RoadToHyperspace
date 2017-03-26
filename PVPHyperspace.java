import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PVPHyperspace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PVPHyperspace extends World
{

    /**
     * Constructor for objects of class PVPHyperspace.
     * 
     */
    public PVPHyperspace()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(420, 840, 1); 
        showText("COMING SOON....",getWidth()/2,getHeight()/2);
        addObject(new BackButt(),getWidth()/2,3*getHeight()/4);
    }
}

