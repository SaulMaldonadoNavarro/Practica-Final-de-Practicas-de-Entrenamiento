package fcc.practicafinal;
import java.util.ArrayList;
/**
 * @author saulm
 */
public class RCompartidoD {
    private String  datoCompartido;
    private boolean Aturnos[] = {false, false, false, false};
    private int turno;
    
    
    public String getDatoCompartido() {
        return datoCompartido;
    }
    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }
    
    public boolean[] getAturnos() {
        return Aturnos;
    }
    public void setAturnos(int p, boolean f) {
        this.Aturnos[p] = f;
    }
    
    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    } 
}
