public class q3 {
    private String name;

    public q3(String name) {
        this.name = name;
        System.out.println("Object created: " + this.name);
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + this.name);
    }

    public static void main(String[] args) {
        q3 obj = new q3("My Object");
        obj = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main method ends.");
    }
}
