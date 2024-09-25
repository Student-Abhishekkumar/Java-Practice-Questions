import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A) Berlin");
        System.out.println("B) London");
        System.out.println("C) Paris");
        System.out.println("D) Rome");
        System.out.print("Enter your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("C")) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Incorrect. The correct answer is C) Paris.\n");
        }

        // Question 2
        System.out.println("Question 2: Which of the following planets is known as the 'Red Planet'?");
        System.out.println("A) Mars");
        System.out.println("B) Earth");
        System.out.println("C) Jupiter");
        System.out.println("D) Saturn");
        System.out.print("Enter your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("A")) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Incorrect. The correct answer is A) Mars.\n");
        }

        // Question 3
        System.out.println("Question 3: Who painted the famous painting 'The Starry Night'?");
        System.out.println("A) Leonardo da Vinci");
        System.out.println("B) Vincent van Gogh");
        System.out.println("C) Pablo Picasso");
        System.out.println("D) Claude Monet");
        System.out.print("Enter your answer: ");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("B")) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Incorrect. The correct answer is B) Vincent van Gogh.\n");
        }

        // Question 4
        System.out.println("Question 4: What is the chemical symbol for gold?");
        System.out.println("A) Ag");
        System.out.println("B) Hg");
        System.out.println("C) Pb");
        System.out.println("D) Au");
        System.out.print("Enter your answer: ");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("D")) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Incorrect. The correct answer is D) Au.\n");
        }

        // Question 5
        System.out.println("Question 5: Who wrote the famous novel 'To Kill a Mockingbird'?");
        System.out.println("A) F. Scott Fitzgerald");
        System.out.println("B) Harper Lee");
        System.out.println("C) Jane Austen");
        System.out.println("D) J.K. Rowling");
        System.out.print("Enter your answer: ");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("B")) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Incorrect. The correct answer is B) Harper Lee.\n");
        }

        System.out.println("Quiz over! Your final score is " + score + "/5.");
        scanner.close();
    }
}