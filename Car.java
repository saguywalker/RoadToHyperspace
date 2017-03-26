import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    String l,r;
    int c=0,x;
    boolean driving=false;
    public Car(){
        //dafault
    }
    public Car(String name){
        setImage(name);
        if(name.equals("Red.png")){
            l="left";
            r="right";
            x=315;
        }else{
            l="A";
            r="D";
            x=105;
        }
    }
    public void act() 
    {
        isDriving();
        checkCircle();
        checkSquare();
    }
    
    public void isDriving(){
        if(driving==true && c<=10) {
            c++;
        }
        else{
            driving=false;
            c=0;
            moving();
        }
    }
    
    public void moving(){
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
            ((Hyperspace)getWorld()).gameOver();
        }
    }
}
