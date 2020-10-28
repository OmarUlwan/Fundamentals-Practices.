package se.omar.ulwan;

// import the Scanner class
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        // Create a String with your first name as content.
        // Print out the String object to the console.
        // Create two Strings one with your first name and the other with your last name.
        // Print out both Strings to the console with a ” ” separating them.

        String firstName = "Omar";
        String lastName = "Ulwan";

        System.out.println("My first name is: " + firstName);
        System.out.println("My full name is: " + firstName + " " + lastName);

        // Create two variables with decimal values.
        // Create a third decimal variable called result.
        // Assign the sum of the two first variables to result.

        float firstDecimal = 3.5f;
        double secondDecimal = 6.5;
        double result = firstDecimal + secondDecimal;

        System.out.println (firstDecimal+ " + " + secondDecimal + " = " + result);

        // Create a class called Car.
        // The class should contain the following information.
        // Car brand, registration number, max speed and owner name.
        // Instantiate an Object of the class and assign values to the object.

        class Car {
            String brand;
            String regNum;
            int maxSpeed;
            String ownerName;

            public String getInfo () {
                String carResult = "Car brand: " + brand + ", Registering number: " + regNum + ", Max speed: " + maxSpeed + "Km/h" + ", Owner name: " + ownerName;
                return carResult;
            }
        }

        Car audi = new Car();
        audi.brand = "Audi A6";
        audi.regNum = "WXY 003";
        audi.maxSpeed = 320;
        audi.ownerName = "Omar Ulwan";
        System.out.println(audi.getInfo ());

        // Make an integer called score and assign a value to it.
        // Create an if – else statement that should print out ”you passed” if the score is above or equals to 65.
        // If score is below 65 it should print ”you did not pass”.

        int score = 77;
        if (score >= 65) {
            System.out.println("you passed");
        } else {
            System.out.println("you did not pass");
        }

        // Use your new knowledge to take a String as input from the user and store it in a String object.

        // 1. We create an Object "userInput" of the class "Scanner" since we have imported it on line 4 "import java.util.Scanner;".
        Scanner userInput = new Scanner(System.in);
        // 2. We create a String variable "userName".
        String userName;
        // 3. Answer on the question and press Enter.
        System.out.println("Enter your user name: ");
        //4.Assign the answer to the variable "userName".
        userName = userInput.nextLine();
        //5. Print the answer.
        System.out.println("Your user name is: " + userName);


    }
}
