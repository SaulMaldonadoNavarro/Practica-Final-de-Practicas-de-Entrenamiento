package fcc.practicafinal;
/**
 * @author saulm
 */
public class VCerradura {
   private boolean vcerr;
   
   VCerradura(){
       vcerr=false; //falso entra true sale
    }
   public boolean isVcerr(){
       return vcerr;
   }
   
   public void setVcerr(boolean vcerr){
       this.vcerr = vcerr;
   }
   
   public void Cierra(){
       vcerr = true;
   }
   
   public void Abre(){
       vcerr = false;
   }
}
