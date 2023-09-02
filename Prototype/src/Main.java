public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType1 = new RealizeType();
        RealizeType realizeType2 = realizeType1.clone();
        System.out.println(realizeType1 == realizeType2);  // false
    }
}