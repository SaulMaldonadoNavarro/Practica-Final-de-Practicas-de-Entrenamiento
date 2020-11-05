package fcc.practicafinal;
/**
 * @author saulm
 */
public class MutexA {
       private boolean pase;
    
    MutexA (){
        pase=false;
    }
    public synchronized void lock(){
       while(pase){
           try{
               wait();
           }catch(InterruptedException e){System.out.println("LOCK ERROR" + e.toString());}
       }
    }
    
     public synchronized void unlock(){
        this.pase = false;
        notify();
    }
    
    public boolean trylock(){      
        if(!pase){
            return true;
        }
        else{
            try{
                wait();
            }catch(Exception e){}
            finally{
                unlock();
                return false;
            }
        }
        
    } 

    public synchronized boolean getpase(){
        return pase;
    }
    
    public synchronized void setpase(boolean d){
        this.pase = d;
    }
}
