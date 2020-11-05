package fcc.practicafinal;
import javax.swing.JTextArea;
/**
 * @author saulm
 */
public class HiloD extends Thread{
    private JTextArea area;
    private RCompartidoD rcd;
    private boolean flag = false;
    private String aux = "En espera...D";
    private int turno;
    
    HiloD (JTextArea area, RCompartidoD rcd){
        this.area = area;
        this.rcd = rcd;
        turno = rcd.getTurno();
    }
    
    public void despertar(){
        flag = true;
    }
            
    public void dormir (){
        flag = false;
    }
    
    public void run(){
        while (flag == true){
               try{
                       
                   //System.out.println(this.getName()+": "+this.turno);
                   //Cuadno es 0 indica que puede tomar el turno
                   rcd.setAturnos(rcd.getTurno(), true);
                   //Mientras no este ocupando su turno (sea 0)
                   while(isTurno() != -1){
                      rcd.setAturnos(rcd.getTurno(), false);
                       Thread.sleep((int)(1995+Math.random()*200));
                   }
                   //Entra a su seccion crítica
                   rcd.setAturnos(rcd.getTurno(), true);
                   rcd.setDatoCompartido(this.getName());
                   area.append(rcd.getDatoCompartido()+": Eats-D"+"\n");
                  

                        Thread.sleep((int)(1995+Math.random()*200));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
            
        }
    }
    
    public int isTurno(){
        //Obtenemos el array booleano de turnos 
        boolean b[] = rcd.getAturnos();
        //Verificamos si elmespcio del array reservado para ese peroceso esta libre o no
        for(int i=0;i<b.length;i++){
            if(rcd.getTurno() != i){
                if(b[i]){
                    return i; 
                }
            }
        }
        return -1;
    }  
}
