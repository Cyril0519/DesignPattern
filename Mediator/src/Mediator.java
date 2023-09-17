/**
 * 抽象中介者类
 */
public abstract class Mediator {
    /**
     * 联系
     * @param message 传递的消息
     * @param person 发消息的人
     */
    public abstract void contact(String message, Person person);
}
