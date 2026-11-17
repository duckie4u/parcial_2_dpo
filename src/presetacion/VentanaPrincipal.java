package presetacion;

import javax.swing.*;

import logica.Parcial;
import logica.resultadoDecimalException;

import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JLabel lblResultado = new JLabel("0", SwingConstants.CENTER);
    private JTextField txtBase = new JTextField();
    private JTextField txtExponente = new JTextField();
    private Parcial parcial;
    public VentanaPrincipal() {
        setLayout(new BorderLayout());
        lblResultado.setFont(new Font("Arial", Font.BOLD, 20));
        
        
        add(lblResultado, BorderLayout.NORTH);
        JPanel centro = new JPanel(new GridLayout(2, 2));
        
        
        centro.add(new JLabel("Base:", SwingConstants.RIGHT));
        centro.add(txtBase);
        
        
        centro.add(new JLabel("Exponente:", SwingConstants.RIGHT));
        centro.add(txtExponente);
        
        add(centro, BorderLayout.CENTER);
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(e -> calcular());
        
        
        add(btnCalcular, BorderLayout.SOUTH);

        setTitle("Examen Hector Florez - Paula Duque");
        setSize(400, 250);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        setBackground(Color.BLACK);
    }

    private void calcular() 
    { 
    	int base = Integer.parseInt(txtBase.getText()); 
    	int exp = Integer.parseInt(txtExponente.getText()); 
    	this.parcial = new Parcial(base, exp); 
    	try { int resultado = this.parcial.elevarNum(); lblResultado.setText(String.valueOf(resultado)); } 
    	catch (resultadoDecimalException e) 
    	{ JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); } 
    }
    
    
    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}