import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car1Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car1Player extends Car
{
    String l,r;
    int c=0,x;
    boolean driving=false;
    
    public Car1Player(){
        //dafault
    }
    
    //Set picture , default locateion and control keyboard of each car 
    public Car1Player(String name){
        setImage(name);
        if(name.equals("Red.png")){
            l="left";
            r="right";
            x=315;
        }else if(name.equals("Blue.png")){
            l="A";
            r="D";
            x=105;
        } 
    }
    
    public void act() 
    {
        isDriving();
        super.checkCircle();
        super.checkSquare();
    }    
    
    //move the car
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
    
    //delay the car
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
}
