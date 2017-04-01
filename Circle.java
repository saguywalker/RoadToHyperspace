import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Geometric
{
    /**
     * Act - do whatever the Circle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void circleCheck(){
        if(this.getY()==getWorld().getHeight()-1) {
            if(MainMenu.curPage.equals("1Player")){
                Greenfoot.playSound("fade.wav");
                Greenfoot.setWorld(new Scoreboard());
            }
            if(MainMenu.curPage.equals("PVPMode")){
                   if(this.getX()<=getWorld().getWidth()/2){
                       Greenfoot.playSound("fade.wav");
                       ((Space)getWorld()).message="Player 2 WIN!";
                       Greenfoot.setWorld(new Scoreboard());
                    }else{
                       Greenfoot.playSound("fade.wav");
                       ((Space)getWorld()).message="Player 1 WIN!";
                       Greenfoot.setWorld(new Scoreboard());
                    }
                }
        }
        
        if(this.isTouching(Square.class)) this.removeTouching(Square.class);
        if(this.isTouching(Triangle.class)) this.removeTouching(Triangle.class);
    }
}
