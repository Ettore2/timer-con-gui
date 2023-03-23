import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Timer extends Thread{
    private JLabel lblOutput;
    private float time;
    private boolean active;

    Timer(float startingTime, JLabel output){
        time=startingTime;
        active=false;
        this.lblOutput=output;

        this.start();
    }

    //getter
    public synchronized float getTime(){
        return time;

    }

    public JLabel getLblOutput() {
        return lblOutput;

    }

    //setter
    public synchronized void setTime(float time){
        this.time=time;

    }

    public void setLblOutput(JLabel lblOutput) {
        this.lblOutput = lblOutput;

    }

    public synchronized void setActive(boolean active){
        this.active=active;

    }

    //altri metodi
    private synchronized void aumentaTime(float incremento){
        time+=incremento;
        lblOutput.setText(""+(time/1000));
    }
    public synchronized boolean isActive() {
        return active;

    }

    //run
    public void run() {
        Date oldDate=new Date();
        Date newDate;

        while(true){
            newDate=new Date();

            //aggiorno tempo
            if(active){
                aumentaTime(newDate.getTime()-oldDate.getTime());
            }

            oldDate=newDate;
        }

    }

}














