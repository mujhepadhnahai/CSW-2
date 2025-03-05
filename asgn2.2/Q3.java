import java.util.*;
class Car implements Comparable<Car>{
    private String name;
    private int stock;
    private int model;

    public Car(int model,String name,int stock){
        this.name=name;
        this.stock=stock;
        this.model=model;
    }
    public String getname(){
        return name;
    }
    public int getstock(){
        return stock;
    }
    public int getmodel(){
        return model;
    }
    public int compareTo(Car otherCar){
        return Integer.compare(this.model,otherCar.model);
    }
    @Override
    public String toString(){
        return "name: "+name+" stock: "+stock+" model: "+model;
    }
}
class CarApp{
    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2017,"Toyota", 120));
        cars.add(new Car(2089,"Audi", 12));
        cars.add(new Car(1019,"BMW", 10));
        cars.add(new Car(1020,"Ferrari", 20));
        cars.add(new Car(2781,"Hundai", 102));
        Collections.sort(cars);
        System.out.println("List of sorted Car Objects");
        for(Car car: cars){
            System.out.println(car);
        }
    }
}