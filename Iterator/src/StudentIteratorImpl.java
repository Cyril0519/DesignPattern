import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {
    public StudentIteratorImpl(List<Student> list){
        this.list = list;
    }

    // 声明集合类型
    private List<Student> list ;

    private int position = 0; // 用来记录遍历时我的位置
    @Override
    public boolean hashNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }

}
