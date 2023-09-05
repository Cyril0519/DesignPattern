package object_adapter;

/**
 * 适配者类接口
 */
public interface TFCard {
    // 从TF卡读数据
    String readTF();

    // 从TF卡写数据
    void writeTF(String data);

}
