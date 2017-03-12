import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    /**
     * Write a description of class SelectLevel here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
public class SelectLevel extends World{
    GreenfootImage select=new GreenfootImage("button_select-level.png");
    public SelectLevel(){    
         super(490, 840, 1); 
         getBackground().drawImage(select, 130,140);
         addObject(new EasyButt(),getWidth()/4,2*getHeight()/5);
         addObject(new NormalButt(),getWidth()/2,2*getHeight()/5);                     
         addObject(new HellButt(),3*getWidth()/4,2*getHeight()/5);
    }
}