import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Geometric
{
    
    public void circleCheck(){
        if(this.getY()==getWorld().getHeight()-1) { //when it's at down edge of world
            if(MainMenu.curPage.equals("1Player")){
                Greenfoot.playSound("fade.wav");
                Greenfoot.setWorld(new Scoreboard());
            }
            if(MainMenu.curPage.equals("PVPMode")){
                   if(this.getX()<=getWorld().getWidth()/2){
                       Greenfoot.playSound("fade.wav");
                       ((Space)getWorld()).message=((PVPHyperspace)getWorld()).p2;
                       Greenfoot.setWorld(new Scoreboard());
                    }else{
                       Greenfoot.playSound("fade.wav");
                       ((Space)getWorld()).message=((PVPHyperspace)getWorld()).p1;
                       Greenfoot.setWorld(new Scoreboard());
                    }
                }
        }
        
        //remove another geometric that touching this object for fix the bug
        if(this.isTouching(Square.class)) this.removeTouching(Square.class);
        if(this.isTouching(Triangle.class)) this.removeTouching(Triangle.class);
    }
}
