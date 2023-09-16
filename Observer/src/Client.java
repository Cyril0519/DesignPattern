public class Client {
    public static void main(String[] args) {
        Observer u1 = new WeiXinUser("小明");
        Observer u2 = new WeiXinUser("小王");
        Observer u3 = new WeiXinUser("小李");
        Observer u4 = new WeiXinUser("小红");

        Subject subject = new SubscriptionSubject();
        subject.attach(u1);
        subject.attach(u2);
        subject.attach(u3);
        subject.attach(u4);

        subject.notify("123");
    }
}