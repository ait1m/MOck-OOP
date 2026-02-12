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

public class CalculatorTwoGUI {
    private JFrame fs;
    private JTextField ans;
    private JPanel foper;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton o1, o2, o3, o4, eq, c;
    
    public CalculatorTwoGUI(){
        fs = new JFrame("My Calculator");
        ans = new JTextField();
        foper = new JPanel();
        
        fs.setLayout(new BorderLayout());
        fs.add(ans, BorderLayout.NORTH);
        fs.add(foper, BorderLayout.CENTER);
        
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        o1 = new JButton("+");
        o2 = new JButton("-");
        o3 = new JButton("x");
        o4 = new JButton("/");
        eq = new JButton("=");
        c = new JButton("c");
        
        foper.setLayout(new GridLayout(4, 4));
        foper.add(b7);
        foper.add(b8);
        foper.add(b9);
        foper.add(o1);
        foper.add(b4);
        foper.add(b5);
        foper.add(b6);
        foper.add(o2);
        foper.add(b1);
        foper.add(b2);
        foper.add(b3);
        foper.add(o3);
        foper.add(b0);
        foper.add(c);
        foper.add(eq);
        foper.add(o4);
        
        fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fs.setSize(225, 225);
        fs.setVisible(true);
    }
}
