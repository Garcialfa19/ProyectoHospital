package sample;

public class Padecimiento {
    String tipoPadecimiento;
    String nombrePadecimiento;
    String descripcionPadecimiento;

    public Padecimiento(String tipoPadecimiento, String nombrePadecimiento, String descripcionPadecimiento) {
        this.tipoPadecimiento = tipoPadecimiento;
        this.nombrePadecimiento = nombrePadecimiento;
        this.descripcionPadecimiento = descripcionPadecimiento;
    }

    // to string is only her for testing purposes.
    @Override
    public String toString() {
        return "Padecimiento{" +
                "tipoPadecimiento='" + tipoPadecimiento + '\'' +
                ", nombrePadecimiento='" + nombrePadecimiento + '\'' +
                ", descripcionPadecimiento='" + descripcionPadecimiento + '\'' +
                '}';
    }
}
