/**
 * 具体元素角色类（宠物猫）
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);  // 访问者给宠物猫喂食
    }
}
