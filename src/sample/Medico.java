package sample;

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

    public String ObtenerNombre(){

        return nombre;
    }

}


