import java.util.Scanner;

public class Lab405{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input some sentence: ");
        String sentence = sc.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point: ");
            sentence = sc.nextLine();
        }

        sentence = sentence.substring(0, sentence.length() - 1);
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                System.out.println(words[i] + ".");
            } else {
                System.out.println(words[i]);
            }
        }
    }
}
