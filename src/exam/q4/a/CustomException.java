package exam.q4.a;

public class CustomException extends Exception {
    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
        System.err.println(message);
    }
}
