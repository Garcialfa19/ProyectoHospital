package sample;

import java.util.Arrays;

public class Medico {
    String nombre;
    String cedula;
    String correoElectronico;
    String slogan;
    String [] centroMedico;
    String [] procedimiento;
    int [] costoProcedimiento;
    String [] idioma;
    String afiliacion;

    public Medico(){

    }
    public Medico(String nombre, String cedula, String correoElectronico, String slogan, String[] centroMedico, String[] procedimiento, int[] costoProcedimiento, String[] idioma, String afiliacion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.slogan = slogan;
        this.centroMedico = centroMedico;
        this.procedimiento = procedimiento;
        this.costoProcedimiento = costoProcedimiento;
        this.idioma = idioma;
        this.afiliacion = afiliacion;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", slogan='" + slogan + '\'' +
                ", centroMedico=" + Arrays.toString(centroMedico) +
                ", procedimiento=" + Arrays.toString(procedimiento) +
                ", costoProcedimiento=" + Arrays.toString(costoProcedimiento) +
                ", idioma=" + Arrays.toString(idioma) +
                ", afiliacion='" + afiliacion + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String[] getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String[] centroMedico) {
        this.centroMedico = centroMedico;
    }

    public String[] getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String[] procedimiento) {
        this.procedimiento = procedimiento;
    }

    public int[] getCostoProcedimiento() {
        return costoProcedimiento;
    }

    public void setCostoProcedimiento(int[] costoProcedimiento) {
        this.costoProcedimiento = costoProcedimiento;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }
}


