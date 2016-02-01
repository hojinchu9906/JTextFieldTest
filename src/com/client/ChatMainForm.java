package com.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by hojin on 16. 1. 31.
 */
public class ChatMainForm extends JFrame implements ActionListener,Runnable,MouseListener{
    Login login=new Login();
    WaitRoom waitRoom=new WaitRoom();
    MakeRoom makeRoom=new MakeRoom();

    CardLayout cardLayout=new CardLayout();

    public ChatMainForm(){
        setLayout(cardLayout);

        add("LOGIN",login);
        add("WR",waitRoom);
        setSize(820,600);
        setVisible(true);

        login.jButton1.addActionListener(this);
        login.jButton2.addActionListener(this);
        waitRoom.jButton1.addActionListener(this);
        waitRoom.jButton2.addActionListener(this);

        makeRoom.jButton1.addActionListener(this);
        makeRoom.jButton2.addActionListener(this);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(ChatMainForm.this,"��� ��ư�� Ŭ���ϼ���.");
            }
        });
        
		login.textField1.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
	            if(!(e.getKeyChar()==27||e.getKeyChar()==65535))//������ JTextField�� ���������� �����.
	            {
	                System.out.println("������ JTextField�� ���������� �����");
	            }
			}
			
		});
		
		
		login.textField1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				login.textField2.requestFocusInWindow();
			}
		});
		
		login.textField2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				login.jButton1.requestFocusInWindow();
			}
		});
		

    }

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception e){
            e.printStackTrace();
        }

        new ChatMainForm();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login.jButton1) {
            String id = login.textField1.getText().trim();
            if (id.length() < 1) {
                JOptionPane.showMessageDialog(this, "ID�Է�");
                login.textField1.requestFocus();
                return;
            }

            String name = login.textField2.getText().trim();
            if (name.length() < 1) {
                JOptionPane.showMessageDialog(this, "��ȭ���Է�");
                login.textField2.requestFocus();
                return;
            }

            connection(id);
        }else if(e.getSource()==login.textField1){
			login.textField1.addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					super.keyPressed(e);
		            if(!(e.getKeyChar()==27||e.getKeyChar()==65535))//������ JTextField�� ���������� �����
		            {
		                System.out.println("������ JTextField�� ���������� �����");
		            }
				}
				
			});
        	
        }else if(e.getSource()==waitRoom.jButton1){
            makeRoom.textField.setText("");
            makeRoom.setVisible(true);
        }else if(e.getSource()==makeRoom.jButton1){
            String rname=makeRoom.textField.getText().trim();
            if(rname.length()<1){
                JOptionPane.showMessageDialog(this,"���̸��� �Է��ϼ���.");
                makeRoom.textField.requestFocus();
                return;
            }
            //makeRoom.setVisible(false);
        }else if(e.getSource()==waitRoom.jButton2){
            waitRoom.setVisible(false);

        }else if(e.getSource()==makeRoom.jButton2){
            makeRoom.setVisible(false);
        }else if(e.getSource()==login.jButton2){
            dispose();
            System.exit(0);
        }

    }


    public void connection(String id){
        try{
            cardLayout.show(getContentPane(),"WR");
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {
        try{
            while(true){

            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}













































