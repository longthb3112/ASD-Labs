package lab5.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer();
        customer.setFirstName("Long");
        customer.setLastName("Tran");
        customer.setEmail("hbtran@mum.edu");
        customer.setPhone("123456789");
        Agent agent = new Agent();

        CallRecord callRecord = new CallRecord();
        callRecord.setCustomer(customer);
        callRecord.setAgent(agent);
        Request request = new Request();
        request.setCallRecord(callRecord);

        //chain handler
        AbstractAgent handler = new Validator();
        handler.nextAgent = new DataWasher();
        handler.nextAgent.nextAgent = new Reporter();

        //do request
        handler.handleRequest(request);

    }

}
