import java.util.Map;

/**
 * 具体命令类
 */
public class OrderCommand implements Command {
    // 持有接收者对象
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (Map.Entry<String, Integer> food : foodDir.entrySet()) {
            receiver.makeFood(food.getKey(), food.getValue());
        }
        System.out.println(order.getDiningTable() + "菜已经制作完成-------------------");
    }
}
