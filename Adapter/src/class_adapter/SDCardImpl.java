package class_adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "read data from SD card: hello world";
    }

    @Override
    public void writeSD(String data) {
        System.out.println("write data to SD card: " + data);
    }
}
