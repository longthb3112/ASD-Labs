package lab4.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TraceFactory factory = SimpleTraceFactory.getTraceFactory();
        Trace fileTrace = factory.createTrace("File");
        fileTrace.setDebug(true);
        fileTrace.debug("do debugging");
        Trace consoleTrace = factory.createTrace("Console");
        consoleTrace.setDebug(true);
        consoleTrace.error("test sameple error");
    }
}
