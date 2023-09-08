/**
 * 抽象的操作系统（抽象化角色）
 */
public abstract class OperatingSystem {
    // 声明videoFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
