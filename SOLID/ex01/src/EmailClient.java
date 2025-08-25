public class EmailClient implements IEmailClient{
    @Override
    public void send(String a, String b) {
        System.out.println("[EMAIL to=" + a + "] " + b);
    }
}