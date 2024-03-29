package lab6.asd;

public class Request {
    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public Customer getRequester() {
        return requester;
    }

    public void setRequester(Customer requester) {
        this.requester = requester;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public String getRespContent() {
        return respContent;
    }

    public void setRespContent(String respContent) {
        this.respContent = respContent;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public boolean isSaleLead() {
        return isSaleLead;
    }

    public void setSaleLead(boolean saleLead) {
        isSaleLead = saleLead;
    }

    public boolean isNeedCallBack() {
        return needCallBack;
    }

    @Override
    public String toString() {
        return "Request{" +
                "reqId='" + reqId + '\'' +
                ", requester=" + requester +
                ", agent=" + agent +
                ", reqContent='" + reqContent + '\'' +
                ", respContent='" + respContent + '\'' +
                ", isAnswered=" + isAnswered +
                ", isSaleLead=" + isSaleLead +
                ", needCallBack=" + needCallBack +
                '}';
    }

    public void setNeedCallBack(boolean needCallBack) {
        this.needCallBack = needCallBack;
    }

    private String reqId;
    private Customer requester;
    private Agent agent;
    private String reqContent;
    private String respContent;
    private boolean isAnswered;
    private boolean isSaleLead;
    private boolean needCallBack;
}
