package lab6.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Call call = new Call();
        call.callPop(new Agent("1","Long agent"));
        call.buildOpening("1234567","Help me open an account?");
        call.buildResponseContent("Yes, of course");
        call.buildClosing(true, false);
        Request request = call.getRequest();
        System.out.println(request);
    }
}
