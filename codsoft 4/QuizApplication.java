import java.util.Scanner;

public class QuizApplication {
    private static final String[][] questions = {
            {"What is the capital of France?", "A. Paris", "B. London", "C. Rome", "D. Berlin", "A"},
            {"What is the largest planet in our solar system?", "A. Jupiter", "B. Saturn", "C. Earth", "D. Mars", "A"},
            {"Who wrote 'Romeo and Juliet'?", "A. William Shakespeare", "B. Jane Austen", "C. Mark Twain", "D. Charles Dickens", "A"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        long startTime = System.currentTimeMillis();

        for (String[] question : questions) {
            System.out.println(question[0]);
            for (int i = 1; i < question.length - 1; i++) {
                System.out.println(question[i]);
            }
            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(question[question.length - 1])) {
                score++;
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);
        System.out.println("Total time taken: " + totalTime + " seconds");

        scanner.close();
    }
}
