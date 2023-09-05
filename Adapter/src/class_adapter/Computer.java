package class_adapter;

public class Computer {

    // 从SD卡读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is invalidate");
        }
        return sdCard.readSD();
    }


}
