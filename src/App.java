import java.util.Scanner;

public class App {

    public static Scanner in = new Scanner(System.in);
    public static String userName;
    public static int userAge;
    public static int userFaveNum;

    public static void main(String[] args) throws Exception {

        greet();
        userName = in.nextLine();

        repeatName(userName);
        userName = in.nextLine();

        userAge = guessAge();

        userFaveNum = countUp();

        quiz();

        bye();
    }

    public static void greet() {
        System.out.println("Hi, I'm ChatBot. What's your name?");
    }

    public static void repeatName(String name) {
        StringBuilder revName = new StringBuilder(name);
        revName.reverse();

        System.out.println(revName + "... that doesn't sound right.");
        System.out.println("I'm a little low on RAM today, could you repeat your name for me?");
    }

    public static int guessAge() {
        System.out.println("Now that we're better acquainted, can I try guessing your age?");

        String ans1 = in.nextLine();
        if (ans1.equals("yes") || ans1.equals("ok")) {
            System.out.println("Great! Here we go:");
        } else {
            System.out.println("Too bad, this assignment requires me to try.");
        }

        int min = 0;
        int max = 100;

        System.out.println("Are you old enough to vote?");
        String ans2 = in.nextLine();
        if (ans2.equals("yes")) {
            min = 18;
        } else {
            max = 17;
        }

        System.out.println("That's my only question, on to the guessing!");

        while (true) {
            int guess = (int) ((Math.random() * (max - min)) + min);

            System.out.println("Are you " + guess + " years old?");
            String ans3 = in.nextLine();

            if (ans3.equals("yes")) {
                System.out.println("Hurray! We're done with this part of the program.");
                return guess;
            } else {
                System.out.println("Darn, let's try again:");
            }
        }
    }

    public static int countUp() {
        System.out.println("Guessing can be hard, but I'm always good at counting.");
        System.out.println("Tell me your favorite number, and I'll count up to it for you!");
        System.out.println("Only positive, whole numbers please, I'm still learning.");

        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        return num;
    }

    public static void quiz() {
        System.out.println("Ok I just have one more question to help calibrate my human interaction algorithms.");

        System.out.println("What is the best programming language?");
        System.out.println("A: Javascript");
        System.out.println("B: Python");
        System.out.println("C: Java");
        System.out.println("D: Cobra");

        String ans;
        do {
            ans = in.nextLine();
            if (!ans.equalsIgnoreCase("C")) {
                System.out.println("Try that again...");
            }
        } while (!ans.equalsIgnoreCase("C"));

        System.out.println("That's right, because I was made with Java!");
    }

    public static void bye() {
        System.out.println("Thanks for humoring me, I had a lot of fun asking you questions.");
        System.out.println("Goodbye!");
    }
}
