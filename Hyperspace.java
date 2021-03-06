import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import javax.swing.JOptionPane;
/**
 * Write a description of class Hyperspace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hyperspace extends Space
{
    public static String message="";
    //String name;
    boolean rIncrease, gIncrease, bIncrease;
    int cr=0,cb=0,hr=0,hb=0,time=0;
    int r,g,b;
    int rdCr=Greenfoot.getRandomNumber(50)+150;
    int rdCb=Greenfoot.getRandomNumber(50)+150; 
    int rdHr=Greenfoot.getRandomNumber(50)+300;
    int rdHb=Greenfoot.getRandomNumber(50)+300;
    GreenfootImage bg=new GreenfootImage(420,840);
    int rgb[]=new int[3];
    public Hyperspace()
    {    
        MainMenu.curPage="1Player";
        name = JOptionPane.showInputDialog("Enter your name : ");
        while(name.isEmpty()) name = JOptionPane.showInputDialog("Enter your name : ");
        super.timer=new SimpleTimer();
        bg.setColor(new Color(r,g,b));
        bg.fill();
        setBackground(bg);
        addObject(new Car1Player("Blue.png"),35+getWidth()/6,10*getHeight()/12);
        addObject(new Car1Player("Red.png"),35+4*getWidth()/6,10*getHeight()/12);
        draw();
        r = Greenfoot.getRandomNumber(79)+126;
        g = Greenfoot.getRandomNumber(149)+101;
        b = Greenfoot.getRandomNumber(99)+101;
    }
    
    //select mode easy normal hell from lv parameter
    public void playing(int lv){
        create(lv);
        super.updateScore();
        showText("Score : "+score,getWidth()/2,getHeight()/12);
        changeBG(lv);
    }
    
    //draw line in the map
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
        getBackground().setColor(Color.BLACK);
    }
    
    //change background color when score increased 
    public void changeBG(int lv){
       if(score == 0){
           rIncrease = true;
           gIncrease = true;
           bIncrease = true;
       }
        if(lv==0) {
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
       }else if(lv==1){
           if(score%5==0 && score!=0 && gIncrease){
               if(g>=200) gIncrease = false;
               g++;
            }
           if(score%7==0 && score!=0 && bIncrease){
               if(b>=200) bIncrease = false;
               b++;
           } 
           if(score%9==0 && score!=0 && rIncrease){
               if(r>=200) rIncrease = false;
               r++;
           }
           
           if(score%5==0 && score!=0 && !gIncrease){
               if(g<=100) gIncrease = true;
               g--;
            }
           if(score%7==0 && score!=0 && !bIncrease){
               if(b<=100) bIncrease = true;
               b--;
           } 
           if(score%9==0 && score!=0 && !rIncrease){
               if(r<=125) rIncrease = true;
               r--;
           }
       }else{
           if(score%5==0 && score!=0 && bIncrease){
               if(b>=200) bIncrease = false;
               b++;
            }
           if(score%7==0 && score!=0 && rIncrease){
               if(r>=200) rIncrease = false;
               r++;
           } 
           if(score%9==0 && score!=0 && gIncrease){
               if(g>=200) gIncrease = false;
               g++;
           }
           
           if(score%5==0 && score!=0 && !bIncrease){
               if(b<=100) bIncrease = true;
               b--;
            }
           if(score%7==0 && score!=0 && !rIncrease){
               if(r<=125) rIncrease = true;
               r--;
           } 
           if(score%9==0 && score!=0 && !gIncrease){
               if(g<=100) gIncrease = true;
               g--;
           }
       }
       bg.setColor(new Color(r,g,b));
       bg.fill();
       draw();
    }
    
    //create geometric object in random
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
                rdCr=Greenfoot.getRandomNumber(100)+80;
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
                rdCb=Greenfoot.getRandomNumber(100)+80;
                addObject(new BlueCircle(lv),(Greenfoot.getRandomNumber(3))*70+35,0);
            }
        }else if(lv==1){
            if(cb<rdCb)cb++;
            else{
                cb=0;
                rdCb=Greenfoot.getRandomNumber(60)+60;
                addObject(new BlueCircle(lv),(Greenfoot.getRandomNumber(3))*70+35,0);
            }
        }else{
            if(cb<rdCb)cb++;
            else{
                cb=0;
                rdCb=Greenfoot.getRandomNumber(50)+40;
                addObject(new BlueCircle(lv),(Greenfoot.getRandomNumber(3))*70+35,0);
            }
        }
    }
    
    public void createBlueHex(int lv){
        if(lv==0){
            if(hb<rdHb)hb++;
            else{
                hb=0;
                rdHb=Greenfoot.getRandomNumber(100)+80;
                addObject(new BlueSQ(lv),(Greenfoot.getRandomNumber(3))*70+35,0);
            }
        }else if(lv==1){
            if(hb<rdHb)hb++;
            else{
                hb=0;
                rdHb=Greenfoot.getRandomNumber(60)+60;
                addObject(new BlueSQ(lv),(Greenfoot.getRandomNumber(3))*70+35,0);
            }
        }else{
            if(hb<rdHb)hb++;
            else{
                hb=0;
                rdHb=Greenfoot.getRandomNumber(50)+40;
                addObject(new BlueSQ(lv),(Greenfoot.getRandomNumber(3))*70+35,0);
            }
        }
    }
    
    public void createRedHex(int lv){
        if(lv==0){
            if(hr<rdHr) hr++;
            else{
                hr=0;
                rdHr=Greenfoot.getRandomNumber(100)+80;
                addObject(new RedSQ(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }else{ //normal and hell red geometric are moving same speed 
            if(hr<rdHr) hr++;
            else{
                hr=0;
                rdHr=Greenfoot.getRandomNumber(60)+60;
                addObject(new RedSQ(lv),(Greenfoot.getRandomNumber(3)+3)*70+35,0);
            }
        }
    }
    
    
}
