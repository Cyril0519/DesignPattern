import java.util.List;

/**
 * 外观类
 */
public class SmartApplicationFacade {
    // 聚合各种对象
    private final Light light;
    private final TV tv;
    private final AirCondition airCondition;

    public SmartApplicationFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void operate(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        }else {
            System.out.println("not know directives");
        }

    }


    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
