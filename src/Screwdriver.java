public class Screwdriver extends Tool {


    public Screwdriver() {
    }

    public Screwdriver(Workable workable) {
        super(workable);
    }

    @Override
    public void work() {
        System.out.println("Верчу кручу");
        component.work();
    }
}
