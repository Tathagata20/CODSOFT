
package quiz;

import javax.swing.*;
import java.awt.*;

public class score extends JFrame{
    JLabel info;
    JTextField scoreTF;
    score(){
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quizimg2.jpg"));
        JLabel image=new JLabel(i1);
        add(image);
        image.setBounds(0,100,1350,300 );
        
        setSize(1350,650);
        setLocation(150,50);
        getContentPane().setBackground(Color.WHITE);
        
        info=new JLabel("Your score is ");
        info.setBounds(337, 450, 475, 50);
        info.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(info);
        
        scoreTF=new JTextField();
        scoreTF.setBounds(512, 450, 200, 50);
        scoreTF.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(scoreTF);
        setVisible(true);
    }
    public static void main(String[] args){
        new score();
    }
}
