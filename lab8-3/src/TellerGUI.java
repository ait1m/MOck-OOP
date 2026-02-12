/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel balancePanel, amountPanel, btnPanel;
    private JTextField balanceValue, amountInput;
    private JLabel balanceLabel, amountLabel;
    private JButton dep, with, exit;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(4, 1));
        
        balancePanel = new JPanel();
        balancePanel.setLayout(new GridLayout(1,2));
        balanceLabel = new JLabel(" Balance");
        balanceValue = new JTextField("6000");
        balanceValue.setEditable(false);
        balancePanel.add(balanceLabel);
        balancePanel.add(balanceValue);
        
        amountPanel = new JPanel();
        amountLabel = new JLabel(" Amount");
        amountPanel.setLayout(new GridLayout(1, 2));
        amountInput = new JTextField();
        amountPanel.add(amountLabel);
        amountPanel.add(amountInput);
        
        btnPanel = new JPanel();
        dep = new JButton("Deposit");
        with = new JButton("Withdraw");
        exit = new JButton("Exit");
        btnPanel.add(dep);
        btnPanel.add(with);
        btnPanel.add(exit);
        
        
        fr.add(balancePanel);
        fr.add(amountPanel);
        fr.add(btnPanel);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);

    }
}
