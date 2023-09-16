/**
 * 总经理（具体处理者）
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handleLevel(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent());
        System.out.println("总经理审批：同意");
    }
}
