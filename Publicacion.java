public abstract class Publicacion {
    private final String titulo;
    private final Autor autor;
    private final Categoria categoria;
    private final Editorial editorial;

    public Publicacion(String titulo, Autor autor, Categoria categoria, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.editorial = editorial;
    }
}
