public class q1{
    private String name;

    public q1(String name) {
        this.name = name;
        System.out.println("Object created: " + this.name);
    }

    public void show() {
        q1 obj1 = new q1("First Object");
        obj1.display();
    }

    public void display() {
        q1 obj2 = new q1("Second Object");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + this.name);
    }

    public static void main(String[] args) {
        q1 obj = new q1("Main Object");
        obj.show();
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main method ends.");
    }
}

