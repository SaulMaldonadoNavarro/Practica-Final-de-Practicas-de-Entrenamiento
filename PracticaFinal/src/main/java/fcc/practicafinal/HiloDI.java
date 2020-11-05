package fcc.practicafinal;
import javax.swing.*;
import javax.swing.JTextArea;
/**
 *
 * @author saulm
 */
public class HiloDI extends Thread {
    private JTextArea area;
    private RCompartidoDI rcdi;
    private boolean flag = false;
    
    HiloDI(JTextArea area, RCompartidoDI rcdi){
        this.area =area;
        this.rcdi=rcdi;
    }
    
    public void despertar(){
        flag = true;
    }
            
    public void dormir (){
        flag = false;
    }
    
    public void run(){
        while(flag){
            try{
                rcdi.setDatoCompartido(this.getName());
                area.append(rcdi.getDatoCompartido()+": Eats-DI"+"\n");
                Thread.sleep((int)(1995+Math.random()*200));
             }catch(Exception e){
                 e.printStackTrace();
             }
        }
    } 
}
