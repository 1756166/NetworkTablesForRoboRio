package frc.team612;
//TODO FOR RASPBERRY PI: DO SOMETHING SIMILAR BUT FOR SENDING NOT RECEIVING (CHANGE FLAG TO TRUE).
public class NetworkTableThread implements Runnable{
    public NetworkTableThread(){
        new Thread(this, "REEEEEEEEEEE").start();
    }
    private boolean flag = false;
    private synchronized void Answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = false;
        notify();
    }
    public void run(){
        //An example of what could be inside here
        Answer("MessageRecieved It FREAKING WORKS");
        //TODO: Complete this function.
    }
}
