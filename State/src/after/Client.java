package after;

public class Client {
    public static void main(String[] args) {
        // 创建环境角色对象
        Context context = new Context();
        context.setLiftState(new StoppingState());
        context.open();
        context.stop();
        context.run();
        context.close();
    }
}
