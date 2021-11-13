import java.util.ArrayList;

class Prestamo {
    private final Cliente cliente;
    private final String FechaDePrestamo;
    private final String FechaTentativaDeDevolucion;
    ArrayList<Publicacion> lista;

    public Prestamo(Cliente cliente, String FechaDePrestamo, String FechaTentativaDeDevolucion) {
        this.cliente = cliente;
        this.FechaDePrestamo = FechaDePrestamo;
        this.FechaTentativaDeDevolucion = FechaTentativaDeDevolucion;
        lista = new ArrayList();
    }

    @Override
    public String toString() {
        return "Prestamo{" + cliente + ", FechaDePrestamo=" + FechaDePrestamo + ", FechaTentativaDeDevolucion=" + FechaTentativaDeDevolucion + '}';
    }

    void agregar(Publicacion pub) {
        lista.add(pub);
    }
}
