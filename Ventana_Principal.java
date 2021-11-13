import javax.swing.*;

public class Ventana_Principal extends javax.swing.JFrame{
    private JPanel panel1;
    private JButton clientesButton;
    private JButton librosButton;
    private JButton revistasButton;
    private JLabel cant_publicaciones;
    private JLabel cant_libros;
    private JLabel cant_revistas;

    public Ventana_Principal() {
        add(panel1);
        setTitle("Biblioteca");
        setSize(400, 400);

    }
}
