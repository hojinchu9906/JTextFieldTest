package com.client;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;

/**
 * Created by hojin on 16. 1. 31.
 */
public class WaitRoom extends JPanel{
    JTable jTable1,jTable2;
    DefaultTableModel defaultTableModel1,defaultTableModel2;
    JTextArea jTextArea;
    JComboBox jComboBox;
    JTextField jTextField;
    JButton jButton1,jButton2;
    JScrollBar jScrollBar;
    TableColumn tableColumn;

    public WaitRoom(){
        String[] col1={"Î∞©Ïù¥Î¶?","Í≥µÍ∞ú/ÎπÑÍ≥µÍ∞?","?ù∏?õê"};
        String[][] row1=new String[0][3];

        defaultTableModel1=new DefaultTableModel(row1,col1){
          public boolean isCellEditable(int r,int c){
              return false;
          }
        };
        jTable1=new JTable(defaultTableModel1);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setRowHeight(30);
        jTable1.setShowVerticalLines(false);
        jTable1.setIntercellSpacing(new Dimension(0,0));
        JScrollPane jScrollPane1=new JScrollPane(jTable1);


        jButton1=new JButton("Î∞©Îßå?ì§Í∏?");
        jButton2=new JButton("?ÇòÍ∞?Í∏?");

        setLayout(null);
        jScrollPane1.setBounds(10,15,450,300);

        JPanel jPanel=new JPanel();
        GridLayout gridLayout=new GridLayout(3,2,5,5);
        jPanel.setLayout(gridLayout);
        jPanel.add(jButton1);
        jPanel.add(jButton2);

        jPanel.setBounds(465,320,320,230);

        add(jScrollPane1);
        add(jPanel);
    }

}

































