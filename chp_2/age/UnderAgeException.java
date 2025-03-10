public class UnderAgeException extends Exception {

    public String message() {
        return "Age is under 18. You are not allowed.";
    }
}
