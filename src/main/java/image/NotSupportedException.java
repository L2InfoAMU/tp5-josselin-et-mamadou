package image;

public class NotSupportedException extends RuntimeException {

    public NotSupportedException(String message){

    }

    @Override
    public String getMessage() {
        return "Error";
    }
}
