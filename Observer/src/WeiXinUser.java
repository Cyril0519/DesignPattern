public class WeiXinUser implements Observer{
    String name;
    @Override
    public void update(String message) {
        System.out.println(name + "接收到消息：" + message);
    }

    public WeiXinUser(String name) {
        this.name = name;
    }
}
