import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 服务员类 属于请求者对象
 */
public class Waitor {
    // 持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    // 发起命令的功能
    public void orderUp() {
        System.out.println("---------------订单来了---------------");
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command cmd = iterator.next();
            cmd.execute();
            iterator.remove();
        }
    }
}
