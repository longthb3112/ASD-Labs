package lab5.asd;

public class Reporter extends AbstractAgent {
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
            System.out.println("Reporter handle request");
            CallRecord callRecord = request.getCallRecord();
            if(callRecord != null && callRecord.isValid() && callRecord.isASalesLead()){
                System.out.println(callRecord.getCustomer());
            }
        }
    }
}
