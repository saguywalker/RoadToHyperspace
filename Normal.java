import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal extends Hyperspace
{
    int lv;
    public Normal(int lv)
    {
        this.lv=lv;
    }
    
    public void act(){
        super.playing(lv);
    }
}
