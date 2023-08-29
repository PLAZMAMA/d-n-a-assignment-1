import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CapitalSearch {
    /***
     * Creates capital state key values hashmap.
     * @return Created hashmap with the state as key and capital as value.
     */
    static HashMap<String, String> createStateCapitals() {
        // Initializing hashmap.
        HashMap<String, String> stateCapitals = new HashMap<String, String>();

        // Adding state capitals.
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

        // Returning generated hashmap.
        return stateCapitals;
    }

    /***
     * Prints a map in a readable format to console.
     * @param map Map to print to console.
     */
    static void printMap(Map<String, String> map) {
        // Declaring variable use to store formatted string.
        String formattedKeyVal;

        // Printing beggining symbol of map.
        System.out.println("{");
        // Iterating over each element in map.
        for (Map.Entry <String, String> mapEntry: map.entrySet()) {
            // Formatting and printing key value pair.
            formattedKeyVal = String.format("\t%s: %s,", mapEntry.getKey(), mapEntry.getValue());
            System.out.println(formattedKeyVal);
        }
        // Printing ending symbol of map.
        System.out.println("}");
    }

    public static void main(String[] args) {
        // Declating and initializing variables.
        String tryAgainResponse;
        String stateResponse;
        String formattedResult;
        boolean finished = false;
        HashMap<String, String> stateCapitals = createStateCapitals(); // Initializing map.
        Scanner input = new Scanner(System.in);
        TreeMap<String, String> sortedStateCapitals = new TreeMap<String, String>(stateCapitals); // Sorting map using a TreeMap.

        // Printing unsorted map.
        printMap(stateCapitals);
        
        // Repeating until the user does not want to run the program anymore.
        while (!finished) {
            // Printing state input prompt.
            System.out.println("Enter state to get its capital:");

            // Reading user input.
            stateResponse = input.nextLine().toLowerCase();
            // Converting it to a capitalized format.
            stateResponse = stateResponse.substring(0, 1).toUpperCase() + stateResponse.substring(1);

            // Checking if state exists and printing capital.
            // If state does not exist, the user is informed.
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

            System.out.println("Try again? (y/n)"); // Asking the user if he want to run the program again.
            tryAgainResponse = input.nextLine(); // Reading users answer.
            finished = tryAgainResponse.equalsIgnoreCase("n"); // Converting answer to boolean used by while loop.
        }

        // Closing input.
        input.close();
    }
}