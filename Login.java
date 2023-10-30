
package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel heading,name,email;
    static JTextField nameTF,emailTF;
    JButton login;
    Login(){
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quizimg2.jpg"));
        JLabel image=new JLabel(i1);
        add(image);
        image.setBounds(0,0,950,500 );
        
        heading=new JLabel("Quizmania");
        heading.setBounds(980, 40, 300, 50);
        heading.setFont(new Font("Showcard Gothic",Font.BOLD,24));
        add(heading);
        
        name=new JLabel("Enter Your Name");
        name.setBounds(930, 140, 200, 30);
        name.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        add(name);
        
        nameTF=new JTextField();
        nameTF.setBounds(1100, 140, 220, 30);
        nameTF.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        add(nameTF);
        
        email=new JLabel("Enter Your Email");
        email.setBounds(930, 220, 200, 30);
        email.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        add(email);
        
        emailTF=new JTextField();
        emailTF.setBounds(1100, 220, 220, 30);
        emailTF.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        add(emailTF);
        
        login=new JButton("Login");
        login.setBounds(1200, 330, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.setFont(new Font("Showcard Gothic",Font.BOLD,14));
        login.addActionListener(this);
        add(login);
    
        
        
        setSize(1350,500);
        setLocation(150,150);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
        
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            setVisible(false);
            quiz j=new quiz();
            j.setVisible(true);
            quiz.name.setText(Login.nameTF.getText());
            
        }
    }    
     public static void main(String[] args){
         new Login();
     } 
}
