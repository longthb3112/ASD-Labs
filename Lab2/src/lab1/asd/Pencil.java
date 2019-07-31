package lab1.asd;


//public class Pencil {
//    public static Pencil getPencil(){
//        return PencilSingleton.INSTANCE;
//    }
//    public void write(String message){
//        System.out.println(message);
//    }
//    private static class PencilSingleton{
//            private static Pencil INSTANCE = new Pencil();
//    }
//}

public class ASingleton{
    private static ASingleton uniqueClass = null;
    private static Object lock = new Object();

    public static ASingleton getInstance(){
        if(uniqueClass == null){
            synchronized (lock){
                if(uniqueClass == null){
                    uniqueClass = new ASingleton();
                }
            }
        }
        return uniqueClass;
    }
}
public enum enumSingleton{
    INSTANCE;
     enumSingleton(){}
     public void doSomething(){
     }
}
