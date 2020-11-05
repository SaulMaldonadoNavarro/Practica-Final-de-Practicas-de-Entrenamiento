package fcc.practicafinal;
import javax.swing.JTextArea;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author saulm
 */
public class HiloDijkstra extends Thread {
    private JTextArea area;
    private RCompartido rc;
    private boolean flag = false;
    private final int id;
    private static final int Nthreads = 4;
    private static volatile boolean[] wannaB = new boolean[Nthreads];
    private static volatile boolean[] seccionC = new boolean[Nthreads];
    private static volatile int k = (int) (Math.random()*4+1);//ThreadLocalRandom.current().nextInt(Nthreads);;// Segun  Dijkstra k no importa donded empieza mientras 1<k<N por lo que igual pude ser un ThreadLocalRandom.current().nextInt(Nthreads);
    
    HiloDijkstra(JTextArea area, RCompartido rc, int id){
        this.area =area;
        this.rc=rc;
        this.id=id;
        for(int i = 0; i<4; i++){
            wannaB[i] = false;
            seccionC[i] = false;
        }
    }
    
    public void despertar(){
        flag = true;
    }
            
    public void dormir (){
        flag = false;
    }
    
    //Todos en vez de empezar en true empiezan en false
    //Los arrays se vuelven a signar despues de cada cambio por su estado de volatil
    //Que hace la referencia del array sea volatil pero no su contenido, es por eso la autoasignación 
    public void run(){
        //dijkstra es una label que va a funcionar como el goto principal
             dijkstra:
            while (flag == true) {
                wannaB[id] = true;
                wannaB = wannaB;

                while (k != id) {
                    seccionC[id] = false;
                    seccionC = seccionC;
                    if (!wannaB[k]) {
                        k = id;
                    }
                }//goto Li1
                
//Busca uno por uno que todo este listo (en false los demas) para que solo uno entre a la seccion critica
//En caso de encontrar uno verdadero continuara sin entrar a la seccion critica
//La unica opcion para entrar a su sc es si seccionC[id] = true y los demas estan en false
                
                seccionC[id] = true;
                seccionC = seccionC;
                for (int j = 0; j < seccionC.length; j++) {
                    if (j != id && seccionC[j]) {
                        System.out.println("Ocupado por "+this.getName());
                        continue dijkstra; //goto Li1
                    }
                }
//solo llegando hasta aquí entra a la seccion critica
                 try{
                rc.setDatoCompartido(this.getName());
                area.append(rc.getDatoCompartido()+": Eats-P"+"\n");
                Thread.sleep(1000);
             }catch(Exception e){e.printStackTrace();}
//Se reinicia su turno
                seccionC[id] = false;
                seccionC = seccionC;
                wannaB[id] = false;
                wannaB = wannaB;
            }   //goto Li0     
    }       
}
