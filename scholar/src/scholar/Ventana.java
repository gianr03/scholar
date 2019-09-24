
package scholar;


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana extends JFrame {
    public String JTexField;
    public Ventana() {
    
    super("Estudiantes");
    setSize(400,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    JLabel etiqueta = new JLabel("Nombres");
    JTextField texto = new JTextField(10);
    cp.add(etiqueta); 
    cp.add(texto);
    JLabel etiqueta2 = new JLabel("Apellidos");
    JTextField texto2 = new JTextField(10);
    cp.add(etiqueta2); 
    cp.add(texto2);
    JLabel etiqueta3 = new JLabel("fecha_naci");
    JPanel panelfecha = new JPanel();
    panelfecha.setLayout (new FlowLayout());
    panelfecha.add(new JTextField(2));
    panelfecha.add(new JLabel("/"));
    panelfecha.add(new JTextField(2));
    panelfecha.add(new JLabel("/"));
    panelfecha.add(new JTextField(2));
    cp.add(etiqueta3);
    cp.add(panelfecha);
    }
    
}
