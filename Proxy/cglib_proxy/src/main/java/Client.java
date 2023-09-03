public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObj = factory.getProxyObj();
        // 代用代理对象中的sell方法卖票
        proxyObj.sell();
    }
}
