package lab6.asd;

import java.util.Date;
import java.util.Optional;

public class UserRequestBuilder implements  RequestBuilder{
    private Request request = new Request();
    @Override
    public void buildOpening(String requestId, String phoneNumber,Agent agent, String requestContent) {
        request = new Request();
        request.setReqId(requestId);
        Optional<Customer> cus= CustomerDB.Customers.stream().filter(x -> x.getPhoneNumber() == phoneNumber).findFirst();
        if(!cus.isPresent()){
            request.setRequester(new Customer("cusId"+ (new Date()).getTime(),phoneNumber));
        }else{
            request.setRequester(cus.get());
        }

        request.setAgent(agent);
        request.setReqContent(requestContent);
    }

    @Override
    public void buildResponseContent(String requestResponse) {
        request.setRespContent(requestResponse);
    }

    @Override
    public void buildClosing(boolean isAnswer, boolean needCallBack) {
        if(request.getRespContent() == null || request.getRespContent() ==""){
            request.setRespContent("3rd party");
        }
        request.setAnswered(isAnswer);
        request.setNeedCallBack(needCallBack);
    }

    @Override
    public Request getRequest() {
        return request;
    }
}
