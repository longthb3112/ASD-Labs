package lab4.asd;

public class SimpleTraceFactory implements TraceFactory {
    private static TraceFactory traceFactory = new SimpleTraceFactory();
    private SimpleTraceFactory(){}
    public static TraceFactory getTraceFactory(){
        return traceFactory;
    }
    @Override
    public Trace createTrace(String type) {
        if(type.equals("File")){
            return new FileTrace();
        }else{
            return new ConsoleTrace();
        }
    }
}
