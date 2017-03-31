import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButt extends Button
{
    
    /**
     * Act - do whatever the BackButt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            if(MainMenu.curPage.equals("SM")){
                Greenfoot.setWorld(new MainMenu());
                Greenfoot.playSound("pop.wav");
            }
            if(MainMenu.curPage.equals("Help")){
                Greenfoot.setWorld(new MainMenu());
                Greenfoot.playSound("pop.wav");
            }
            if(MainMenu.curPage.equals("Slvl")){
                Greenfoot.setWorld(new SelectMode());
                Greenfoot.playSound("pop.wav");
            }
            if(MainMenu.curPage.equals("PVP")){
                Greenfoot.setWorld(new SelectMode());
                Greenfoot.playSound("pop.wav");
            }
        }
    }    
}
