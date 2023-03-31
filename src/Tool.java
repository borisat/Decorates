public abstract class Tool implements Workable {

    Workable workable = new Workable() {
        @Override
        public void work() {
        }
    };


    public Tool(Workable workable) {
        this.workable = workable;
    }

    public Tool() {
    }

    @Override
    public void work() {
        workable.work();
    }
}
