import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**______ java class import__________*/

public class Game {

    private JFrame frame_1;
    private JTextField text1;




    /** ___________Start the program______________**/



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Game window = new Game();
                    window.frame_1.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }





    /**--------------Create the program.--------------*/


    public Game() {
        initialize();
    }
    int p_num,q_num,num_N,q=0,p=0;




    /**________Initialize the frame's content._________*/



    private void initialize(){
        frame_1 = new JFrame();
        frame_1.setBounds(550, 100, 458, 596);
        frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_1.getContentPane().setLayout(null);
        frame_1.setResizable(false);



        JLabel Player_1 = new JLabel("_You_");
        Player_1.setForeground(new Color(153, 255, 0, 218));
        Player_1.setHorizontalAlignment(SwingConstants.CENTER);
        Player_1.setFont(new Font("Arial Black", Font.BOLD, 25));
        Player_1.setBounds(29, 56, 116, 45);
        frame_1.getContentPane().add(Player_1);



        JLabel pc = new JLabel("_PC_");
        pc.setForeground(new Color(153, 255, 0));
        pc.setHorizontalAlignment(SwingConstants.CENTER);
        pc.setFont(new Font("Arial Black", Font.BOLD, 25));
        pc.setBounds(291, 56, 116, 45);
        frame_1.getContentPane().add(pc);



        text1 = new JTextField();
        text1.setSelectionColor(Color.WHITE);
        text1.setSelectedTextColor(Color.WHITE);
        text1.setForeground(Color.WHITE);
        text1.setCaretColor(Color.WHITE);
        text1.setBackground(Color.BLACK);
        text1.setHorizontalAlignment(SwingConstants.CENTER);
        text1.setFont(new Font("Rockwell", Font.BOLD, 20));
        text1.setBounds(29, 111, 116, 35);
        frame_1.getContentPane().add(text1);
        text1.setColumns(10);



        JLabel lblcom1 = new JLabel("");
        lblcom1.setOpaque(true);
        lblcom1.setForeground(Color.WHITE);
        lblcom1.setIcon(null);
        lblcom1.setBackground(Color.BLACK);
        lblcom1.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblcom1.setHorizontalAlignment(SwingConstants.CENTER);
        lblcom1.setBounds(290, 111, 117, 35);
        frame_1.getContentPane().add(lblcom1);



        JButton btnSet1 = new JButton("Input");
        btnSet1.setBorderPainted(false);
        btnSet1.setForeground(new Color(212, 255, 51));
        btnSet1.setBackground(new Color(123, 0, 51));
        btnSet1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        btnSet1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    p_num=Integer.parseInt(text1.getText());

                    if(p_num > 4) {
                        JOptionPane.showMessageDialog(null,"Invalid!  (Please enter an intenger less than 5)");
                        text1.setText(null);
                        text1.requestFocusInWindow();
                    }else {
                        //do nothing
                        do {
                            Random ran1 = new Random();
                            q_num=ran1.nextInt(4)+1 ;
                        }while(q_num == p_num);
                        lblcom1.setText(Integer.toString(q_num));
                    }



                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid!   (Please enter an intenger)");
                    text1.requestFocusInWindow();
                }
            }
        });
        btnSet1.setFont(new Font("Cooper Black", Font.BOLD, 20));
        btnSet1.setBounds(69, 176, 94, 35);
        frame_1.getContentPane().add(btnSet1);



        JLabel Pstar1 = new JLabel("");
        Pstar1.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\1.jpg"));
        Pstar1.setBounds(34, 366, 65, 65);
        frame_1.getContentPane().add(Pstar1);
        Pstar1.setVisible(false);




        JLabel Pstar2 = new JLabel("");
        Pstar2.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\2.jpg"));
        Pstar2.setBounds(99, 366, 65, 65);
        frame_1.getContentPane().add(Pstar2);
        Pstar2.setVisible(false);




        JLabel Pstar3 = new JLabel("");
        Pstar3.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\3.jpg"));
        Pstar3.setBounds(34, 430, 65, 65);
        frame_1.getContentPane().add(Pstar3);
        Pstar3.setVisible(false);




        JLabel Pstar4 = new JLabel("");
        Pstar4.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\4.jpg"));
        Pstar4.setBounds(99, 430, 65, 65);
        frame_1.getContentPane().add(Pstar4);
        Pstar4.setVisible(false);





        JLabel Cstar1 = new JLabel("");
        Cstar1.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\1.jpg"));
        Cstar1.setBounds(282, 366, 65, 65);
        frame_1.getContentPane().add(Cstar1);
        Cstar1.setVisible(false);




        JLabel Cstar2 = new JLabel("");
        Cstar2.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\2.jpg"));
        Cstar2.setBounds(346, 366, 65, 65);
        frame_1.getContentPane().add(Cstar2);
        Cstar2.setVisible(false);





        JLabel Cstar3 = new JLabel("");
        Cstar3.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\3.jpg"));
        Cstar3.setBounds(282, 430, 65, 65);
        frame_1.getContentPane().add(Cstar3);
        Cstar3.setVisible(false);




        JLabel Cstar4 = new JLabel("");
        Cstar4.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\4.jpg"));
        Cstar4.setBounds(346, 430, 65, 65);
        frame_1.getContentPane().add(Cstar4);
        Cstar4.setVisible(false);




        JLabel lblresultText = new JLabel("");
        lblresultText.setFont(new Font("Cooper Black", Font.BOLD, 35));
        lblresultText.setHorizontalAlignment(SwingConstants.CENTER);
        lblresultText.setForeground(Color.WHITE);
        lblresultText.setBounds(77, 268, 286, 100);
        frame_1.getContentPane().add(lblresultText);





        JLabel lblresetMsg = new JLabel("Press \"Replay\" Button to Play Again");
        lblresetMsg.setForeground(new Color(0, 255, 4));
        lblresetMsg.setFont(new Font("Goudy Old Style", Font.BOLD, 18));
        lblresetMsg.setHorizontalAlignment(SwingConstants.CENTER);
        lblresetMsg.setBounds(54, 252, 341, 35);
        frame_1.getContentPane().add(lblresetMsg);
        lblresetMsg.setVisible(false);




        JLabel lblwonback = new JLabel("");
        lblwonback.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\won.png"));
        lblwonback.setBounds(0, 0, 457, 584);
        frame_1.getContentPane().add(lblwonback);
        lblwonback.setVisible(false);





        JButton btnreset = new JButton("Replay");
        btnreset.setBackground(new Color(22, 0, 255, 161));
        btnreset.setForeground(new Color(255, 255, 51));
        btnreset.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnreset.setVisible(false);
        btnreset.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {


                text1.setText(null);
                lblcom1.setText(null);



                Pstar1.setVisible(false);
                Pstar2.setVisible(false);
                Pstar3.setVisible(false);
                Pstar4.setVisible(false);



                Cstar1.setVisible(false);
                Cstar2.setVisible(false);
                Cstar3.setVisible(false);
                Cstar4.setVisible(false);



                btnreset.setVisible(false);
                lblresetMsg.setVisible(false);
                lblwonback.setVisible(false);
                lblresultText.setVisible(false);


                p = 0;
                q = 0;

            }
        });

        btnreset.setBounds(150, 514, 122, 35);
        frame_1.getContentPane().add(btnreset);


        JButton btnplay1 = new JButton("Play");
        btnplay1.setForeground(new Color(212, 255, 51));
        btnplay1.setBorderPainted(false);
        btnplay1.setBackground(new Color(123, 0, 51));
        btnplay1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        btnplay1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    p_num=Integer.parseInt(text1.getText());

                    Random rn1final = new Random();
                    num_N=rn1final.nextInt(4)+1 ;
                    JOptionPane.showMessageDialog(null,"Number is "+num_N);

                    if(p_num==num_N && p==0) {
                        p=p+1;
                        Pstar1.setVisible(true);
                    }else if(q_num==num_N && q==0) {
                        q=q+1;
                        Cstar1.setVisible(true);
                    }else if(p_num==num_N && p==1) {
                        p=p+1;
                        Pstar2.setVisible(true);
                    }else if(q_num==num_N && q==1) {
                        q=q+1;
                        Cstar2.setVisible(true);
                    }else if(p_num==num_N && p==2) {
                        p=p+1;
                        Pstar3.setVisible(true);
                    }else if(q_num==num_N && q==2) {
                        q=q+1;
                        Cstar3.setVisible(true);
                    }else if(p_num==num_N && p==3) {
                        Pstar4.setVisible(true);
                        lblresultText.setText("YOU WON!");
                        lblwonback.setVisible(true);
                        btnreset.setVisible(true);
                    }else if(q_num==num_N && q==3) {
                        Cstar4.setVisible(true);
                        lblresultText.setText("YOU LOST");
                        btnreset.setVisible(true);
                        lblresetMsg.setVisible(true);

                    }

                    text1.setText(null);
                    lblcom1.setText(null);
                    text1.requestFocusInWindow();
                }catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, "Please enter an integer");
                    text1.requestFocusInWindow();
                }
            }
        });

        btnplay1.setFont(new Font("Cooper Black", Font.BOLD, 20));
        btnplay1.setBounds(272, 176, 100, 35);
        frame_1.getContentPane().add(btnplay1);

        JLabel lblback = new JLabel("");
        lblback.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\JAVA Project_s14876\\images\\new.jpg"));
        lblback.setBounds(-28, -112, 496, 711);
        frame_1.getContentPane().add(lblback);
    }
}