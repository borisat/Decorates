public class Naildrawer extends Tool {


    public Naildrawer() {
    }

    public Naildrawer(Workable component) {
        super(component);
    }


    @Override
    public void work() {
        System.out.println("Тащу гвоздь");
        workable.work();
    }
}
