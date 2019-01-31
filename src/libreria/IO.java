package libreria;

/**
 *
 * @author Alba Perez Cesar
 */
abstract class IO implements MetodosComunes {

    /**
     * Variable utilizada para seleccionar que el programa se ejecute en la
     * consola
     */
    public static final int CONSOLA = 0;

    /**
     * Variable utilizada para seleccionar que el programa se ejecute en una
     * ventana emergente
     */
    public static final int VENTANA = 1;

    /**
     *
     * @param tipo Parametro donde introducimos una de las dos variables
     * anteriores, para que salga en consola o ventana
     * @return <code> numeroAImprimir</code>
     */
    public static IO introducir(int tipo) {
        IO IOCreado;
        switch (tipo) {
            case CONSOLA:
                IOCreado = new ConsDialogo();
                break;

            case VENTANA:
                IOCreado = new WinDialogo();
                break;
            default:
                IOCreado = null;
        }
        return IOCreado;
    }

    /**
     *
     * @param miNumero Parametro de tipo int en el que introducimos un valor o
     * variable, que se mostrara en consola
     */
    public static void mostrar(int msg) {
        System.out.println("Número int: " + msg);
    }

    /**
     *
     * @param miNumero Parametro de tipo String en el que introducimos un valor
     * o variable, que se mostrara en consola
     */
    @Override
    public void mostrar(String msg) {
        System.out.println("Mensaje String: " + msg);
    }

    /**
     *
     * @param miNumero Parametro de tipo float en el que introducimos un valor o
     * variable que se mostrara en consola
     */
    public static void mostrar(float msg) {
        System.out.println("Número float: " + msg);
    }
}
