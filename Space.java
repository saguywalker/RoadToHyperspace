import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    public static long score=0;
    public static String message="";
    SimpleTimer timer;
    String name;
    public Space()
    {    
        super(420, 840, 1);  
    }
    
    //update score with SimpleTimer class (1 second = 1 score)
    public void updateScore(){
        score=timer.millisElapsed()/1000;
        message=""+score;
    }
   
}
