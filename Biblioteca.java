import java.util.ArrayList;

class Biblioteca {
    private final String nombre;
    private final ArrayList<Publicacion> listaPublicacion;
    private final ArrayList<Prestamo> listaPrestamos;
    private final ArrayList listaLibro;
    private final ArrayList listaRevista;
    private final ArrayList listaClientes;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaPublicacion = new ArrayList();
        listaPrestamos = new ArrayList();
        listaLibro = new ArrayList();
        listaRevista = new ArrayList();
        listaClientes = new ArrayList();
    }

    void agregar(Publicacion pub) {
        listaPublicacion.add(pub);
        if (pub.getClass() == Libro.class) {
            listaLibro.add(pub);
        }
        if (pub.getClass() == Revista.class) {
            listaRevista.add(pub);
        }
    }

    void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    void prestar(Prestamo pub) {
        listaPrestamos.add(pub);
    }

    int CantidadDePrestamos() {
        return listaPrestamos.size();
    }

    int CantidadDePublicacionesTotal() {
        return listaPublicacion.size();
    }

    int CantidadDeLibros() {
        return listaLibro.size();
    }


    void MostrarListaPublicaciones() {
        for (int i = 0; i < listaPublicacion.size(); i++) {
            System.out.println(listaPublicacion.get(i).toString());
        }
    }

    ArrayList<Prestamo> MostrarListaPrestamos() {
        return listaPrestamos;
    }

    int CantidadDeRevistas() {
        return listaRevista.size();
    }

    ArrayList<Cliente> mostrarClientes() {
        return listaClientes;
    }

    ArrayList<Libro> mostrarLibros() {
        return listaLibro;
    }

    ArrayList<Revista> mostrarRevistas() {
        return listaRevista;
    }

}


