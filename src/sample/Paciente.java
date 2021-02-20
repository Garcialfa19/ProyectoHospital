package sample;

public class Paciente {
    String nombre;
    String cedula;
    String correoElectronico;
    String fotoPaciente;
    Padecimiento padecimiento;

    public Paciente(String nombre, String cedula, String correoElectronico, String fotoPaciente, Padecimiento padecimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.fotoPaciente = fotoPaciente;
        this.padecimiento = padecimiento;
    }


    // to string is only her for testing purposes.
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", fotoPaciente='" + fotoPaciente + '\'' +
                ", padecimiento=" + padecimiento +
                '}';
    }
}
