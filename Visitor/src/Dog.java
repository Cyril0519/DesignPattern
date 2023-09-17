public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);  // 访问者给狗喂食
    }
}
