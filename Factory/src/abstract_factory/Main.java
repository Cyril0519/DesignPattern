package abstract_factory;

public class Main {
    public static void main(String[] args) {
        DessertFactory italyDessertFactory = new ItalyDessertFactory();

        Dessert dessert = italyDessertFactory.createDessert();
        Coffee coffee = italyDessertFactory.createCoffee();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
