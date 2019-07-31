package lab6.asd;

public class Agent {
    private String agentId;
    private String name;

    public Agent(String agentId, String name) {
        this.agentId = agentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentId='" + agentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
