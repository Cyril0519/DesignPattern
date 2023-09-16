public class Client {
    public static void main(String[] args) {
        Strategy strategyB = new StrategyB();
        SalesMan salesMan = new SalesMan(strategyB);
        salesMan.salesManShow();
    }
}