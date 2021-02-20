package sample;

import java.awt.*;

public class Clinica {
    String nombreClinica;
    Direccion direccion;
    String image;

    public Clinica(String nombreCllinica, Direccion direccion, String image) {
        this.nombreClinica = nombreCllinica;
        this.direccion = direccion;
        this.image = image;
    }

    // to string is only her for testing purposes.
    @Override
    public String toString() {
        return "Clinica: " + '\n' +
                "Nombre Clinica: " + nombreClinica + '\n' +
                "Direccion: " + direccion +
                "Image: " + image + '\n';
    }
}
