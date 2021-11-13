import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana_Principal extends javax.swing.JFrame {
    private JPanel panel1;
    private JButton clientesButton;
    private JButton librosButton;
    private JButton revistasButton;
    private JLabel cant_publicaciones;
    private JLabel cant_libros;
    private JLabel cant_revistas;

    public Ventana_Principal(Biblioteca biblio) {
        add(panel1);
        setTitle("Biblioteca");
        setSize(400, 400);

        cant_publicaciones.setText(String.valueOf(biblio.CantidadDePublicacionesTotal()));
        cant_libros.setText(String.valueOf(biblio.CantidadDeLibros()));
        cant_revistas.setText(String.valueOf(biblio.CantidadDeRevistas()));

        clientesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                new Ventana_Clientes(biblio).setVisible(true);
            }
        });
        librosButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                new Ventana_Libros(biblio).setVisible(true);
            }
        });
        revistasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                new Ventana_Revistas(biblio).setVisible(true);
            }
        });
    }
}
