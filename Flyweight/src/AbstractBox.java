import sun.security.provider.SHA;

/**
 * 抽象享元角色
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + getShape() + ",颜色：" + color);
    }
}
