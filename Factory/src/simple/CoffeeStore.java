package simple;


/**
 * 咖啡馆
 */
public class CoffeeStore {
    SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

    public Coffee orderCoffee(String type) {
        return factory.createCoffee(type);
    }
}
