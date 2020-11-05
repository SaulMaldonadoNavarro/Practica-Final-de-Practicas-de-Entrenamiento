package fcc.practicafinal;
import java.util.ArrayList;

/**
 * @author saulm
 */
public class RCompartidoDI {
        private String datoCompartido;
        private ArrayList<Interrupcion> interrupciones;
        

      RCompartidoDI(){

         datoCompartido = "" ;
         interrupciones = new ArrayList<Interrupcion>();
         for(int i =0; i<10; i++){
             interrupciones.add(new Interrupcion());
         }
     }

     public String getDatoCompartido() {
         String aux = "En espera...";
         if(isEntra()){
             bloquea();
             aux=datoCompartido;
             desbloquea();
         }
         return aux;
     }

     public void setDatoCompartido(String datoCompartido) {
         for (Interrupcion i: interrupciones)
             if(i.isInter())
                 this.datoCompartido = datoCompartido;
     } 
     
     
    public ArrayList<Interrupcion> getInterrupciones() {
        return interrupciones;
    }

    
    public void setInterrupciones(ArrayList<Interrupcion> interrupciones) {
        this.interrupciones = interrupciones;
    }
    
    public void bloquea(){
        for (Interrupcion inter: interrupciones)
            inter.setInter(false);  
    }
    
    public void desbloquea(){
        for (Interrupcion inter: interrupciones)
            inter.setInter(true);
    }
    
    public boolean isEntra(){
        boolean ban = false;
        for (Interrupcion i: interrupciones)
            if(i.isInter()){
                ban=true;
            } else{
                return false;
            }
        return ban;
    }
}
