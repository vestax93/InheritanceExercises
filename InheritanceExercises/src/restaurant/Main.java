package restaurant;

public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake("Cheese cake");
        System.out.println(cake.getName() + " " + cake.getCalories() + " " + cake.getGrams() + " " + cake.getPrice());
    }
}
