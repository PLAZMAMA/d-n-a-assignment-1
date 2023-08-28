import java.util.Arrays;
import java.util.Scanner;

class CapitalQuiz {
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

    public static String[][] bubbleSort(String[][] arr, int keyIndx) {
        String[] currentStateCap;
        String[] laterStateCap;

        for (int currentIndx = 0; currentIndx < arr.length - 1; currentIndx++) {
            for (int laterIndx = currentIndx + 1; laterIndx < arr.length; laterIndx ++) {
                currentStateCap = arr[currentIndx];
                laterStateCap = arr[laterIndx];

                if (currentStateCap[keyIndx].compareTo(laterStateCap[keyIndx]) > 0) {
                    arr[laterIndx] = currentStateCap;
                    arr[currentIndx] = laterStateCap;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        String formattedQuestion;
        String answer;
        int correctAnswers = 0;
        Scanner input = new Scanner(System.in);
        String [][] sortedStateCapitals = bubbleSort(STATE_CAPITALS, 1);

        for (String[] stateCapital : sortedStateCapitals) {
            formattedQuestion = String.format("What is the capital of %s?", stateCapital[0]);
            System.out.println(formattedQuestion);
            answer = input.nextLine();
            if (answer.equalsIgnoreCase(stateCapital[1])) {
                correctAnswers += 1;
            }
        }

        System.out.println("Toal correct answers: " + correctAnswers);

        input.close();
    }
}