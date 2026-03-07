class Car {
 String model;
 Car(String m) { // Parameterized Constructor
 model = m;
 }
 Car(Car c) { // Copy Constructor
 model = c.model;
 }
 void display() {
 System.out.println("Model: " + model);
 }
}
public class Copyconstructer {
 public static void main(String[] args) {
 Car car1 = new Car("BMW");
 Car car2 = new Car(car1); // Using Copy Constructor
 car2.display();
 }
}