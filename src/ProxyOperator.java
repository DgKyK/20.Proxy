public class ProxyOperator implements HelpOperator {
    private Operator realOperator;

    @Override
    public void help() {
        System.out.println("Welcome to support service , please wait until Operator gets free");
        if (realOperator == null) {
           realOperator = new Operator("Anna");
        }
        realOperator.help();
    }
}
