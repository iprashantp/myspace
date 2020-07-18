package exceptions;

public class CustomizedException {
    public static void main(String[] args) {
        int age = 44;
        if(age>60){
            throw new TooOldException("age is beyond 60");
        }else if(age<16) {
            throw new TooYoungException("age is below 16");
        }else{
            System.out.println("perfect age");
        }

    }
}

class TooOldException extends RuntimeException{
    public TooOldException(String s){
        super(s);
    }
}

class TooYoungException extends RuntimeException{
    public TooYoungException(String s){
        super(s);
    }
}