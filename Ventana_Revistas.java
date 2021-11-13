import javax.swing.*;

public class Ventana_Revistas extends javax.swing.JFrame{
    private JPanel panel1;
    private JComboBox seleccion_r;
    private JLabel editorial;
    private JLabel categoria;
    private JLabel autor;
    private JPanel titulo;

    public Ventana_Revistas(){
        add(panel1);
        setTitle("Biblioteca");
        setSize(400, 400);
    }
}
