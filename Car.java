import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    public Car(){
    
    }
    
    public void act() 
    {
      
    }
    
    public void checkCircle(){
        if(this.isTouching(Circle.class)){
            Greenfoot.playSound("sound82.wav");
            this.removeTouching(Circle.class);
        }
    }
    
    public void checkSquare(){
        if(this.isTouching(Square.class)){
            Greenfoot.playSound("fade.wav");
            Greenfoot.setWorld(new Scoreboard());
            this.removeTouching(Square.class);
        }
    }
}
