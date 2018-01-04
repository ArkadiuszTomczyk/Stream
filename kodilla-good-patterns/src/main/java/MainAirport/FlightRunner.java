package MainAirport;

import java.util.List;
import java.util.Scanner;

public class FlightRunner {
    public final static String ALASKA = "ALASKA";
    public final static String LASVEGAS = "Las vegas";
    public final static String LASANGELES = "Las Angeles";
    public final static String MOSCOW = "Moscow";
    public final static String WARSZAWA = "Warszawa";
    public final static String BERLIN = "Berlin";
    public final static String FROM = "From";
    public final static String TO = "To";
    public final static String VIA = "Via";

    private String directionChoice;
    private Scanner scanner = new Scanner(System.in);
    private String typeChoice;
    private String viaChoice;


    public String getDirectionChoice() {
        return directionChoice;
    }

    public void selectDirectionChoice() {
        System.out.println("Select To: ALASKA; Las Vegas; Las Angeles; Moscow; Warszawa; Berlin");
        switch (scanner.nextLine()) {
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
    public void selectType() {
        System.out.println("Select: To, From, Via");
        switch (scanner.nextLine()) {
            case "To":
                typeChoice = TO;
                break;
            case "From":
                typeChoice = FROM;
                break;
            case "Via":
                typeChoice = VIA;
                break;

            default:
                System.out.println("Wrong selection");
        }
    }

    public void selectViaChoice() {
        System.out.println("Select Via: ALASKA; Las Vegas; Las Angeles; Moscow; Warszawa; Berlin");
        switch (scanner.nextLine()) {
            case "ALASKA":
                viaChoice = ALASKA;
                break;
            case "Las vegas":
                viaChoice = LASVEGAS;
                break;
            case "Las Angeles":
                viaChoice = LASANGELES;
                break;
            case "Moscow":
                viaChoice = MOSCOW;
                break;
            case "Warszawa":
                viaChoice = WARSZAWA;
                break;
            case "Berlin":
                viaChoice = BERLIN;
                break;
            default:
                System.out.println("Wrong selection");
        }
    }

    public String getTypeChoice() {
        return typeChoice;
    }

    public boolean calculateRoute() {
        System.out.println("Airport selested: " + directionChoice);
        FlightService fl = new FlightService();
        List<Flight1> result = null;
        switch (typeChoice) {
            case TO :
                result =  fl.getFlight1sTo(directionChoice);
                break;
            case FROM :
                result =  fl.getFlight1sFrom(directionChoice);
                break;

        }
        for (Flight1 flight : result) {
            System.out.println(flight);
        }
        return false;
    }

    public static void main(String [] args) {
        FlightRunner fr = new FlightRunner();
        fr.selectType();
        if (fr.getTypeChoice().equals(VIA)){
            fr.selectViaChoice();
        }
        fr.selectDirectionChoice();
        fr.calculateRoute();

    }
}