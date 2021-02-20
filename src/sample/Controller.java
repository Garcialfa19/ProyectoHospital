package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {

    /* esto vincula las flechas con el codigo, basicamente es lo que permite que
    * as fleschas aparescan y desaparescan, dando la impresion de que se estan moviendo */
    @FXML private ImageView doctorArrow;
    @FXML private ImageView clinicaArrow;
    @FXML private ImageView padecimientosArrow;
    @FXML private ImageView pacienteArrow;
    @FXML private ImageView citasArrow;
    @FXML private ImageView busquedasArrow;
    @FXML private ImageView correoArrow;
    @FXML private ImageView reviewArrow;
    @FXML private ImageView agregarArrow;

    // esto vincula los paneles con el codigo, permite cambiar de panel
    @FXML private AnchorPane topPane;
    @FXML private AnchorPane doctorPane;
    @FXML private AnchorPane clinicaPane;
    @FXML private AnchorPane padecimientoPane;
    @FXML private AnchorPane pacientePane;
    @FXML private AnchorPane citasPane;
    @FXML private AnchorPane busquedasPane;
    @FXML private AnchorPane correoPane;
    @FXML private AnchorPane reviewPane;
    @FXML private AnchorPane agregarPane;


    /* todo lo que viene a continuacion es lo que permite que al darle click a los botones
    *   los paneles cambien y la flecha se mueva */

    public void botonDoctorApretado(MouseEvent event) {
        // estos tienen que estar puestos en true para que se vean al ser seleccionados
        doctorPane.setVisible(true);
        doctorArrow.setVisible(true);

        // este siempre tiene que estar en true
        topPane.setVisible(true);

        // estos estan en false porque no se quiere que se vean
        clinicaArrow.setVisible(false);
        clinicaPane.setVisible(false);
        padecimientosArrow.setVisible(false);
        padecimientoPane.setVisible(false);
        pacienteArrow.setVisible(false);
        pacientePane.setVisible(false);
        citasArrow.setVisible(false);
        citasPane.setVisible(false);
        busquedasArrow.setVisible(false);
        busquedasPane.setVisible(false);
        correoArrow.setVisible(false);
        correoPane.setVisible(false);
        reviewArrow.setVisible(false);
        reviewPane.setVisible(false);
        agregarArrow.setVisible(false);
        agregarPane.setVisible(false);
    }

        public void botonClinicaApretado (MouseEvent event){
            //estos estan en true porque son los que se quiere que sean visibles
            clinicaPane.setVisible(true);
            clinicaArrow.setVisible(true);

            // este siempre tiene que estar en true
            topPane.setVisible(true);

            // estos estan en false porque no se quiere que se vean
            doctorArrow.setVisible(false);
            doctorPane.setVisible(false);
            clinicaArrow.setVisible(false);
            clinicaPane.setVisible(false);
            padecimientosArrow.setVisible(false);
            padecimientoPane.setVisible(false);
            pacienteArrow.setVisible(false);
            pacientePane.setVisible(false);
            citasArrow.setVisible(false);
            citasPane.setVisible(false);
            busquedasArrow.setVisible(false);
            busquedasPane.setVisible(false);
            correoArrow.setVisible(false);
            correoPane.setVisible(false);
            reviewArrow.setVisible(false);
            reviewPane.setVisible(false);
            agregarArrow.setVisible(false);
            agregarPane.setVisible(false);

        }

        public void botonPadecimientosApretado (MouseEvent event){
            // estos estan en true porque son los que se quiere que se vean
            padecimientoPane.setVisible(true);
            padecimientosArrow.setVisible(true);

            // este siempre tiene que estar en true
            topPane.setVisible(true);

            // estos estan en false porque no se quiere que se vean
            doctorArrow.setVisible(false);
            doctorPane.setVisible(false);
            clinicaArrow.setVisible(false);
            clinicaPane.setVisible(false);
            pacienteArrow.setVisible(false);
            pacientePane.setVisible(false);
            citasArrow.setVisible(false);
            citasPane.setVisible(false);
            busquedasArrow.setVisible(false);
            busquedasPane.setVisible(false);
            correoArrow.setVisible(false);
            correoPane.setVisible(false);
            reviewArrow.setVisible(false);
            reviewPane.setVisible(false);
            agregarArrow.setVisible(false);
            agregarPane.setVisible(false);

        }

        public void botonPacienteApretado (MouseEvent event){
            // estos estan en true porque son los que se quiere que se vean
            pacientePane.setVisible(true);
            pacienteArrow.setVisible(true);

            // este siempre tiene que estar en true
            topPane.setVisible(true);

            // estos estan en false porque no se quiere que se vean
            doctorArrow.setVisible(false);
            doctorPane.setVisible(false);
            clinicaArrow.setVisible(false);
            clinicaPane.setVisible(false);
            padecimientosArrow.setVisible(false);
            padecimientoPane.setVisible(false);
            citasArrow.setVisible(false);
            citasPane.setVisible(false);
            busquedasArrow.setVisible(false);
            busquedasPane.setVisible(false);
            correoArrow.setVisible(false);
            correoPane.setVisible(false);
            reviewArrow.setVisible(false);
            reviewPane.setVisible(false);
            agregarArrow.setVisible(false);
            agregarPane.setVisible(false);

        }

        public void botonCitasApretado (MouseEvent event){
            // estos estan en true porque son los que se quiere que sean visibles
            citasPane.setVisible(true);
            citasArrow.setVisible(true);

            // este siempre tiene que estar en true
            topPane.setVisible(true);

            // estos estan en false porque no se quiere que se vean
            doctorArrow.setVisible(false);
            doctorPane.setVisible(false);
            clinicaArrow.setVisible(false);
            clinicaPane.setVisible(false);
            padecimientosArrow.setVisible(false);
            padecimientoPane.setVisible(false);
            pacienteArrow.setVisible(false);
            pacientePane.setVisible(false);
            busquedasArrow.setVisible(false);
            busquedasPane.setVisible(false);
            correoArrow.setVisible(false);
            correoPane.setVisible(false);
            reviewArrow.setVisible(false);
            reviewPane.setVisible(false);
            agregarArrow.setVisible(false);
            agregarPane.setVisible(false);

        }

        public void botonBusquedasApretado (MouseEvent event){
            // estos estan en true porque son los que se quiere que sean visibles
            busquedasPane.setVisible(true);
            busquedasArrow.setVisible(true);

            // este siempre tiene que estar en true
            topPane.setVisible(true);

            // estos estan en false porque no se quiere que se vean
            doctorArrow.setVisible(false);
            doctorPane.setVisible(false);
            clinicaArrow.setVisible(false);
            clinicaPane.setVisible(false);
            padecimientosArrow.setVisible(false);
            padecimientoPane.setVisible(false);
            pacienteArrow.setVisible(false);
            pacientePane.setVisible(false);
            citasArrow.setVisible(false);
            citasPane.setVisible(false);
            correoArrow.setVisible(false);
            correoPane.setVisible(false);
            reviewArrow.setVisible(false);
            reviewPane.setVisible(false);
            agregarArrow.setVisible(false);
            agregarPane.setVisible(false);

        }

        public void botonCorreoApretado (MouseEvent event){
            // voy a suponer que ya sabe porque es que estos estan en true
            correoPane.setVisible(true);
            correoArrow.setVisible(true);

            // este siempre tiene que estar en true
            topPane.setVisible(true);

            // estos estan en false porque no se quiere que se vean
            doctorArrow.setVisible(false);
            doctorPane.setVisible(false);
            clinicaArrow.setVisible(false);
            clinicaPane.setVisible(false);
            padecimientosArrow.setVisible(false);
            padecimientoPane.setVisible(false);
            pacienteArrow.setVisible(false);
            pacientePane.setVisible(false);
            citasArrow.setVisible(false);
            citasPane.setVisible(false);
            busquedasArrow.setVisible(false);
            busquedasPane.setVisible(false);
            reviewArrow.setVisible(false);
            reviewPane.setVisible(false);
            agregarArrow.setVisible(false);
            agregarPane.setVisible(false);

        }

        public void botonReviewApretado (MouseEvent event){
            // la verdad ya estoy cansado de escribir este comentario, pero lo tengo que hacer por motivos de simetria
            reviewPane.setVisible(true);
            reviewArrow.setVisible(true);

            // este siempre tiene que estar en true
            topPane.setVisible(true);

            // estos estan en false porque no se quiere que se vean
            doctorArrow.setVisible(false);
            doctorPane.setVisible(false);
            clinicaArrow.setVisible(false);
            clinicaPane.setVisible(false);
            padecimientosArrow.setVisible(false);
            padecimientoPane.setVisible(false);
            pacienteArrow.setVisible(false);
            pacientePane.setVisible(false);
            citasArrow.setVisible(false);
            citasPane.setVisible(false);
            busquedasArrow.setVisible(false);
            busquedasPane.setVisible(false);
            correoArrow.setVisible(false);
            correoPane.setVisible(false);
            agregarArrow.setVisible(false);
            agregarPane.setVisible(false);

        }

        public void botonAgregarApretado (MouseEvent event){
            // llevo como media hora en esto y este comentario es el unico que no puedo copiar y pegar
            agregarPane.setVisible(true);
            agregarArrow.setVisible(true);

            // este siempre tiene que estar en true
            topPane.setVisible(true);

            // estos estan en false porque no se quiere que se vean
            doctorArrow.setVisible(false);
            doctorPane.setVisible(false);
            clinicaArrow.setVisible(false);
            clinicaPane.setVisible(false);
            padecimientosArrow.setVisible(false);
            padecimientoPane.setVisible(false);
            pacienteArrow.setVisible(false);
            pacientePane.setVisible(false);
            citasArrow.setVisible(false);
            citasPane.setVisible(false);
            busquedasArrow.setVisible(false);
            busquedasPane.setVisible(false);
            correoArrow.setVisible(false);
            correoPane.setVisible(false);
            reviewArrow.setVisible(false);
            reviewPane.setVisible(false);

        }


}