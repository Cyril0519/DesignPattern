package class_adapter;

import javax.crypto.MacSpi;

/**
 * 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("adapter write tf card");
        writeTF(data);
    }
}
