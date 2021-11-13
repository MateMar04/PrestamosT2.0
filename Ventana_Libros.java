import javax.swing.*;

public class Ventana_Libros extends javax.swing.JFrame {
    private JPanel panel1;
    private JComboBox seleccion_l;
    private JLabel titulo;
    private JLabel autor;
    private JLabel categoria;
    private JLabel editorial;

    public Ventana_Libros(Biblioteca biblio) {
        add(panel1);
        setTitle("Biblioteca");
        setSize(400, 400);
    }
}
