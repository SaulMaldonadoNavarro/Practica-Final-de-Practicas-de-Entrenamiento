package fcc.practicafinal;
import javax.swing.JTextArea;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author saulm
 */
public class HiloM extends Thread{
    private JTextArea area;
    private RCompartidoM rcm;
    private boolean flag = false;
    private boolean dead = false;
    private String aux = "En espera...M";
    private Lock mutex;
    
    HiloM(JTextArea area, RCompartidoM rcm){
        this.area =area;
        this.rcm=rcm;
        mutex = new ReentrantLock();
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
                if(mutex.tryLock()){
                    mutex.lock();
                    rcm.setDatoCompartido(this.getName());
                    area.append(rcm.getDatoCompartido()+": Eats-M"+"\n");
                    if(isDead())
                        stop();
                    mutex.unlock();
                    
                }

                Thread.sleep((int)(1995+Math.random()*200));
             }catch(Exception e){
                 e.printStackTrace();
             }
        }
    }   
    
    public boolean isDead(){
        return dead;
    }
    
    public void setDead(boolean d){
        dead=d;
    }
}
