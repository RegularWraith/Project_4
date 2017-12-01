package Homework.Task_1;

import java.util.Scanner;

public class Main {
    public enum Continent {EUROPE, ASIA, OCEANIA, SOUTH_AMERICA, NORTH_AMERICA, AFRICA}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the country");
        String country = sc.nextLine();
        Continent continent;
        switch (country) {
            case "Poland": case "Ucraine": case "Great Britain":
            continent = Continent.EUROPE;
                System.out.println("This is Europe");
                break;
        case "Russia": case "China": case "Japan":
            continent = Continent.ASIA;
                System.out.println("This is Asia");
                break;
        case "Australia": case "Melanesia": case "Polynesia":
            continent = Continent.OCEANIA;
                System.out.println("This is Oceania");
                break;
            case "Brazil": case "Argentina": case "Peru":
                continent = Continent.SOUTH_AMERICA;
                System.out.println("This is South America");
                break;
            case "U.S.A": case "Canada": case "Mexico":
                continent = Continent.NORTH_AMERICA;
                System.out.println("This is North America");
                break;
            case "Libya": case "Egypt": case "Niger":
                continent = Continent.AFRICA;
                System.out.println("This is Africa");
                break;
                default:
                    System.out.println("No this country");
        }


    }

}
