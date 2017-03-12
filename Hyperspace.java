import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Hyperspace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hyperspace extends World
{
    public static int score=0;
    int cr=0,cb=0,hr=0,hb=0;
    int r,g,b=0;
    int rdCr=Greenfoot.getRandomNumber(50)+150;
    int rdCb=Greenfoot.getRandomNumber(50)+150;
    int rdHr=Greenfoot.getRandomNumber(50)+300;
    int rdHb=Greenfoot.getRandomNumber(50)+300;
    GreenfootImage bg=new GreenfootImage(490,840);
    
    public Hyperspace()
    {    
        super(420, 840, 1); 
        bg.setColor(new Color(r,g,b));
        bg.fill();
        setBackground(bg);
        addObject(new Car("Blue.png"),35+getWidth()/6,10*getHeight()/12);
        addObject(new Car("Red.png"),35+4*getWidth()/6,10*getHeight()/12);
        draw();
    }
    
    public void playing(int lv){
        
    }
    
    public void draw(){
        getBackground().setColor(Color.BLUE);
        getBackground().drawLine(70,0,70,840);
        getBackground().drawLine(140,0,140,840);
        getBackground().drawLine(0,0,0,840);
        getBackground().setColor(Color.RED);
        getBackground().drawLine(280,0,280,840);
        getBackground().drawLine(350,0,350,840);
        getBackground().drawLine(419,0,419,840);
        getBackground().setColor(Color.YELLOW);
        getBackground().drawLine(210,0,210,840);
    }
}
