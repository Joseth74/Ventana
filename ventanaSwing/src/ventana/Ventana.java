package ventana;
import javax.swing.*;
import java.awt.event.*;
public class Ventana extends JFrame implements ActionListener {
    private JLabel label,label2,label3;
    private JButton boton1,boton2;
    public Ventana(){
        setLayout(null);
        label = new JLabel("Negro");
        label.setBounds(10,10,40,20);
        label2 = new JLabel("Rojo");
        label2.setBounds(10,10,40,50);
        label3 = new JLabel("Azul");
        label3.setBounds(10,10,40,80);
        add(label);
        add(label2);
        add(label3);
        boton1 = new JButton("Varon");
        boton1.setBounds(420,80,90,50);
        add(boton1);
        boton1.addActionListener(this);
        boton2 = new JButton("Mujer");
        boton2.setBounds(520,80,90,50);
        add(boton2);
        boton2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1){
           setTitle("Varon");
        }
        if (e.getSource() == boton2){
           setTitle("Mujer");
        }
    } 
    public static void main(String [] args){
    Ventana v1 = new Ventana();
    v1.setBounds(0,0,1024,800);
    v1.setLocationRelativeTo(null);
    v1.setResizable(false);
    v1.setVisible(true);
    v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
}
