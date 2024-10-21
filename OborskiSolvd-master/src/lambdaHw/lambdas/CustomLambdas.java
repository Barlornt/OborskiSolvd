package lambdaHw.lambdas;

import lambdaHw.enums.Car;
import lambdaHw.enums.Days;
import lambdaHw.enums.Fruits;
import lambdaHw.functional.Checker;
import lambdaHw.functional.Operation;
import lambdaHw.functional.Transformer;

public class CustomLambdas {
    public static void main(String[] args) {
        // Lambda 1: Operation (Addition)
        Operation<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Addition result: " + add.apply(5, 10));

        // Lambda 2: Checker (String length)
        Checker<String> lengthCheck = (s) -> s.length() > 5;
        System.out.println("Is the string length > 5? " + lengthCheck.check("Hello World"));

        // Lambda 3: Transformer (String to Length)
        Transformer<String, Integer> stringToLength = (s) -> s.length();
        System.out.println("Length of the string: " + stringToLength.transform("Lambda"));

        // Using Enums
        System.out.println("Today's Day: " + Days.MONDAY);
        System.out.println("Favorite Fruit: " + Fruits.APPLE.getDisplayName() + " with color: " + Fruits.APPLE.getColor());

        // Accessing Car properties
        Car myCar = Car.TESLA;
        System.out.println("Car: " + myCar + " with max speed: " + myCar.getMaxSpeed() + " km/h, electric: " + myCar.isElectric());
    }
}
