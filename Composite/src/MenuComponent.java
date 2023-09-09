public abstract class MenuComponent {
    String name;
    int level;

    public  void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public  void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public  MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();


}
