
package guessinggame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Guessinggame extends JFrame implements ActionListener {
    JTextField ennum,conum,scoreTF,mtext;
    JButton check,tryagain;
    int score=0,enumber,cnumber;
    Guessinggame(){
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/guessimg.png"));
        JLabel image=new JLabel(i1);
        add(image);
        image.setBounds(0,0,500,500 );
        
        setSize(800,600);
        setLocation(150,150);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel num=new JLabel("Enter Your Number");
        num.setBounds(500, 50, 300, 30);
        num.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(num);
        
        ennum=new JTextField();
        ennum.setBounds(625, 90, 50, 30);
        add(ennum);
        
        JLabel number=new JLabel("Correct Number");
        number.setBounds(500, 170, 300, 30);
        number.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(number);
        
        conum=new JTextField();
        conum.setBounds(625, 210, 50, 30);
        add(conum);
        
        JLabel score=new JLabel("Score");
        score.setBounds(500, 290, 300, 30);
        score.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(score);
        
        scoreTF=new JTextField();
        scoreTF.setBounds(625, 330, 50, 30);
        add(scoreTF);
        
        mtext=new JTextField();
        mtext.setBounds(500, 400, 286, 30);
        add(mtext);
        
        check=new JButton("Check");
        check.setBackground(Color.black);
        check.setForeground(Color.white);
        check.setBounds(680, 500, 100, 30);
        check.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        check.addActionListener(this);
        add(check);
        
        tryagain=new JButton("Try Again");
        tryagain.setBackground(Color.black);
        tryagain.setForeground(Color.white);
        tryagain.setBounds(500, 500, 140, 30);
        tryagain.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        tryagain.addActionListener(this);
        add(tryagain);
        
                
    }
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==check){
                Random ob=new Random();
                this.cnumber=ob.nextInt(1,100);
                this.enumber=Integer.parseInt(ennum.getText());
                if (enumber==cnumber) {
                    conum.setText(Integer.toString(cnumber));
                    mtext.setText("Congratulations! Your guess is correct.");
                    check.setEnabled(false);
                    score+=100;
                    scoreTF.setText(Integer.toString(score));
                    
                }
                else{
                    conum.setText(Integer.toString(cnumber));
                    mtext.setText("Sorry! Your guess is wrong. Try again.");
                    score+=1;
                    scoreTF.setText(Integer.toString(score));
                
                }
                
            }
            else if(ae.getSource()==tryagain){
                if(enumber==cnumber){
                    check.setEnabled(true);
                    }
                else{
                    ennum.setText("");
                    conum.setText("");
                    mtext.setText("");
                }
                
            }
    }
    public static void main(String[] args) {
         new Guessinggame();
    }
    
}
