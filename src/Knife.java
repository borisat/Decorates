public class Knife extends Tool {

    public Knife() {
    }

    public Knife(Workable workable) {
        super(workable);
    }

    @Override
    public void work() {
        System.out.println("режу");
        workable.work();
    }
}
