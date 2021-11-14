import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class Ventana_Clientes extends javax.swing.JFrame {
    private JPanel panel1;
    private JComboBox seleccion_c;
    private JComboBox seleccion_p;
    private JLabel nombre;
    private JLabel telefono;
    private JLabel mail;
    private JLabel direccion;

    public Ventana_Clientes(Biblioteca biblio) {
        add(panel1);
        setTitle("Biblioteca");
        setSize(500, 400);

        ArrayList<Cliente> clientes = biblio.mostrarClientes();
        Vector comboBoxItems = new Vector();

        for (int i = 0; i < clientes.size(); i++) {
            comboBoxItems.add(clientes.get(i).getNombre());
        }

        seleccion_c.setModel(new javax.swing.DefaultComboBoxModel(comboBoxItems));
        seleccion_c.setSelectedIndex(-1);
        seleccion_c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente c = clientes.get(seleccion_c.getSelectedIndex());
                nombre.setText(c.getNombre());
                telefono.setText(c.getTelefono());
                mail.setText(c.getEmail());
                direccion.setText(c.getDirec().toString());

                Vector comboBoxItems = new Vector();
                ArrayList<Prestamo> prestamos = biblio.MostrarListaPrestamos();
                for (int i = 0; i < biblio.CantidadDePrestamos(); i++) {
                    ArrayList<Publicacion> publicacionesPrestadas = prestamos.get(i).getLista();
                    if (prestamos.get(i).getCliente() == c) {
                        for (int j = 0; j < publicacionesPrestadas.size(); j++) {
                            comboBoxItems.add(publicacionesPrestadas.get(i).getTitulo());
                        }
                    }
                }
                seleccion_p.setModel(new javax.swing.DefaultComboBoxModel(comboBoxItems));
                seleccion_p.setSelectedIndex(-1);
            }
        });
    }
}
