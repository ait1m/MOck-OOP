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

public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField num1, num2, num3, answer;
    private JPanel oper;
    private JButton b1, b2, b3, b4;
      
    public CalculatorOneGUI(){
        fr = new JFrame("เครื่องคิดเลข");
        num1 = new JTextField();
        num2 = new JTextField();
        answer = new JTextField();
        oper = new JPanel();
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(num1);
        fr.add(num2);
        fr.add(oper);
        fr.add(answer);
        
        b1 = new JButton("บวก");
        b2 = new JButton("ลบ");
        b3 = new JButton("คูณ");
        b4 = new JButton("หาร");
        
        oper.setLayout(new FlowLayout());
        oper.add(b1);
        oper.add(b2);
        oper.add(b3);
        oper.add(b4);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(350, 175);
        fr.setVisible(true);
        
    }
}
