import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        String newSentence = "";
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            newSentence += restOfWord + firstLetter + "ауч ";
        }
        System.out.println(newSentence.trim());
    }
}