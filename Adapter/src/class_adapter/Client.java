package class_adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 从SD卡读数据
        String data1 = computer.readSD(new SDCardImpl());
        System.out.println(data1);
        System.out.println("------------------------------");
        // 从TF卡读数据
        String data2 = computer.readSD(new SDAdapterTF());
        System.out.println(data2);

    }
}
