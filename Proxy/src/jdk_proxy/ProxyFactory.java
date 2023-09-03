package jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {
    // 声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObj() {
        // 返回代理对象即可
        SellTickets proxyObj = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * @param proxy 代理对象，和proxyObj对象时同一个对象，在incoke中基本不用
                     * @param method 对接口中的方法进行封装的method对象
                     * @param args 代用方法的实际参数
                     * @return 返回值是方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk动态代理开始");
                        // Object res = method.invoke(proxy, args);  // 循环调用导致报错
                        // 执行火车站方法
                        Object res = method.invoke(station, args);

                        System.out.println("jdk代理完成");
                        return res;
                    }
                }
        );
        return proxyObj;
    }
}
