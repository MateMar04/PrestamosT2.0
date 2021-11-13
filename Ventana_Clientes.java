import javax.swing.*;

public class Ventana_Clientes extends javax.swing.JFrame {
    private JPanel panel1;
    private JComboBox seleccion_c;
    private JComboBox seleccion_p;
    private JLabel nombre;
    private JLabel telefono;
    private JLabel mail;
    private JLabel direccion;

    public Ventana_Clientes() {
        add(panel1);
        setTitle("Biblioteca");
        setSize(400, 400);
    }
}
