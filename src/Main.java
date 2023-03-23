public class Main {
    public static void main(String[] args){
        Timer timer=new Timer(1000,null);
        Frame frame=new Frame(timer);
        timer.setLblOutput(frame.getLblOutput());
    }
}
