package lab6.asd;

import java.util.Date;

public class Call {
    private String requestId;
    private Agent agent;
    RequestDirector requestDirector = new RequestDirector(new UserRequestBuilder());
    public void callPop(Agent agent){
        this.agent = agent;
        this.requestId = ""+(new Date()).getTime();
    }
    public void buildOpening(String phoneNumber,String requestContent){
        requestDirector.buildOpening(requestId,phoneNumber,agent,requestContent);
    }
    public void buildResponseContent(String requestResponse){
        requestDirector.buildResponseContent(requestResponse);
    }
    public void buildClosing(boolean isAnswer, boolean needCallBack) {
        requestDirector.buildClosing(isAnswer,needCallBack);
    }
    public Request getRequest(){
        return requestDirector.getRequest();
    }
}