public class Client {
    public static void main(String[] args) {
        AbstractBox iBox1 = BoxFactory.getInstance().getBox("I");
        AbstractBox iBox2 = BoxFactory.getInstance().getBox("I");
        System.out.println(iBox2 == iBox1);
    }
}