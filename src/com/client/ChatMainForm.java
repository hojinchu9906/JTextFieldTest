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
                JOptionPane.showMessageDialog(ChatMainForm.this,"취소 버튼을 클릭하세요.");
            }
        });
        
		login.textField1.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
	            if(!(e.getKeyChar()==27||e.getKeyChar()==65535))//유저가 JTextField를 수정했을때 실행됨.
	            {
	                System.out.println("유저가 JTextField를 수정했을때 실행됨");
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
				login.textField1.requestFocusInWindow();
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
                JOptionPane.showMessageDialog(this, "ID입력");
                login.textField1.requestFocus();
                return;
            }

            String name = login.textField2.getText().trim();
            if (name.length() < 1) {
                JOptionPane.showMessageDialog(this, "대화명입력");
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
		            if(!(e.getKeyChar()==27||e.getKeyChar()==65535))//유저가 JTextField를 수정했을때 실행됨
		            {
		                System.out.println("유저가 JTextField를 수정했을때 실행됨");
		            }
				}
				
			});
        	
        }else if(e.getSource()==waitRoom.jButton1){
            makeRoom.textField.setText("");
            makeRoom.setVisible(true);
        }else if(e.getSource()==makeRoom.jButton1){
            String rname=makeRoom.textField.getText().trim();
            if(rname.length()<1){
                JOptionPane.showMessageDialog(this,"방이름을 입력하세요.");
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













































