import java.util.Scanner;

public class Lab602 {

    public static int find_rank(double[] scores, int index) {
        int rank = 1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > scores[index]) {
                rank++;
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] movies = {
                "Me Before You",
                "Titanic",
                "Before Sunrise",
                "The Holiday",
                "A Walk to Remember"
        };

        double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};

        System.out.print("Enter movie title: ");
        String title = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < movies.length; i++) {
            if (title.equalsIgnoreCase(movies[i])) {
                int rank = find_rank(rate_scores, i);
                System.out.println();
                System.out.println("The rating score of " + "\"" + movies[i]+"\"" + " " + rate_scores[i]);
                System.out.println("The rank is " + rank);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println();
            System.out.println("Cannot found this movie title...");
        }
    }
}

