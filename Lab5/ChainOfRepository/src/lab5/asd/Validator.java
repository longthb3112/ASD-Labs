package lab5.asd;

public class Validator extends  AbstractAgent {
    @Override
    public boolean canHandleRequest(Request request) {
        if(request != null && request.getCallRecord() != null){
            if(request.getCallRecord().getCustomer() != null){
                return true;
            }
        }
        return false;
    }

    @Override
    public void handleRequest(Request request) {
        if(this.canHandleRequest(request)){
            System.out.println("Validator handle request");
            CallRecord callRecord = request.getCallRecord();
            if(callRecord.getAgent() != null){
                callRecord.setValid(true);
                request.setCallRecord(callRecord);
                nextAgent.handleRequest(request);
            }
        }
    }
}
