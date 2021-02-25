package sample;

public class Educacion {
    String especialidad;
    String titulo;
    String universidad;
    String pais;
    String mesFinalizacionEst;
    String añoFinalizacionEst;

    public Educacion(String especialidad, String titulo, String universidad, String pais, String mesFinalizacionEst, String añoFinalizacionEst) {
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.universidad = universidad;
        this.pais = pais;
        this.mesFinalizacionEst = mesFinalizacionEst;
        this.añoFinalizacionEst = añoFinalizacionEst;
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "especialidad='" + especialidad + '\'' +
                ", titulo='" + titulo + '\'' +
                ", universidad='" + universidad + '\'' +
                ", pais='" + pais + '\'' +
                ", mesFinalizacionEst='" + mesFinalizacionEst + '\'' +
                ", añoFinalizacionEst='" + añoFinalizacionEst + '\'' +
                '}';
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMesFinalizacionEst() {
        return mesFinalizacionEst;
    }

    public void setMesFinalizacionEst(String mesFinalizacionEst) {
        this.mesFinalizacionEst = mesFinalizacionEst;
    }

    public String getAñoFinalizacionEst() {
        return añoFinalizacionEst;
    }

    public void setAñoFinalizacionEst(String añoFinalizacionEst) {
        this.añoFinalizacionEst = añoFinalizacionEst;
    }
}
