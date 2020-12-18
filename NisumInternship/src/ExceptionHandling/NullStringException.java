package ExceptionHandling;

public class NullStringException extends RuntimeException {

    NullStringException(String errorMessage){
        super(errorMessage);
    }
}
