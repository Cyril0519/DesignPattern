public class RealizeType implements Cloneable {

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("克隆成功");
        return (RealizeType) super.clone();
    }
}
