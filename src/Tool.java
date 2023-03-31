public abstract class Tool implements Workable {

    Workable component = new Workable() {
        @Override
        public void work() {
        }
    };


    public Tool(Workable workable) {
        this.component = workable;
    }

    public Tool() {
    }

    @Override
    public void work() {
        component.work();
    }
}
