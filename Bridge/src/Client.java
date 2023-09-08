public class Client {
    public static void main(String[] args) {
        OperatingSystem system = new Windows(new AviFile());
        system.play("视频");
    }
}
