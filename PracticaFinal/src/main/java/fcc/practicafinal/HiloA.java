package fcc.practicafinal;
import javax.swing.JTextArea;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author saulm
 */
public class HiloA extends Thread{
    private JTextArea area;
    private RCompartidoM rca;
    private boolean flag = false;
    String aux = "En espera...MA";
    private boolean dead = false;
    private MutexA mutex;
    
    HiloA   (JTextArea area, RCompartidoM rca){
        this.area = area;
        this.rca = rca;
        mutex = new MutexA();    
    }
    
    public void despertar(){
        flag = true;
    }
            
    public void dormir (){
        flag = false;
    }
    
    public void run(){
        while (true){
            try{
               if(mutex.trylock()){
                   mutex.lock();
                   rca.setDatoCompartido(this.getName());
                   area.append(rca.getDatoCompartido()+": Eats-MA" + "\n");
                   if(isDead()) 
                       stop();    
                     
                   mutex.unlock();
               }
               else{
                   area.append(aux+"\n");
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
        dead = d;
    }
}
