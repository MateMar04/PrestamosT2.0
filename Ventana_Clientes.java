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
        setSize(400, 400);

        ArrayList<Cliente> clientes = biblio.mostrarClientes();
        Vector comboBoxItems = new Vector();

        for (Cliente cliente : clientes) {
            comboBoxItems.add(cliente.getNombre());
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
                for (Prestamo p : biblio.MostrarListaPrestamos()) {
                    ArrayList<Publicacion> publicacionesPrestadas = p.getLista();
                    if (p.getCliente() == c) {
                        for (Publicacion pu : publicacionesPrestadas) {
                            comboBoxItems.add(pu.getTitulo());
                        }
                    }
                }
                seleccion_p.setModel(new javax.swing.DefaultComboBoxModel(comboBoxItems));
                seleccion_p.setSelectedIndex(-1);
            }
        });
    }
}
