import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    //palette
    private Color colorButtonStop=new Color(217, 0, 0);
    private Color colorButtonReset=new Color(0, 127, 217);
    private Color colorButtonStart=new Color(31, 145, 0);
    private Timer timer;
    private Container c;
    private JButton buttonStop,buttonReset,buttonStart;
    private JLabel lblTime;

    public Frame(Timer timer){
        super("tinestra timer");

        this.timer=timer;

        c=this.getContentPane();
        c.setLayout(null);
        creoBottoni();
        aggiungoComponenti();


        setBounds(0,0,400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JLabel getLblOutput() {
        return lblTime;

    }
    private void creoBottoni(){
        buttonStop=new JButton("stop");
        buttonStop.setBounds(0,150,150,50);
        buttonStop.addActionListener(this);
        buttonReset=new JButton("reset");
        buttonReset.setBounds(125,200,150,50);
        buttonReset.addActionListener(this);
        buttonStart=new JButton("start");
        buttonStart.setBounds(250,150,150,50);
        buttonStart.addActionListener(this);

        lblTime=new JLabel("1",SwingConstants.CENTER);
        lblTime.setBounds(150,150,100,50);
        //lblTime.setBackground(Color.black);
        //lblTime.setOpaque(true);
        //lblTime.setVerticalTextPosition(SwingConstants.CENTER);
        //lblTime.setHorizontalTextPosition(SwingConstants.CENTER);
    }
    private void aggiungoComponenti(){
        c.add(buttonStop);
        c.add(buttonReset);
        c.add(buttonStart);
        c.add(lblTime);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==buttonReset){
            timer.setActive(false);
            timer.setTime(1000f);
            lblTime.setText(""+1f);
        }
        if(e.getSource()==buttonStart){
            timer.setActive(true);
        }
        if(e.getSource()==buttonStop){
            timer.setActive(false);
        }
    }
}
















