package MainAirport;

import java.util.Scanner;

public class FlightRunner {
    public final static String ALASKA = "ALASKA";
    public final static String LASVEGAS = "Las vegas";
    public final static String LASANGELES = "Las Angeles";
    public final static String MOSCOW = "Moscow";
    public final static String WARSZAWA = "Warszawa";
    public final static String BERLIN = "Berlin";

    private String directionChoice;
    private Scanner scanner;

    public FlightRunner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getDirectionChoice() {
        return directionChoice;
    }

    public void selectDirectionChoice() {
        System.out.println("Select: ALASKA; Las Vegas; Las Angeles; Moscow; Warszawa; Berlin");
        switch (scanner.next()) {
            case "ALASKA":
                directionChoice = ALASKA;
                break;
            case "Las vegas":
                directionChoice = LASVEGAS;
                break;
            case "Las Angeles":
                directionChoice = LASANGELES;
                break;
            case "Moscow":
                directionChoice = MOSCOW;
                break;
            case "Warszawa":
                directionChoice = WARSZAWA;
                break;
            case "Berlin":
                directionChoice = BERLIN;
                break;
            default:
                System.out.println("Wrong selection");
        }
    }

    public boolean calculateRoute() {
        System.out.println("Airport selested" + directionChoice);
        if (directionChoice.equals(ALASKA)) {
        } else if (directionChoice.equals(LASVEGAS)) {
        } else if (directionChoice.equals(LASANGELES)) {
        } else if (directionChoice.equals(MOSCOW)) {
        } else if (directionChoice.equals(WARSZAWA)) {
        } else if (directionChoice.equals(MOSCOW)) {
        }
        return false;
    }
}