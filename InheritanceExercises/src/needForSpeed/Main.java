package needForSpeed;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar(20,20);
        sportCar.drive(1);
        System.out.println(sportCar.getFuel());
    }
}
