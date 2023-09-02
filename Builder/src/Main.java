import com.sun.xml.internal.messaging.saaj.soap.name.NameImpl;

public class Main {
    public static void main(String[] args) {
        // 创建指挥者对象
        Builder builder = new OfoBuilder();
        Bike bike = builder.construct();
        System.out.println(bike);
    }
}
