public class Client {
    public static void main(String[] args) {
        // 创建中介者
        MediatorStructure mediator = new MediatorStructure();

        // 创建租房者对象
        Tenant tenant = new Tenant("张三", mediator);
        // 创建房主对象
        HouseOwner houseOwner = new HouseOwner("李四", mediator);

        // 中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.contact("需要租三室的房子");
        houseOwner.contact("我这有三室的房子，你需要租吗？");
    }
}
