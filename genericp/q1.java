 class Box<T> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        System.out.println("Integer value in Box: " + intBox.getValue());
        Box<String> strBox = new Box<>("Hello, World!");
        System.out.println("String value in Box: " + strBox.getValue());
        Box<Person> personBox = new Box<>(new Person("John", 25));
        System.out.println("Person in Box: " + personBox.getValue().getName());
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
