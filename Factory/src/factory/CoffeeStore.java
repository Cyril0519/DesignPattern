package factory;




/**
 * 咖啡馆
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        return factory.createCoffee();
    }


}
