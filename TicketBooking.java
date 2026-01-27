import javax.swing.JOptionPane;

public class TicketBooking {

    public static String select_showtime(Movie movie) {
        String input = JOptionPane.showInputDialog(
                movie+
                        "\nPress 1 to select show time 13:00" +
                        "\nPress 2 to select show time 14:30" +
                        "\nPress 3 to select show time 15:00"+"\nEnter a number : ");

        int choice = Integer.parseInt(input);

        switch (choice) {
            case 1:
                return "13:00";
            case 2:
                return "14:30";
            case 3:
                return "15:00";
            default:
                return "Error time";
        }
    }

    public static String select_seat_number() {
        String row = JOptionPane.showInputDialog("Enter seat row (A-G) : ");
        String number = JOptionPane.showInputDialog("Enter seat number (1-12) : ");
        return row.toUpperCase() + number;
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 120, "PG-13");

        String show_time = select_showtime(movie);

        String seat_number = select_seat_number();

        Ticket ticket = new Ticket(
                "T001",
                movie,
                show_time,
                seat_number,
                240
        );

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book a " + movie.getTitle() + " ticket?",
                "Confirm Booking",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            String result = ticket.bookTicket();
            JOptionPane.showMessageDialog(null, result);
        }

        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}

