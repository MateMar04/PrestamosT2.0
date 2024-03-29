import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class Ventana_Libros extends javax.swing.JFrame {
    private JPanel panel_principal;
    private JComboBox seleccion_l;
    private JLabel titulo;
    private JLabel autor;
    private JLabel categoria;
    private JLabel editorial;

    public Ventana_Libros(Biblioteca biblio) {
        add(panel_principal);
        setSize(500, 400);
        setTitle("Libros");

        ArrayList<Libro> libros = biblio.mostrarLibros();
        Vector comboBoxItems = new Vector();

        for (int i = 0; i < libros.size(); i++) {
            comboBoxItems.add(libros.get(i).getTitulo());
        }

        seleccion_l.setModel(new javax.swing.DefaultComboBoxModel(comboBoxItems));
        seleccion_l.setSelectedIndex(-1);
        seleccion_l.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Libro libro = libros.get(seleccion_l.getSelectedIndex());
                titulo.setText(libro.getTitulo());
                autor.setText(libro.getAutor().toString());
                categoria.setText(libro.getCategoria().toString());
                editorial.setText(libro.getEditorial().toString());
            }
        });
    }
}
