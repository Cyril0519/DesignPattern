import java.util.LinkedList;
import java.util.List;

public class SubscriptionSubject implements Subject {
    private List<Observer> weiXinUserList = new LinkedList<>();


    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }
    }
}
