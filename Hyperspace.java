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
    int cr=0,cb=0,hr=0,hb=0,time=0;
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
        create(lv);
        updateScore();
        showText("Score : "+score,getWidth()/2,getHeight()/12);
        changeBG(lv);
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
    
    public void changeBG(int lv){
       int rgb[]=new int[3];
       if(lv==0) {
           rgb[0]=b;rgb[1]=r;rgb[2]=g;
       }else if(lv==1){
           rgb[0]=g;rgb[1]=b;rgb[2]=r;
       }else{
           rgb[0]=r;rgb[1]=g;rgb[2]=b;
       }
       if(score%3==0 && score!=0){
            if(rgb[0]>=200) rgb[0]=0;
            rgb[0]++;
            bg.setColor(new Color(r,g,b));
            bg.fill();
            draw();
       }
       if(score%5==0 && score!=0){
            if(rgb[1]>=200) rgb[1]=0;
            rgb[1]++;
            bg.setColor(new Color(r,g,b));
            bg.fill();
            draw();
       }
       if(score%7==0 && score!=0){
            if(rgb[2]>=200) rgb[2]=0;
            rgb[2]++;
            bg.setColor(new Color(r,g,b));
            bg.fill();
            draw();
       }
    }
    
    public void create(int lv){
        createRedCir(lv);
        createBlueCir(lv);
        createRedHex(lv);
        createBlueHex(lv);
    }
    
    public void createRedCir(int lv){
        if(lv==0){
            if(cr<rdCr) cr++;
            else{
                cr=0;
                rdCr=Greenfoot.getRandomNumber(100)+100;
                addObject(new RedCircle(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }else{ //normal and hell red geometric are moving same speed
            if(cr<rdCr) cr++;
            else{
                cr=0;
                rdCr=Greenfoot.getRandomNumber(60)+60;
                addObject(new RedCircle(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }
    }
    
    public void createBlueCir(int lv){
        if(lv==0){
            if(cb<rdCb)cb++;
            else{
                cb=0;
                rdCb=Greenfoot.getRandomNumber(100)+100;
                addObject(new BlueCircle(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }else if(lv==1){
            if(cb<rdCb)cb++;
            else{
                cb=0;
                rdCb=Greenfoot.getRandomNumber(60)+60;
                addObject(new BlueCircle(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }else{
            if(cb<rdCb)cb++;
            else{
                cb=0;
                rdCb=Greenfoot.getRandomNumber(40)+40;
                addObject(new BlueCircle(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }
    }
    
    public void createBlueHex(int lv){
        if(lv==0){
            if(hb<rdHb)hb++;
            else{
                hb=0;
                rdHb=Greenfoot.getRandomNumber(100)+100;
                addObject(new BlueHex(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }else if(lv==1){
            if(hb<rdHb)hb++;
            else{
                hb=0;
                rdHb=Greenfoot.getRandomNumber(60)+60;
                addObject(new BlueHex(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }else{
            if(hb<rdHb)hb++;
            else{
                hb=0;
                rdHb=Greenfoot.getRandomNumber(40)+40;
                addObject(new BlueHex(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }
    }
    
    public void createRedHex(int lv){
        if(lv==0){
            if(hr<rdHr) hr++;
            else{
                hr=0;
                rdHr=Greenfoot.getRandomNumber(100)+100;
                addObject(new RedHex(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }else{ //normal and hell red geometric are moving same speed 
            if(hr<rdHr) hr++;
            else{
                hr=0;
                rdHr=Greenfoot.getRandomNumber(60)+60;
                addObject(new RedHex(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }
    }
    
    public void updateScore(){
        if(time<=70) time++;
        else{
            time=0;
            score++;
        }
    }
    
    public void gameOver(){
        Greenfoot.setWorld(new Scoreboard());
    }
}
