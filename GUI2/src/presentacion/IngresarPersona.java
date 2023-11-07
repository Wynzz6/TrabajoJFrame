package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {
    private JPanel pnlPrincipal;
    private JTextField txtCódigo;
    private JLabel lblCódigo;
    private JLabel iblNombre;
    private JTextField txtNombre;
    private JLabel iblApellido;
    private JTextField txtApellido;
    private JButton btnGuardar;
    private JLabel iblIdioma;
    private JComboBox cmbIdioma;

    private JCheckBox chbTerminos;
    private JLabel iblGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton radioButton1;

    public IngresarPersona() {
this.setTitle("Ventana Ingresar Persona");
this.setContentPane(pnlPrincipal);
this.setSize(400, 300);

this.setVisible(true);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo =  txtCódigo.getText();
                String Nombre = txtNombre.getText();
                String Apellido = txtApellido.getText();
                String Idioma = cmbIdioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected()== true) ? "Si" : "No";



                String mensaje = "Tus datos son: \n" +
                                 "Código: " + codigo + "\n" +
                                 "Nombre: " + Nombre + "\n" +
                                 "Apellido: " + Apellido + "\n";





                JOptionPane.showMessageDialog(btnGuardar,mensaje);

            }
        });
    }
}
