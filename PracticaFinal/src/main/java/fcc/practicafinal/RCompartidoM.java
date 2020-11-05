package fcc.practicafinal;
/**
 * @author saulm
 */
public class RCompartidoM {
   
        private String datoCompartido;
        private Mutex m;
      
        RCompartidoM(){

         datoCompartido = "";
     }

     public String getDatoCompartido() {
   
             return datoCompartido;
     }

     public void setDatoCompartido(String datoCompartido) {

             this.datoCompartido = datoCompartido;
        
     }  
}
