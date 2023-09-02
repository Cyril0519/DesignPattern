/**
 * 抽象构建者
 */
public abstract class Builder {
    // 声明Bike类型变量
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
