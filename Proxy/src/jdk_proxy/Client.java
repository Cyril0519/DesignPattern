package jdk_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObj = proxyFactory.getProxyObj();
        proxyObj.sell();

    }
}
