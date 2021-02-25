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

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
