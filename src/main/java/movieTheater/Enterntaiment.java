package movieTheater;
import java.util.Locale;
import  java.util.Scanner;

public class Enterntaiment {
    public static void main(String[] args) {

        System.out.println("Hello and Welcome. Please choose a movie theater:");
        System.out.println("AMC | REGAL | EMADINE | FANDANGO");
        Scanner  scanner=new Scanner (System.in);
        String theater=scanner.nextLine().toUpperCase(Locale.ROOT);

        MovieService service=null;
        switch (theater) {
            case "AMC":
                service = new Amc(100, true, 5, 2, true, true);
                service.welcomeCustomers();
                while (true) {
                    System.out.println("movies|seats|info|quit");
                    String option = scanner.nextLine();
                    if (option.equalsIgnoreCase("movies")) {
                        service.showAvailableMovies();
                    } else if (option.equalsIgnoreCase("seats")) {
                        System.out.println("Which movie? ");
                        String movieName = scanner.nextLine();
                        service.showAvailableSeats(movieName);
                    }else if (option.equalsIgnoreCase("info")){
                        service.showTheaterInfo();
                }else if (option.equalsIgnoreCase("quit")) {
                    break;
                }
        }
                break;
        case "REGAL":
        }

    }
}
