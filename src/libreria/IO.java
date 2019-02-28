package libreria;

/**
 *
 * @author Alba Perez Cesar
 */
abstract class IO implements MetodosComunes {

    /**
     * Selecciona cómo se va a mostrar el mensaje
     */
    enum Tipo {
        CONSOLA,
        VENTANA
    }

    /**
     * Crea un objeto de tipo IO segun el tipo (enum) que indiquemos
     *
     * @param tipo CONSOLA, crea objeto de tipo ConsDialogo. VENTANA, crea
     * objeto de tipoWinDialogo
     * @return objeto IOCreado
     */
    public static IO introducir(Tipo tipo) {
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
     * Las subclases sobrescribirían este método.
     *
     * @param msg mensaje a mostrar
     */
    @Override
    public void mostrar(String msg) {
    }
}
