public class UnreachableObject {

    private String name;

    // Constructor to initialize the object with a given name
    public UnreachableObject(String name) {
        this.name = name;
        System.out.println("Object " + name + " created.");
    }

    // Method to display the name of the object
    public void display() {
        System.out.println("Displaying object " + name);
        // Creating another instance of UnreachableObject inside display()
        UnreachableObject obj2 = new UnreachableObject(name + " Child");
        obj2 = null;  // Making obj2 unreachable
    }

    // Method to show the creation of objects and call display
    public void show() {
        UnreachableObject obj1 = new UnreachableObject(name);
        obj1.display();
        obj1 = null; // Making obj1 unreachable
    }

    // Overriding finalize() method to display when object is garbage collected
    @Override
    protected void finalize() {
        System.out.println("Object " + name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("Main Object");
        obj.show();  // Calling show() which creates and manipulates other objects

        // Requesting garbage collection explicitly
        System.gc();  // Calling garbage collector explicitly

        // Adding a short delay to allow garbage collection to happen before program ends
        try {
            Thread.sleep(1000); // Sleep for a short period to allow gc to collect objects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
