package lab4.asd;

public class FileTrace implements  Trace{
    private boolean debug;
    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if(debug){
            System.out.println("File debug: "+message);
        }
    }

    @Override
    public void error(String message) {
        if(debug){
            System.out.println("File error: "+message);
        }
    }
}
