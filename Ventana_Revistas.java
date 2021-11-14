import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class Ventana_Revistas extends javax.swing.JFrame {
    private JPanel panel1;
    private JComboBox seleccion_r;
    private JLabel editorial;
    private JLabel categoria;
    private JLabel autor;
    private JLabel titulo;

    public Ventana_Revistas(Biblioteca biblio) {
        add(panel1);
        setTitle("Biblioteca");
        setSize(400, 400);

        ArrayList<Revista> revistas = biblio.mostrarRevistas();
        Vector comboBoxItems = new Vector();

        for (Revista r : revistas) {
            comboBoxItems.add(r.getTitulo());
        }

        seleccion_r.setModel(new javax.swing.DefaultComboBoxModel(comboBoxItems));
        seleccion_r.setSelectedIndex(-1);


        seleccion_r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Revista revista = revistas.get(seleccion_r.getSelectedIndex());
                titulo.setText(revista.getTitulo());
                autor.setText(revista.getAutor().toString());
                editorial.setText(revista.getEditorial().toString());
                categoria.setText(revista.getCategoria().toString());
            }
        });
    }
}
