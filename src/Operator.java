public class Operator implements HelpOperator {
    private String name;

    public Operator(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("Hello my name is " + name + " and i`ll help you.");
    }
}
