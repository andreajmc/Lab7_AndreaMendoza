
package lab7_andreamendoza;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;

public class Usuario implements Serializable {
protected String name; 
protected int age;   
protected String sexo;
protected String un;
protected String pw;
protected ArrayList<String> intereses;
protected ArrayList<Usuario> amigos;
protected ArrayList<Usuario> dates;
protected String descripcion;
protected ArrayList<Mensajes> Mensajes;
protected ArrayList<Usuario> Solicitudes;
protected ArrayList<Usuario> Bloqueados;
protected ArrayList<Cita> Calendar;
protected boolean Premium;
protected Icon propic;

    public Usuario(String name, int age, String sexo, String un, String pw, ArrayList<String> intereses, ArrayList<Usuario> amigos, ArrayList<Usuario> dates, String descripcion,ArrayList<Mensajes> Mensajes, ArrayList<Usuario> Solicitudes, ArrayList<Usuario> Bloqueados, ArrayList<Cita> Calendar, boolean Premium, Icon propic) {
        this.name = name;
        this.age = age;
        this.sexo = sexo;
        this.un = un;
        this.pw = pw;
        this.intereses = intereses;
        this.amigos = amigos;
        this.dates = dates;
        this.descripcion = descripcion;
        this.Mensajes = Mensajes;
        this.Solicitudes = Solicitudes;
        this.Bloqueados = Bloqueados;
        this.Calendar = Calendar;
        this.Premium = Premium;
        this.propic = propic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public ArrayList<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<String> intereses) {
        this.intereses = intereses;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Usuario> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Usuario> dates) {
        this.dates = dates;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Mensajes> getMensajes() {
        return Mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> Mensajes) {
        this.Mensajes = Mensajes;
    }

    public ArrayList<Usuario> getSolicitudes() {
        return Solicitudes;
    }

    public void setSolicitudes(ArrayList<Usuario> Solicitudes) {
        this.Solicitudes = Solicitudes;
    }

    public ArrayList<Usuario> getBloqueados() {
        return Bloqueados;
    }

    public void setBloqueados(ArrayList<Usuario> Bloqueados) {
        this.Bloqueados = Bloqueados;
    }

    public ArrayList<Cita> getCalendar() {
        return Calendar;
    }

    public void setCalendar(ArrayList<Cita> Calendar) {
        this.Calendar = Calendar;
    }

    public boolean isPremium() {
        return Premium;
    }

    public void setPremium(boolean Premium) {
        this.Premium = Premium;
    }

    @Override
    public String toString() {
        return name;
    }

    public Icon getPropic() {
        return propic;
    }

    public void setPropic(Icon propic) {
        this.propic = propic;
    }

    


}
