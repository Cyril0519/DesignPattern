package factory;

public class Main {
    public static void main(String[] args) {
        // 咖啡店对象
        CoffeeStore store = new CoffeeStore();
        // 咖啡工厂
        AmericanCoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        store.setFactory(coffeeFactory);

        Coffee coffee = store.orderCoffee();
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
