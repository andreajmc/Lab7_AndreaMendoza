package lab7_andreamendoza;

import java.io.Serializable;
import java.util.Date;

public class Cita implements Serializable{
private Date fecha;
private Usuario U1;
private String lugar;

    public Cita(Date fecha, Usuario U1, String lugar) {
        this.fecha = fecha;
        this.U1 = U1;
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getU1() {
        return U1;
    }

    public void setU1(Usuario U1) {
        this.U1 = U1;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return lugar + " con " + U1 + " el " + fecha;
    }


}
