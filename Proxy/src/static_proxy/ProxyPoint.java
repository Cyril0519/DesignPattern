package static_proxy;

/**
 * 代售点
 * 代理
 */
public class ProxyPoint implements SellTickets{
    private final TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代售点卖票收取一些服务费用");
        trainStation.sell();
    }
}
