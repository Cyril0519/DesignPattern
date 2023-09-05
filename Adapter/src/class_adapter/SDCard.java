package class_adapter;

/**
 * 目标接口
 */
public interface SDCard {
    // 从SD卡读取数据
    String readSD();

    // 往SD卡读写数据
    void writeSD(String data);

}
