import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Tom";
        int age = 16;
        Eye leftEye = new Eye("Left eye", "blind", "black", true);
        Eye rightEye = new Eye("Right eye", "blind", "black", false);
        Heart heart = new Heart("Heart", "None", 70);
        Stomach stomach = new Stomach("Stomach", "hungry");
        Skin skin = new Skin("Skin", "None");
        Person person = new Person(name, age, leftEye, rightEye, heart, stomach, skin);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        boolean quit = false;
        while(!quit){
            System.out.println("Choose one of the following organs: ");
            System.out.println("1. Left Eye");
            System.out.println("2. Right Eye");
            System.out.println("3. Heart");
            System.out.println("4. Stomach");
            System.out.println("5. Skin");
            System.out.println("6. Quit");
            System.out.print("Input: ");
            Scanner sc = new Scanner(System.in);
            int organChoice = sc.nextInt();
            if (organChoice == 1){
                System.out.println(leftEye);
                int userInput = sc.nextInt();
                if (userInput == 1){
                    leftEye.closeEye();
                }
            } else if (organChoice == 2){
                System.out.println(rightEye);
                int userInput = sc.nextInt();
                if (userInput == 1){
                    rightEye.closeEye();
                }
            } else if (organChoice == 3){
                System.out.println(heart);
                int userInput = sc.nextInt();
                if (userInput == 1){
                    System.out.print("Enter the new heart rate: ");
                    int newHeartRate = sc.nextInt();
                    heart.setHeartRate(newHeartRate);
                }
            } else if (organChoice == 4){
                System.out.println(stomach);
                int userInput = sc.nextInt();
                if (userInput == 1){
                    stomach.digest();
                }
            } else if (organChoice == 5){
                System.out.println(skin);
            } else if (organChoice == 6){
                quit = true;
                System.exit(0);
            } else {
                System.out.println("Invalid!");
            }
        }
    }
}
