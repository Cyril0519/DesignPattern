import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private TrainStation station = new TrainStation();
    public TrainStation getProxyObj() {
        // 类似于jdk中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调,调用的是下面的“intercept”方法
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObj = (TrainStation) enhancer.create();
        return proxyObj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始");
        Object res = method.invoke(station, objects);
        System.out.println("cglib代理结束");
        return res;
    }
}
