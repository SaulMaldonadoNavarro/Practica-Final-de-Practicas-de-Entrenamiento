package fcc.practicafinal;
import javax.swing.*;
import javax.swing.JTextArea;
/**
 *
 * @author saulm
 */
public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private boolean flag = false;
    
    Hilo(JTextArea area, RCompartido rc){
        this.area =area;
        this.rc=rc;
    }
    
    public void despertar(){
        flag = true;
    }
            
    public void dormir (){
        flag = false;
    }
    
    public void run(){
        while(flag == true){
            try{
                rc.setDatoCompartido(this.getName());
                area.append(rc.getDatoCompartido()+": Eats"+"\n");
                Thread.sleep(1000);
             }catch(Exception e){
                 e.printStackTrace();
             }
        }
    }    
}