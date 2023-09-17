import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类
 */
public class Home {
    // 声明一个集合对象用来存储元素对象
    private List<Animal> nodeList = new ArrayList<>();

    // 添加元素功能
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    // 元素接收访问者访问
    public void action(Person person) {
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
