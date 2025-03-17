public class q2 {
    public static void checkForNull(String obj) throws CustomNullPointerException {
        if (obj == null) {
            throw new CustomNullPointerException("Custom error: Object is null!");
        }
        System.out.println("Object is not null.");
    }
    public static void main(String[] args) {
        try {
            String str = null;
            checkForNull(str);
        } catch (CustomNullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}