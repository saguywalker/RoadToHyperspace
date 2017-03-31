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
    
    /*public void isDriving(){
        if(driving==true && c<=10) {
            c++;
        }
        else{
            driving=false;
            c=0;
            moving();
        }
    }*/
    
    /*public void moving(){
        if(Greenfoot.isKeyDown(r) && getX()<=x && driving==false){
            driving=true;
            setRotation(20);
            for(int i=0;i<70;i++){
                setLocation(getX()+1,getY());
            }
        }else if(Greenfoot.isKeyDown(l) && getX()>=x && driving==false){
            driving=true;
            setRotation(-20);
            for(int i=0;i<70;i++){
                setLocation(getX()-1,getY());
            }
        }
        setRotation(0);
    }*/
    
    public void checkCircle(){
        if(this.isTouching(Circle.class)){
            Greenfoot.playSound("sound82.wav");
            this.removeTouching(Circle.class);
        }
    }
    
    public void checkSquare(){
        if(this.isTouching(Square.class)){
            Greenfoot.playSound("fade.wav");
            ((Hyperspace)getWorld()).gameOver();
        }
    }
}
