public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());
        home.action(new Owner());
        System.out.println("-------------------");
        home.action(new Someone());

    }
}