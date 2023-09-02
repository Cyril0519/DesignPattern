package simple;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}