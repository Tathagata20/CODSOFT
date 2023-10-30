
package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class quiz extends JFrame implements ActionListener{
    String questions[][]= new String[10][5];
    String answers[][]=new String[10][2];
    String userans[][]=new String[10][1];
    JLabel question,qno,heading1,heading2;
    static JTextField name;
    JRadioButton opt1,opt2,opt3,opt4;
    JButton next,back,submit;
    ButtonGroup groupoptions;
    public static int timer=10;
    public static int count=0;
    public static int ans_given=0;
    public static int score=0;
    quiz(){
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quizimg2.jpg"));
        JLabel image=new JLabel(i1);
        add(image);
        image.setBounds(0,100,1350,300 );
        
        qno=new JLabel("");
        qno.setBounds(100, 450, 100, 50);
        qno.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(qno);
        
        question=new JLabel("");
        question.setBounds(130, 450, 1000, 50);
        question.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(question);
        
        heading1=new JLabel("Welcome ");
        heading1.setBounds(337, 10, 150, 50);
        heading1.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(heading1);
        
        name=new JTextField();
        name.setBounds(487, 10, 325, 50);
        name.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(name);
        
        heading2=new JLabel(" To Quizimania");
        heading2.setBounds(812, 10, 200, 50);
        heading2.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(heading2);
        
        setSize(1350,750);
        setLocation(150,50);
        getContentPane().setBackground(Color.WHITE);
        
        questions[0][0] = "Which is used to find and fix bugs in the Java programs?";
        questions[0][1] = "1.JVM";
        questions[0][2] = "2.JDB";
        questions[0][3] = "3.JDK";
        questions[0][4] = "4.JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        opt1=new JRadioButton("");
        opt1.setBounds(130, 500, 450, 50);
        opt1.setBackground(Color.white);
        opt1.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(opt1);
        
        opt2=new JRadioButton("");
        opt2.setBounds(130, 540, 650, 50);
        opt2.setBackground(Color.white);
        opt2.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(opt2);
        
        opt3=new JRadioButton("");
        opt3.setBounds(130, 580, 450, 50);
        opt3.setBackground(Color.white);
        opt3.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(opt3);
        
        opt4=new JRadioButton("");
        opt4.setBounds(130, 620, 450, 50);
        opt4.setBackground(Color.white);
        opt4.setFont(new Font("Showcard Gothic",Font.BOLD,20));
        add(opt4);
        
        groupoptions= new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next=new JButton("Next");
        next.setBounds(1200, 580, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.addActionListener(this);
        next.setFont(new Font("Showcard Gothic",Font.BOLD,15));
        add(next);
        
        back=new JButton("Back");
        back.setBounds(1200, 620, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        back.setFont(new Font("Showcard Gothic",Font.BOLD,15));
        add(back);
        
        submit=new JButton("Submit");
        submit.setBounds(1200, 660, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setEnabled(false);
        submit.setFont(new Font("Showcard Gothic",Font.BOLD,15));
        add(submit);
        
        start(count);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
            repaint();
            ans_given=1;
            if (groupoptions.getSelection()==null){
                userans[count][0]="";
            }
            else{
                userans[count][0]=groupoptions.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }
        else if(ae.getSource()==submit){
            if (groupoptions.getSelection()==null){
                    userans[count][0]="";
            }
            else{
                userans[count][0]=groupoptions.getSelection().getActionCommand();
            }
            for(int i=0;i<userans.length;i++){
                if(userans[i][0]==answers[i][1]){
                    score+=10;
                }
                else{
                    score-=10;
                }
            }
            score ob=new score();
            ob.scoreTF.setText(Integer.toString(score));
            setVisible(false);
        }
        else if(ae.getSource()==back){
            count--;
            start(count);
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        String time="Time left "+timer+"s";
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Tahoma",Font.BOLD,18));
        
        if(timer>0){
            g.drawString(time, 1200, 500);
        }

        else{
            g.drawString("Times up!", 1200, 500);
            
        }
        timer--;

        
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given==1){
            ans_given=0;
            timer=10;
            }
        else if(timer<0){
            timer=10;
            
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){
                if (groupoptions.getSelection()==null){
                    userans[count][0]="";
                }
                else{
                    userans[count][0]=groupoptions.getSelection().getActionCommand();
                }
                for(int i=0;i<userans.length;i++){
                    if(userans[i][0]==answers[i][1]){
                        score+=10;
                    }
                    else{
                        score-=10;
                    }
                }
                setVisible(false);
            }
            else{
                if (groupoptions.getSelection()==null){
                    userans[count][0]="";
                }
                else{
                    userans[count][0]=groupoptions.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count+1) +".");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    public static void main(String[] args){
        new quiz();
    }
}
