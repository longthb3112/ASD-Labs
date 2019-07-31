package lab5.asd;

public class DataWasher extends AbstractAgent {
    @Override
    public boolean canHandleRequest(Request request) {
        if(request != null){
            return true;
        }
        return false;
    }

    @Override
    public void handleRequest(Request request) {
        if(this.canHandleRequest(request)){
            System.out.println("DataWasher handle request");
            request.getCallRecord().setASalesLead(true);
            this.nextAgent.handleRequest(request);
        }
    }
}
