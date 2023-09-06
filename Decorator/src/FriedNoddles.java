/**
 * 炒面 (具体构件（Concrete  Component）角色)
 */
public class FriedNoddles extends FastFood {
    public FriedNoddles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
