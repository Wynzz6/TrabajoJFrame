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
    private JRadioButton rbtNoIndicado;

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
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected()== true) ? "Si" : "No";
                String genero = (rbtMasculino.isSelected()) ? "Masculino":
                                 (rbtFemenino.isSelected()) ? "Femenino":
                                 (rbtOtro.isSelected()) ? "Otro":
                                 (rbtNoIndicado.isSelected()) ? "No indicado":"";


                String mensaje = "Tus datos son: \n" +
                                 "Código: " + codigo + "\n" +
                                 "Nombre: " + Nombre + "\n" +
                                 "Apellido: " + Apellido + "\n" +
                                 "Idioma: " + idioma + "\n" +
                                "Genero: " + genero + "\n" +
                                 "Aceptó terminos: " + aceptoTerminos + "\n";





                JOptionPane.showMessageDialog(btnGuardar,mensaje);

            }
        });
    }
}
