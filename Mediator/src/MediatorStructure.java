/**
 * 具体中介者角色类
 */
public class MediatorStructure extends Mediator{
    // 聚合房主和租房者对象
    private HouseOwner houseOwner;
    private Tenant tenant;
    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {  // 房主
            tenant.getMessage(message);
        }else {  // 租房者
            houseOwner.getMessage(message);
        }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
