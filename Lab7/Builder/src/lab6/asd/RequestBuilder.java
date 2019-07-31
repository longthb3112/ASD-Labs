package lab6.asd;

public interface RequestBuilder {
    void buildOpening(String requestId, String phoneNumber,Agent agent, String requestContent);
    void buildResponseContent(String requestResponse);
    void buildClosing(boolean isAnswer, boolean needCallBack);
    Request getRequest();
}
