package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while(!line.equals("Beast!")){ //petlja se izvrsaa dok se ne napise Beast!
            String[] tokens = sc.nextLine().split("\\s+"); //name, age i gender razdvojeni su razmacima pa to ucitavamo u niz stringova
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String gender = tokens[2];
            switch (line){ //animalType
                case "Dog":
                    Dog dog = new Dog(name,age,gender);
                    System.out.println(dog);
                    break;
                case "Cat":
                    Cat cat = new Cat(name,age,gender);
                    System.out.println(cat);
                    break;
                case "Frog":
                    Frog frog = new Frog(name,age,gender);
                    System.out.println(frog);
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(name,age); //ovde se ne prosledjuje gender jer je to odredjeno konstantom u klasi
                    System.out.println(tomcat);
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(name,age); //ovde se ne prosledjuje gender jer je to odredjeno konstantom u klasi
                    System.out.println(kitten);
                    break;
            }
            line = sc.nextLine();
        }
    }
}
