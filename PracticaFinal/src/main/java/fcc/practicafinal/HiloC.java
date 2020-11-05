package fcc.practicafinal;
import javax.swing.*;
import javax.swing.JTextArea;
/**
 * @author saulm
 */
public class HiloC extends Thread{

    private JTextArea area;
    private RCompartidoC rcc;
    private boolean flag = false;
    
    
    HiloC(JTextArea area, RCompartidoC rcc){
        this.area = area;
        this.rcc = rcc;
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
                rcc.setDatoCompartido(this.getName());
                area.append(rcc.getDatoCompartido()+": Eats-C"+"\n");                   
                Thread.sleep((int)(1995+Math.random()*200));
             }catch(Exception e){
                 e.printStackTrace();
             }
        }
    }    
}
