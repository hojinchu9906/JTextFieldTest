package com.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hojin on 16. 1. 31.
 */
public class MakeRoom extends JFrame{
    JLabel label1,label2;
    JTextField textField;
    JButton jButton1,jButton2;

    public MakeRoom(){
        label1=new JLabel("Î∞©Ïù¥Î¶?");
        label2=new JLabel("?ÉÅ?Éú");

        textField=new JTextField();

        jButton1=new JButton("?ôï?ù∏");
        jButton2=new JButton("Ï∑®ÏÜå");

        //Î∞∞Ïπò
        setLayout(null);
        label1.setBounds(10,15,50,20);
        textField.setBounds(65,15,150,20);

        JPanel jPanel=new JPanel();
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.setBounds(10,115,195,35);

        add(label1);
        add(label2);
        add(textField);
        add(jPanel);

        setBounds(550,150,235,195);


    }

}































