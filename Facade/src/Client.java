public class Client {
    public static void main(String[] args) {
        SmartApplicationFacade facade = new SmartApplicationFacade();
        facade.operate("打开");
        facade.operate("关闭");
    }
}
