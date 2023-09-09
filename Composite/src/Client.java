public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("系统管理", 0);
        MenuComponent menu2 = new Menu("菜单管理", 1);
        MenuComponent menu3 = new Menu("角色管理", 1);
        MenuComponent menu4 = new Menu("权限管理", 1);
        menu1.add(menu2);
        menu1.add(menu3);
        menu1.add(menu4);

        menu4.add(new MenuItem("页面访问", 2));
        menu4.add(new MenuItem("提交保存", 2));
        menu1.print();

    }
}