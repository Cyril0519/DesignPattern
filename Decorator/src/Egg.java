/**
 * 鸡蛋类
 * 具体装饰（ConcreteDecorator）角色
 */
public class Egg extends Garnish {


    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
