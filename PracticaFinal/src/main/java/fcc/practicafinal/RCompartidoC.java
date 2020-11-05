package fcc.practicafinal;
/**
 * @author saulm
 */
public class RCompartidoC {

        private String datoCompartido;
        private VCerradura vcerr;
        private String aux = "En espera...C";
      
        RCompartidoC(){

         datoCompartido = "" ;
         vcerr = new VCerradura();
     }

     public String getDatoCompartido() {
         
         if(!vcerr.isVcerr()){
             vcerr.Cierra();
             aux = datoCompartido;
             vcerr.Abre();
         }
         return aux;
     }

     public void setDatoCompartido(String datoCompartido) {
        if(!vcerr.isVcerr()){
             vcerr.Cierra();
             this.datoCompartido = datoCompartido;
             vcerr.Abre();
         }
                 
     } 
     



 }
