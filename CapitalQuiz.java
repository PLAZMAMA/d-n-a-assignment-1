import java.util.Arrays;
import java.util.Scanner;

class CapitalQuiz {
    // 2D Array of the states and their capital. 
    static final String[][] STATE_CAPITALS = {
        {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahassee"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinios", "Springfield"},
        {"Indiana", "Indianapolis"},
        {"Iowa", "Des Monies"},
        {"Kansas", "Topeka"},
        {"Kentucky", "Frankfort"},
        {"Louisiana", "Baton Rouge"},
        {"Maine", "Augusta"},
        {"Maryland", "Annapolis"},
        {"Massachusetts", "Boston"},
        {"Michigan", "Lansing"},
        {"Minnesota", "St. Paul"},
        {"Mississippi", "Jackson"},
        {"Missouri", "Jefferson City"},
        {"Montana", "Helena"},
        {"Nebraska", "Lincoln"},
        {"Neveda", "Carson City"},
        {"New Hampshire", "Concord"},
        {"New Jersey", "Trenton"},
        {"New Mexico", "Santa Fe"},
        {"New York", "Albany"},
        {"North Carolina", "Raleigh"},
        {"North Dakota", "Bismarck"},
        {"Ohio", "Columbus"},
        {"Oklahoma", "Oklahoma City"},
        {"Oregon", "Salem"},
        {"Pennsylvania", "Harrisburg"},
        {"Rhode Island", "Providence"},
        {"South Carolina", "Columbia"},
        {"South Dakoda", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},
        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},
        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}
    };

    /**
     * Sorts a 2D array of strings by a given key index.
     * @param arr 2D array of strings to sort.
     * @param keyIndx Index of the inner array to use for sorting.
     * @return Sorted 2D string array.
     */
    public static String[][] bubbleSort(String[][] arr, int keyIndx) {
        // Declaring state capital pairs (inner array) that are used for temporary reference.
        // Initializing variable that signifies if a swap happened during the iteration
        // Made with the goal of improving readability and allow swapping data.
        String[] currentStateCap;
        String[] nextStateCap;
        boolean swapped = true;

        // Looping until a full iteration has gone with no swaps.
        while (swapped) {
            // Resetting swapped status.
            swapped = false;

            // Iterating over the array.
            for (int currentIndx = 0; currentIndx < arr.length - 1; currentIndx++) {
                currentStateCap = arr[currentIndx];
                nextStateCap = arr[currentIndx + 1];

                // Swapping if next element is alphabetically smaller.
                if (currentStateCap[keyIndx].compareTo(nextStateCap[keyIndx]) > 0) {
                    // swapping both elements.
                    arr[currentIndx] = nextStateCap;
                    arr[currentIndx + 1] = currentStateCap;

                    // Turning on swap indication.
                    swapped = true;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        // Declaring and initializing variables.
        String formattedQuestion;
        String answer;
        int correctAnswers = 0;
        Scanner input = new Scanner(System.in);
        String [][] sortedStateCapitals = bubbleSort(STATE_CAPITALS, 1);

        // Looping over each state capital pairs in sorted state capitals array.
        for (String[] stateCapital : sortedStateCapitals) {
            // Formatting and printing input prompt
            formattedQuestion = String.format("What is the capital of %s?", stateCapital[0]);
            System.out.println(formattedQuestion);

            // Reading user input.
            answer = input.nextLine();
            // Checking if answer is correct and counting it.
            if (answer.equalsIgnoreCase(stateCapital[1])) {
                correctAnswers += 1;
            }
        }

        // Printing user's quiz results.
        System.out.println("Toal correct answers: " + correctAnswers);

        // Closing input.
        input.close();
    }
}