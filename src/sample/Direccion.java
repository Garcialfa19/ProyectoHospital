package sample;

public class Direccion {
    String direccionGeneral;
    String distrito;
    String canton;
    String provincia;

    public Direccion(String direccionGeneral, String distrito, String canton, String provincia) {
        this.direccionGeneral = direccionGeneral;
        this.distrito = distrito;
        this.canton = canton;
        this.provincia = provincia;
    }


    // to string is only her for testing purposes.
    @Override
    public String toString() {
        return "Direccion: " +
                "Direccion General: " + direccionGeneral + '\n' +
                "Distrito: " + distrito + '\n' +
                "Canton: " + canton + '\n' +
                "Provincia; " + provincia + '\n';
    }
}
