interface Alert{
    abstract void sendAlert(String message);
}


class EmailAlert implements Alert{
    public void sendAlert(String message){
    System.out.println("Email Alert:"+message);
    }
}
class MobileAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Mobile Alert"+message);
    }
}
public class Task26 {
    public static void main(String[] args) {
        EmailAlert e=new EmailAlert();
        MobileAlert m=new MobileAlert();
        e.sendAlert("warning");
        m.sendAlert("warning");
}
