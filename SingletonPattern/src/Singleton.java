public class Singleton {

    public static volatile Singleton instance;   // volatile 确保多线性间变量可见性

    private Singleton() {

    }

    public void doSth() {
        System.out.println("做一些事情");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
