package libreria;

public class Libreria {

    public static void main(String[] args) {
        //creamos dos objetos e indicamos cómo queremos que se muestren, si por ventana o consola
        IO miIO = IO.introducir(IO.Tipo.VENTANA);
        miIO.mostrar("Hola");

        IO miIO2 = IO.introducir(IO.Tipo.CONSOLA);
        miIO2.mostrar("Adios");

    }

}
