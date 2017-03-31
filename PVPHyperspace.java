import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class PVPHyperspace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PVPHyperspace extends World
{
    public static long score=0;
    int playNum = 0;
    boolean rIncrease, gIncrease, bIncrease;
    int cr=0,cb=0,hr=0,hb=0,time=0;
    int r,g,b;
    int rdCr=Greenfoot.getRandomNumber(50)+150;
    int rdCb=Greenfoot.getRandomNumber(50)+150; 
    int rdHr=Greenfoot.getRandomNumber(50)+300;
    int rdHb=Greenfoot.getRandomNumber(50)+300;
    GreenfootImage bg=new GreenfootImage(420,840);
    int rgb[]=new int[3];
    SimpleTimer timer=new SimpleTimer();
    /**
     * Constructor for objects of class PVPHyperspace.
     * 
     */
    public PVPHyperspace()
    {    
        super(420, 840, 1);
        bg.setColor(new Color(r,g,b));
        bg.fill();
        setBackground(bg);
        addObject(new CarPVP("BluePVP.png",1),26,10*getHeight()/12);
        addObject(new CarPVP("BluePVP.png",2),237,10*getHeight()/12);
        addObject(new CarPVP("RedPVP.png",1),130,10*getHeight()/12);
        addObject(new CarPVP("RedPVP.png",2),341,10*getHeight()/12);
        
    }
    
    
    public void act(){
        create();
        updateScore();
        showText("Score : "+score,getWidth()/2,getHeight()/12);
        changeBG();
    }
   
    public void player(int x){
        playNum = x;
    }
    
    public void draw(){
        getBackground().setColor(Color.BLUE);
        getBackground().drawLine(52,0,52,840);
        getBackground().drawLine(0,0,0,840);
        
        getBackground().drawLine(263,0,263,840);
        getBackground().drawLine(211,0,211,840);
        
        getBackground().setColor(Color.RED);
        getBackground().drawLine(156,0,156,840);
        getBackground().drawLine(208,0,208,840);
        
        getBackground().drawLine(367,0,367,840);
        getBackground().drawLine(419,0,419,840);
        
        getBackground().setColor(Color.YELLOW);
        getBackground().drawLine(104,0,104,840);
        getBackground().drawLine(209,0,209,840);
        getBackground().drawLine(210,0,210,840);
        getBackground().drawLine(315,0,315,840);
        getBackground().setColor(Color.BLACK);
    }
    
    public void changeBG(){
       if(score == 0){
           rIncrease = true;
           gIncrease = true;
           bIncrease = true;
       }
       if(score%5==0 && score!=0 && rIncrease){
           if(r>=200) rIncrease = false;
           r++;
       }
       if(score%7==0 && score!=0 && gIncrease){
           if(g>=200) gIncrease = false;
           g++;
           } 
       if(score%9==0 && score!=0 && bIncrease){
           if(b>=200) bIncrease = false;
           b++;
       }
           
       if(score%5==0 && score!=0 && !rIncrease){
           if(r<=125) rIncrease = true;
           r--;
       }
       if(score%7==0 && score!=0 && !gIncrease){
           if(g<=100) gIncrease = true;
           g--;
       } 
       if(score%9==0 && score!=0 && !bIncrease){
           if(b<=100) bIncrease = true;
           b--;
       }
       
       bg.setColor(new Color(r,g,b));
       bg.fill();
       draw();
    }
    
    public void create(){
        createRedCir();
        createBlueCir();
        createRedHex();
        createBlueHex();
    }
    
    public void createRedCir(){
        if(cr<rdCr) cr++;
        else{
            cr=0;
            rdCr=Greenfoot.getRandomNumber(60)+60;
            addObject(new RedCirclePVP(),(Greenfoot.getRandomNumber(2)+2)*52+26,0);
            addObject(new RedCirclePVP(),(Greenfoot.getRandomNumber(2)*52)+341,0);
        }
    }
    
    public void createBlueCir(){
        if(cb<rdCb) cb++;
        else{
            cb=0;
            rdCr=Greenfoot.getRandomNumber(60)+60;
            addObject(new BlueCirclePVP(),(Greenfoot.getRandomNumber(2)*52)+26,0);
            addObject(new BlueCirclePVP(),(Greenfoot.getRandomNumber(2)*52)+237,0);
        }
    }
    
    public void createRedHex(){
        if(hr<rdHr) hr++;
        else{
            hr=0;
            rdCr=Greenfoot.getRandomNumber(60)+60;
            addObject(new RedSQPVP(),(Greenfoot.getRandomNumber(2)+2)*52+26,0);
            addObject(new RedSQPVP(),(Greenfoot.getRandomNumber(2)*52)+341,0);
        }
    }
    
    public void createBlueHex(){
        if(hb<rdHb) hb++;
        else{
            hb=0;
            rdCr=Greenfoot.getRandomNumber(60)+60;
            addObject(new BlueSQPVP(),(Greenfoot.getRandomNumber(2)*52)+26,0);
            addObject(new BlueSQPVP(),(Greenfoot.getRandomNumber(2)*52)+237,0);
        }
    }
    
    public void updateScore(){
        score=timer.millisElapsed()/1000;
    }
    
    public void gameOver(){
        Greenfoot.setWorld(new Scoreboard());
    }
}

