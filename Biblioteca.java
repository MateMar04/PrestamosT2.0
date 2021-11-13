import java.util.ArrayList;

class Biblioteca {
    private final String nombre;
    private final ArrayList<Publicacion> listaPublicacion;
    private final ArrayList<Prestamo> listaPrestamos;
    private final ArrayList listaLibro;
    private final ArrayList listaRevista;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaPublicacion = new ArrayList();
        listaPrestamos = new ArrayList();
        listaLibro = new ArrayList();
        listaRevista = new ArrayList();
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
        for (Publicacion publicacion : listaPublicacion) {
            System.out.println(publicacion);
        }
    }

    void MostrarListaPrestamos() {
        for (Prestamo prestamo : listaPrestamos) {
            System.out.println(prestamo);
        }
    }

    int CantidadDeRevistas() {
        return listaRevista.size();
    }

}


