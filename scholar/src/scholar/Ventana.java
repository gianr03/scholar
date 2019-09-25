package scholar;


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Ventana extends JFrame {
    public String JTexField;
    public Ventana() {
    
    super("Estudiantes");
    setSize(400,250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
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
    JLabel etiqueta4 = new JLabel("Nacinalidad");
    JTextField texto3 = new JTextField(10);
    cp.add(etiqueta4); 
    cp.add(texto3);
    JLabel etiqueta6 = new JLabel("Identificacion");
    JTextField texto4 = new JTextField(10);
    cp.add(etiqueta6); 
    cp.add(texto4);
    JLabel etiqueta5 = new JLabel("Genero");
    JRadioButton genero = new JRadioButton("F");
    JRadioButton genero1 = new JRadioButton("M");
    JRadioButton genero2= new JRadioButton("Otro");
    cp.add(etiqueta5);
    cp.add(genero);
    cp.add(genero1);
    cp.add(genero2);
    JLabel etiqueta7 = new JLabel("Telefono");
    JTextField texto5 = new JTextField(10);
    cp.add(etiqueta7); 
    cp.add(texto5);
    JLabel etiqueta8 = new JLabel("Direccion");
    JTextField texto6 = new JTextField(10);
    cp.add(etiqueta8); 
    cp.add(texto6);
    JLabel etiqueta9 = new JLabel("Correo Electronico");
    JTextField texto7 = new JTextField(10);
    cp.add(etiqueta9); 
    cp.add(texto7);
    JLabel etiqueta0 = new JLabel("Tipo de sangre");
    JTextField texto8 = new JTextField(4);
    cp.add(etiqueta0); 
    cp.add(texto8);
    JButton boton = new JButton("Cancelar");
    cp.add(boton);
    JButton boton1 = new JButton("Guardar");
    cp.add(boton1);
    
    }
}