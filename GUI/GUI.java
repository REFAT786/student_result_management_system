
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setBounds(20, 20, 20, 20);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setText("welcome to log in form");
        //label.setSize(200,70);
        label.setBounds(50, 20, 200, 10);
        frame.add(label);

        JLabel label1 = new JLabel();
        label1.setText("USER NAME  :");
        //label.setSize(200,70);
        label1.setBounds(20, 50, 100, 10);
        frame.add(label1);

        JTextField t = new JTextField();
        t.setBounds(110, 45, 20, 20);
        t.setSize(150, 30);
        frame.add(t);

        JLabel label2 = new JLabel();
        label2.setText("PASSWORD :");
        // labe2.setSize(300,70);
        label2.setBounds(20, 100, 100, 10);
        frame.add(label2);

        JPasswordField p = new JPasswordField();
        p.setBounds(110, 95, 20, 20);
        p.setSize(150, 30);
        frame.add(p);

        JButton button1 = new JButton();
        button1.setText("LOG IN(1)");
        button1.setBounds(35, 200, 20, 20);
        button1.setSize(100, 50);
        frame.add(button1);

        /*JButton button2=new JButton();
        button2.setText("CREATE AN ACCOUNT");
        button2.setBounds(180, 200, 20, 20);
        button2.setSize(100, 50);
        frame.add(button2);
         */
        JFrame frame1 = new JFrame();
        frame1.setBounds(20, 20, 20, 20);
        frame1.setSize(400, 400);
        frame1.setLayout(null);
        frame1.setVisible(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button2 = new JButton();
        button2.setText("ADD STUDENT INFORMATION(2)");
        button2.setBounds(40, 50, 200, 20);
        button2.setSize(300, 50);
        frame1.add(button2);

        JButton button3 = new JButton();
        button3.setText("DISPLAY STUDENT RESULT(3)");
        button3.setBounds(40, 150, 200, 40);
        button3.setSize(300, 50);
        frame1.add(button3);

        /*
        
        
        
         */
        JFrame frame2 = new JFrame();
        frame2.setBounds(20, 20, 20, 20);
        frame2.setSize(400, 400);
        frame2.setLayout(null);
        frame2.setVisible(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label3 = new JLabel();
        label3.setText("ADD STUDENT INFORMATION");
        //label.setSize(200,70);
        label3.setBounds(90, 20, 200, 10);
        frame2.add(label3);

        JLabel label4 = new JLabel();
        label4.setText("student name :");
        //label.setSize(200,70);
        label4.setBounds(50, 70, 200, 10);
        frame2.add(label4);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 65, 20, 20);
        t1.setSize(150, 30);
        frame2.add(t1);

        JLabel label5 = new JLabel();
        label5.setText("student id   : ");
        //label.setSize(200,70);
        label5.setBounds(50, 110, 200, 10);
        frame2.add(label5);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 105, 20, 20);
        t2.setSize(150, 30);
        frame2.add(t2);

        JLabel label6 = new JLabel();
        label6.setText("Mid mark     : ");
        //label.setSize(200,70);
        label6.setBounds(50, 150, 200, 10);
        frame2.add(label6);

        JTextField t3 = new JTextField();
        t3.setBounds(150, 145, 20, 20);
        t3.setSize(150, 30);
        t3.setEditable(false);
        frame2.add(t3);
        
        JButton click1 = new JButton();
        click1.setText("click(1)");
        click1.setBounds(300, 150, 80, 20);
        frame2.add(click1);
        

        JLabel label7 = new JLabel();
        label7.setText("Final mark   : ");
        //label.setSize(200,70);
        label7.setBounds(50, 190, 200, 10);
        frame2.add(label7);

        JTextField t4 = new JTextField();
        t4.setBounds(150, 185, 20, 20);
        t4.setSize(150, 30);
        t4.setEditable(false);
        frame2.add(t4);
        
        
        JButton click2 = new JButton();
        click2.setText("click(2)");
        click2.setBounds(300, 190, 80, 20);
        frame2.add(click2);

        JLabel label8 = new JLabel();
        label8.setText("subject      : ");
        //label.setSize(200,70);
        label8.setBounds(50, 230, 200, 10);
        frame2.add(label8);

        JTextField t5 = new JTextField();
        t5.setBounds(150, 225, 20, 20);
        t5.setSize(150, 30);
        frame2.add(t5);

        JButton button4 = new JButton();
        button4.setText("SUBMIT(4)");
        button4.setBounds(50, 300, 20, 20);
        button4.setSize(100, 50);
        frame2.add(button4);

        JButton back = new JButton();
        back.setText("BACK");
        back.setBounds(200, 300, 20, 20);
        back.setSize(100, 50);
        frame2.add(back);
        
       /*
        
        
        
        
        */
       
       JFrame frame3 = new JFrame();
        frame3.setBounds(20, 20, 20, 20);
        frame3.setSize(400, 400);
        frame3.setLayout(null);
        frame3.setVisible(false);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton back1 = new JButton();
        back1.setText("BACK(1)");
        back1.setBounds(100, 300, 20, 20);
        back1.setSize(200, 50);
        frame3.add(back1);

        /*
        
        
        
         */
        
        JFrame frame4 = new JFrame();
        frame4.setBounds(500, 20, 20, 20);
        frame4.setSize(400, 400);
        frame4.setLayout(null);
        frame4.setVisible(false);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JButton done1 = new JButton();
        done1.setText("DONE(1)");
        done1.setBounds(100, 300, 20, 20);
        done1.setSize(200, 50);
        frame4.add(done1);
        
        
        JLabel label9 = new JLabel();
        label9.setText("MID NUMBER");
        //label.setSize(200,70);
        label9.setBounds(90, 20, 200, 10);
        frame4.add(label9);

        JLabel label10 = new JLabel();
        label10.setText("ATTENDENCE(OUT OF 10):");
        //label.setSize(200,70);
        label10.setBounds(50, 70, 200, 10);
        frame4.add(label10);

        JTextField t6 = new JTextField();
        t6.setBounds(210, 65, 20, 20);
        t6.setSize(150, 30);
        frame4.add(t6);

        JLabel label11 = new JLabel();
        label11.setText("PERFORMANCE(OUT OF 10): ");
        //label.setSize(200,70);
        label11.setBounds(50, 110, 200, 10);
        frame4.add(label11);

        JTextField t7 = new JTextField();
        t7.setBounds(210, 105, 20, 20);
        t7.setSize(150, 30);
        frame4.add(t7);

        JLabel label12 = new JLabel();
        label12.setText("QUIZ 1(OUT OF 20): ");
        //label.setSize(200,70);
        label12.setBounds(50, 150, 200, 10);
        frame4.add(label12);

        JTextField t8 = new JTextField();
        t8.setBounds(210, 145, 20, 20);
        t8.setSize(150, 30);
        frame4.add(t8);

        JLabel label13 = new JLabel();
        label13.setText("QUIZ 2(OUT OF 20): ");
        //label.setSize(200,70);
        label13.setBounds(50, 190, 200, 10);
        frame4.add(label13);

        JTextField t9 = new JTextField();
        t9.setBounds(210, 185, 20, 20);
        t9.setSize(150, 30);
        frame4.add(t9);
       

        JLabel label14 = new JLabel();
        label14.setText("MID EXAM(OUT OF 40): ");
        //label.setSize(200,70);
        label14.setBounds(50, 230, 200, 10);
        frame4.add(label14);

        JTextField t10 = new JTextField();
        t10.setBounds(210, 225, 20, 20);
        t10.setSize(150, 30);
        frame4.add(t10);
        
       
        
        /*
        
        
        
        */
        
        JFrame frame5 = new JFrame();
        frame5.setBounds(500, 20, 20, 20);
        frame5.setSize(400, 400);
        frame5.setLayout(null);
        frame5.setVisible(false);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JButton done2 = new JButton();
        done2.setText("DONE(2)");
        done2.setBounds(100, 300, 20, 20);
        done2.setSize(200, 50);
        frame5.add(done2);
        
        
        JLabel label15 = new JLabel();
        label15.setText("FINAL NUMBER");
        //label.setSize(200,70);
        label15.setBounds(90, 20, 200, 10);
        frame5.add(label15);

        JLabel label16 = new JLabel();
        label16.setText("ATTENDENCE(OUT OF 10):");
        //label.setSize(200,70);
        label16.setBounds(50, 70, 200, 10);
        frame5.add(label16);

        JTextField t11 = new JTextField();
        t11.setBounds(210, 65, 20, 20);
        t11.setSize(150, 30);
        frame5.add(t11);

        JLabel label17 = new JLabel();
        label17.setText("PERFORMANCE(OUT OF 10): ");
        //label.setSize(200,70);
        label17.setBounds(50, 110, 200, 10);
        frame5.add(label17);

        JTextField t12 = new JTextField();
        t12.setBounds(210, 105, 20, 20);
        t12.setSize(150, 30);
        frame5.add(t12);

        JLabel label18 = new JLabel();
        label18.setText("QUIZ 1(OUT OF 20): ");
        //label.setSize(200,70);
        label18.setBounds(50, 150, 200, 10);
        frame5.add(label18);

        JTextField t13 = new JTextField();
        t13.setBounds(210, 145, 20, 20);
        t13.setSize(150, 30);
        frame5.add(t13);

        JLabel label19 = new JLabel();
        label19.setText("QUIZ 2(OUT OF 20): ");
        //label.setSize(200,70);
        label19.setBounds(50, 190, 200, 10);
        frame5.add(label19);

        JTextField t14 = new JTextField();
        t14.setBounds(210, 185, 20, 20);
        t14.setSize(150, 30);
        frame5.add(t14);
       

        JLabel label20 = new JLabel();
        label20.setText("FINAL EXAM(OUT OF 40): ");
        //label.setSize(200,70);
        label20.setBounds(50, 230, 200, 10);
        frame5.add(label20);

        JTextField t15 = new JTextField();
        t15.setBounds(210, 225, 20, 20);
        t15.setSize(150, 30);
        frame5.add(t15);
        
       
        
        
        /*
        
        
        
        */
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nam = t.getText();
                String pass = new String(p.getPassword());

                if (nam.equals("refat") && pass.equals("1234r")) {
                    
                    frame1.setVisible(true);
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "input wroung!please try again..", "Remender", 1);
                }
            }

        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame2.setVisible(true);
                frame1.setVisible(false);

            }

        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame2.setVisible(false);
                frame1.setVisible(true);

            }

        });
        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame3.setVisible(false);
                frame1.setVisible(true);

            }

        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              
                    frame3.setVisible(true);
                    frame1.setVisible(false);
               
            }

        });
        click1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame4.setVisible(true);
                

            }

        });
        click2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame5.setVisible(true);
                

            }

        });
        done1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame4.setVisible(false);
                
                         String s1=t6.getText();
                         String s2=t7.getText();
                         String s3=t8.getText();
                         String s4=t9.getText();
                         String s5=t10.getText();
                       
                        int a=Integer.parseInt(s1); 
                        int b=Integer.parseInt(s2);
                        int c=Integer.parseInt(s3); 
                        int d=Integer.parseInt(s4);
                        int e=Integer.parseInt(s5);
                       int f=0;
                        float g=(float)0.00;  
                        f=a+b+c+d+e;
                        g= (float) (f*0.4);
                        
                        String result=String.valueOf(g); 
                        t3.setText(result);   
       
            }
        });
        done2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame5.setVisible(false);
                String s6=t11.getText();
                         String s7=t12.getText();
                         String s8=t13.getText();
                         String s9=t14.getText();
                         String s10=t15.getText();
                       
                        int h=Integer.parseInt(s6); 
                        int i=Integer.parseInt(s7);
                        int j=Integer.parseInt(s8); 
                        int k=Integer.parseInt(s9);
                        int l=Integer.parseInt(s10);
                         int m=0;
                        float n=(float)0.00;  
                        m=h+i+j+k+l;
                        n= (float) (m*0.6);
                        String result2=String.valueOf(n); 
                        t4.setText(result2);  

            }

        });

    }
}
