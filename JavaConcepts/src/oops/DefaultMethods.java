package oops;

public class DefaultMethods implements interfaceX, interfaceY{
    public static void main(String args[]){
        DefaultMethods obj = new DefaultMethods();
        obj.getCountY();
    }
    @Override
    public void printerX() {
        System.out.println("implemented printX method of X");
    }

    @Override
    public void printerY() {
        System.out.println("implemented printerY method of Y");
    }
}

interface interfaceX{
    public void printerX();
    public default void getCountX(){
        System.out.println(100);
    }
}

interface interfaceY{
    public void printerX();
    public void printerY();

//    public default void getCountX(){
//        System.out.println(100);
//    }
    public default void getCountY(){
        System.out.println(200);
    }
}