/**
 * 炒饭 (具体构件（Concrete  Component）角色)
 */
public class FriedRice extends FastFood {
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
