import java.util.Vector;

/**
 * @author moise
 *
 */
public class StackVector<E> extends Stack<E> {
    private Vector<E> datos;

    /**
     * Constructor de la clase
     * Crea un nuevo Vector para almacenar los datos
     */
    public StackVector() {
        datos = new Vector<E>();
    }

    /**
     * Añade un nuevo elemento a la pila
     * @param item Elemento a añadir a la pila
     * @return Un boolean que indica que se realizo la operacion
     */
    @Override
    public boolean push(E item) {
        datos.add(item);
        return true;     
    }


    /**
     * Devuelve el último elemento de la pila sin borrarlo
     * @return El último elemento de la pila
     */
    @Override
    public E peek() {
        return(datos.get(datos.size() - 1));
    }

    /**
     * Revisa si la pila esta vacía
     * @return Boolean que indica si está vacia la pila
     */
    @Override
    public boolean isEmpty() {
        return datos.isEmpty();
    }

    /**
     * Devuelve el tamaño de la pila
     * @return El tamaño de la pila
     */
    @Override
    public int count() {
        return datos.size();
    }


    /**
     * Devuelve el ultimo elemento de la pila y lo elimina
     * @return El último elemento de la pila
     */
    @Override
    public E pop() {
        return (datos.remove(datos.size() - 1));
    }
}
