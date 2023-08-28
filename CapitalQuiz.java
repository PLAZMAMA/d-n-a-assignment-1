import java.util.Arrays;

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
        {"Rhoda Island", "Providence"},
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
        String currentStr;
        String laterStr;

        for (int currentIndx = 0; currentIndx < arr.length - 1; currentIndx++) {
            for (int laterIndx = currentIndx + 1; laterIndx < arr.length; laterIndx ++) {
                currentStr = arr[currentIndx][keyIndx];
                laterStr = arr[laterIndx][keyIndx];

                if (currentStr.compareTo(laterStr) > 0) {
                    arr[laterIndx][keyIndx] = currentStr;
                    arr[currentIndx][keyIndx] = laterStr;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(STATE_CAPITALS));
    }
}