public class OverAgeException extends Exception {
    public String message() {
        return "Age is over 65. You are considered overage.";
    }
}