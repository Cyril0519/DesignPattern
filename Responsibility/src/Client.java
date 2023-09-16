public class Client {
    public static void main(String[] args) {
        // 创建一个请假条对象
        LeaveRequest leaveRequest = new LeaveRequest("小明", 6, "身体不适");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        // 设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 提交申请
        groupLeader.submit(leaveRequest);
    }
}