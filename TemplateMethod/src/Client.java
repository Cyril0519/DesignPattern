public class Client {
    public static void main(String[] args) {
        //炒手撕包菜
        AbstractClass baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
        System.out.println("------------");
        //炒蒜蓉菜心
        AbstractClass caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}