import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarPVP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarPVP extends Car
{
    String move;
    int c=0,x;
    boolean driving=false;
    boolean left=true;
    public CarPVP(){
        //dafault
    }
    
    public CarPVP(String name,int player){
        setImage(name);
        if(player==1){
            if(name.equals("BluePVP.png")){
                move="A";
                x=26;
            }else{
                move="D";
                x=130;
            }
        }else{
            if(name.equals("BluePVP.png")){
                move="left";
                x=237;
            }else{
                move="right";
                x=342;
            }
        }
    }
    
    public void act() 
    {
        isDriving();
        super.checkCircle();
        super.checkSquare();
    }    
    
    public void moving(){
        if(Greenfoot.isKeyDown(move)){
            driving=true;
            if(left){
                setRotation(20);
                for(int i=0;i<52;i++){
                    setLocation(getX()+1,getY());
                }
                left=false;
            }else{
                setRotation(-20);
                for(int i=0;i<52;i++){
                    setLocation(getX()-1,getY());
                }
                left=true;
            }
        }
        setRotation(0);
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
}
