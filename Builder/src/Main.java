import com.sun.xml.internal.messaging.saaj.soap.name.NameImpl;

public class Main {
    public static void main(String[] args) {
        // 创建指挥者对象
        Director director = new Director(new OfoBuilder());
        Bike bike = director.construct();
        System.out.println(bike);
    }
}
