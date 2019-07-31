package lab5.asd;

public  class Receiver {
    private static Shape shape = new Shape();
    public  static  Shape getShape(){
        return shape;
    }
    public static void setShape(Shape newShape){
        shape = newShape;
    }
}
