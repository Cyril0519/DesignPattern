/**
 * 具体构建者
 */
public class MobileBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("碳纤维车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }

    @Override
    public String toString() {
        return "mobile"+ super.toString();
    }
}
