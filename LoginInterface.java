/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logininterface;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author leseg
 */
public class LoginInterface {

    public static void main(String[] args) {
        JFrame myframe = new JFrame("USER LOGIN");
        
        myframe.setSize(300,200);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,10,10));
        
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
        JLabel  Userlabel = new JLabel("ENTER USERNAME: ");
        JTextField UserText = new JTextField();
        
        JLabel  Userpass = new JLabel("ENTER PASSWORD");
        JTextField UserpassField = new JTextField();
        
        JButton button = new JButton("Ok");
        
        panel.add(Userlabel);
        panel.add(UserText);
        panel.add(Userpass);
        panel.add(UserpassField);
        panel.add(button);
        
        myframe.add(panel);
        
        myframe.setVisible(true);
    }
}
