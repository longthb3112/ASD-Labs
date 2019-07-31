package lab6.asd;

public class RequestDirector {
    RequestBuilder requestBuilder;
    public RequestDirector(RequestBuilder builder){
        this.requestBuilder = builder;
    }
    public void buildOpening(String requestId, String phoneNumber,Agent agent, String requestContent){
        requestBuilder.buildOpening(requestId,phoneNumber,agent,requestContent);
    }
    public void buildResponseContent(String requestResponse){
        requestBuilder.buildResponseContent(requestResponse);
    }
    public void buildClosing(boolean isAnswer, boolean needCallBack) {
        requestBuilder.buildClosing(isAnswer,needCallBack);
    }
    public Request getRequest(){
        return requestBuilder.getRequest();
    }
}
