package libreria;

import static libreria.IO.*;

public class Libreria {

    public static void main(String[] args) {
        //creamos dos objetos e indicamos cómo queremos que se muestren
        IO miIO = IO.introducir(VENTANA);
        miIO.mostrar("Hola");
        
        IO miIO2 = IO.introducir(CONSOLA);
        miIO2.mostrar("Adios");

    }

}
