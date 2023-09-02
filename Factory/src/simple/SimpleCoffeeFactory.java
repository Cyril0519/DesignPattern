package simple;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        switch (type) {
            case "american":
                coffee = new AmericanCoffee();
                break;
            case "latte":
                coffee = new LatteCoffee();
                break;
            default:
                throw new RuntimeException("不支持的类型");
        }
        return coffee;
    }

}
