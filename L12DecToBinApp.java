//Mini Decimal to Binary Converter

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class L12DecToBinApp extends JFrame implements ActionListener {
    private JTextField txDecimal;
    private JTextField txBinary;
    
    public L12DecToBinApp() {
        createUI();
        
    }
    private void createUI() {
        this.setTitle("Padgett's Decimal to Binary");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //Create UI Components
        txDecimal = new JTextField();
        txBinary = new JTextField();
        txBinary.setEditable(false);
        
        //Add UI components to JFrame
        this.getContentPane().setLayout(new GridLayout(2, 2));
        this.add(new JLabel("Decimal"));
        this.add(txDecimal);
        this.add(new JLabel("Binary"));
        this.add(txBinary);
        this.pack();
        
        // Link the actionPerformed method to txDecimal
        txDecimal.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Hello World");
        String userInput = txDecimal.getText();
        int decNumber = Integer.parseInt(userInput);
        String binary = Integer.toBinaryString(decNumber);
        txBinary.setText(binary);
        
    }
    public static void main(String[] args) {
        L12DecToBinApp myApp = new L12DecToBinApp();
        myApp.setVisible(true);
        System.out.println("Starting the program...");
    }
    
}
