public class Client {
    public static void main(String[] args) {
        // 第一个订单
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿炒鸡蛋", 1);
        order1.setFood("可乐", 2);
        // 第二个订单
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("尖椒肉丝", 1);
        order2.setFood("雪碧", 2);

        // 创建厨师对象
        SeniorChef receive = new SeniorChef();
        OrderCommand cmd1 = new OrderCommand(receive, order1);
        OrderCommand cmd2 = new OrderCommand(receive, order2);

        // 创建调用者
        Waitor invoke = new Waitor();
        invoke.addCommand(cmd1);
        invoke.addCommand(cmd2);
        invoke.orderUp();
    }

}