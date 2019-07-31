package lab5.asd;

public abstract class AbstractAgent {
    protected AbstractAgent nextAgent;
    abstract boolean canHandleRequest(Request request);
    abstract void handleRequest(Request request);
}
