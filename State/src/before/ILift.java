package before;

public interface ILift {
    // 四个状态
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void open();

    void close();

    void run();

    void stop();
}
