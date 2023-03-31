public class Main {

    public static void main(String[] args) {

        Tool multiTool = new Knife(new Naildrawer(new Screwdriver()));

        multiTool.work();
    }
}
