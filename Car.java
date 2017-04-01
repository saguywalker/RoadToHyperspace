import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{   
    //remove circle that touch this object
    public void checkCircle(){
        if(this.isTouching(Circle.class)){
            Greenfoot.playSound("sound82.wav");
            this.removeTouching(Circle.class);
        }
    }
    
    //gameover when this object touching square
    public void checkSquare(){
        if(this.isTouching(Square.class)){
            Greenfoot.playSound("fade.wav");
            Greenfoot.setWorld(new Scoreboard());
            this.removeTouching(Square.class);
        }
    }
    
    //gameover when this object touching square or triangle
    public void checkAnotherGeo(){
        if(this.isTouching(Square.class)){
            ((Space)getWorld()).message=((PVPHyperspace)getWorld()).p1;
            Greenfoot.playSound("fade.wav");
            Greenfoot.setWorld(new Scoreboard());
            this.removeTouching(Square.class);
        }
        if(this.isTouching(Triangle.class)){
            ((Space)getWorld()).message=((PVPHyperspace)getWorld()).p2;
            Greenfoot.playSound("fade.wav");
            Greenfoot.setWorld(new Scoreboard());
            this.removeTouching(Triangle.class);
        }
    }
}
