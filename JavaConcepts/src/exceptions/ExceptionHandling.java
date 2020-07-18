package exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling obj = new ExceptionHandling();
        try{
            obj.sample();
        }catch (CustomExceptionClass e){
            System.out.println("exception in main");
            e.printStackTrace();
            e.customMethod();
        }
    }
    public void sample() throws CustomExceptionClass {
        System.out.println("in sample(). . .");
        sample1();
    }
    public void sample1() throws CustomExceptionClass{
        System.out.println("in sample1(). . .");
        throw new CustomExceptionClass("new custom IOException");
    }
}

class CustomExceptionClass extends Throwable{
    private String name;
    CustomExceptionClass(String str){
        this.name = str;
        System.out.println("exceptions.CustomExceptionClass constructor");
    }

    public void customMethod(){
        System.out.println("custom method of exceptions.CustomExceptionClass");
    }
}