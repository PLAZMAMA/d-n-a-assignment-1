import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CapitalSearch {
    static HashMap<String, String> createStateCapitals() {
        HashMap<String, String> stateCapitals = new HashMap<String, String>();

        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        stateCapitals.put("Colorado", "Denver");
        stateCapitals.put("Connecticut", "Hartford");
        stateCapitals.put("Delaware", "Dover");
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("Georgia", "Atlanta");
        stateCapitals.put("Hawaii", "Honolulu");
        stateCapitals.put("Idaho", "Boise");
        stateCapitals.put("Illinios", "Springfield");
        stateCapitals.put("Indiana", "Indianapolis");
        stateCapitals.put("Iowa", "Des Monies");
        stateCapitals.put("Kansas", "Topeka");
        stateCapitals.put("Kentucky", "Frankfort");
        stateCapitals.put("Louisiana", "Baton Rouge");
        stateCapitals.put("Maine", "Augusta");
        stateCapitals.put("Maryland", "Annapolis");
        stateCapitals.put("Massachusetts", "Boston");
        stateCapitals.put("Michigan", "Lansing");
        stateCapitals.put("Minnesota", "St. Paul");
        stateCapitals.put("Mississippi", "Jackson");
        stateCapitals.put("Missouri", "Jefferson City");
        stateCapitals.put("Montana", "Helena");
        stateCapitals.put("Nebraska", "Lincoln");
        stateCapitals.put("Neveda", "Carson City");
        stateCapitals.put("New Hampshire", "Concord");
        stateCapitals.put("New Jersey", "Trenton");
        stateCapitals.put("New Mexico", "Santa Fe");
        stateCapitals.put("New York", "Albany");
        stateCapitals.put("North Carolina", "Raleigh");
        stateCapitals.put("North Dakota", "Bismarck");
        stateCapitals.put("Ohio", "Columbus");
        stateCapitals.put("Oklahoma", "Oklahoma City");
        stateCapitals.put("Oregon", "Salem");
        stateCapitals.put("Pennsylvania", "Harrisburg");
        stateCapitals.put("Rhode Island", "Providence");
        stateCapitals.put("South Carolina", "Columbia");
        stateCapitals.put("South Dakoda", "Pierre");
        stateCapitals.put("Tennessee", "Nashville");
        stateCapitals.put("Texas", "Austin");
        stateCapitals.put("Utah", "Salt Lake City");
        stateCapitals.put("Vermont", "Montpelier");
        stateCapitals.put("Virginia", "Richmond");
        stateCapitals.put("Washington", "Olympia");
        stateCapitals.put("West Virginia", "Charleston");
        stateCapitals.put("Wisconsin", "Madison");
        stateCapitals.put("Wyoming", "Cheyenne");

        return stateCapitals;
    }

    static void printMap(Map<String, String> map) {
        String formattedKeyVal;

        System.out.println("{");
        for (Map.Entry <String, String> mapEntry: map.entrySet()) {
            formattedKeyVal = String.format("\t%s: %s,", mapEntry.getKey(), mapEntry.getValue());
            System.out.println(formattedKeyVal);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        String tryAgainResponse;
        String stateResponse;
        String formattedResult;
        boolean finished = false;
        HashMap<String, String> stateCapitals = createStateCapitals();
        Scanner input = new Scanner(System.in);
        TreeMap<String, String> sortedStateCapitals = new TreeMap<String, String>(stateCapitals);

        printMap(stateCapitals);
        
        while (!finished) {
            System.out.println("Enter state to get its capital:");
            stateResponse = input.nextLine();

            if (sortedStateCapitals.containsKey(stateResponse)) {
                formattedResult = String.format(
                    "The capital of %s is %s",
                    stateResponse,
                    sortedStateCapitals.get(stateResponse)
                );
            } else {
                formattedResult = String.format(
                    "State '%s' does not exist",
                    stateResponse
                );
            }

            System.out.println(formattedResult);

            System.out.println("Try again? (y/n)");
            tryAgainResponse = input.nextLine();
            finished = tryAgainResponse.equalsIgnoreCase("n");
        }

        input.close();
    }
}