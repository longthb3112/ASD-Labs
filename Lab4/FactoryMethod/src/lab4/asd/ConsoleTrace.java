package lab4.asd;

public class ConsoleTrace implements Trace{
    private boolean debug;
    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if(!debug) return;
        System.out.println("Console debug: " + message);
    }

    @Override
    public void error(String message) {
        if(!debug) return;
        System.out.println("Console error: " + message);
    }
}
