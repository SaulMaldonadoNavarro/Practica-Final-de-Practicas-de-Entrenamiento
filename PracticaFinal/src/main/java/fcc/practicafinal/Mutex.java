package fcc.practicafinal;
/**
 * @author saulm
 */
public class Mutex {
   private boolean pase = false;
     Mutex(){
    
    }
     
     public void lock(){
         try{
             wait();
         }catch(Exception e){e.printStackTrace();}
     }
     
     public void unlock(){
         notify();
     }
}
