package object_adapter;

/**
 * 适配者类实现类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "read data from tf: hello world";
        return msg;
    }

    @Override
    public void writeTF(String data) {
        System.out.println("tf card write data: "+data);

    }
}
