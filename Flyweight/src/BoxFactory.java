import java.util.HashMap;
import java.util.Map;

public class BoxFactory {
    private Map<String, AbstractBox> map = new HashMap<>();
    static volatile BoxFactory boxFactory;

    private BoxFactory() {
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());

    }

    public static BoxFactory getInstance() {
        if (boxFactory == null) {
            synchronized (BoxFactory.class) {
                if (boxFactory == null) {
                    boxFactory = new BoxFactory();
                }
            }
        }
        return boxFactory;
    }

    public AbstractBox getBox(String shape) {
        return map.get(shape);
    }
}
