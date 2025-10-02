package M2;

public class Problem4 extends BaseClass {
    private static final String[] array1 = { "hello world!", "java programming", "special@#$%^&characters", "numbers 123 456",
            "mIxEd CaSe InPut!" };
    private static final String[] array2 = { "hello world", "java programming", "this is a title case test",
            "capitalize every word", "mixEd CASE input" };
    private static final String[] array3 = { "  hello   world  ", "java    programming  ",
            "  extra    spaces  between   words   ",
            "      leading and trailing spaces      ", "multiple      spaces" };
    private static final String[] array4 = { "hello world", "java programming", "short", "a", "even" };

    private static void transformText(String[] arr, int arrayNumber) {
        // Only make edits between the designated "Start" and "End" comments
        printArrayInfoBasic(arr, arrayNumber);

        // Challenge 1: Remove non-alphanumeric characters except spaces
        // Challenge 2: Convert text to Title Case
        // Challenge 3: Trim leading/trailing spaces and remove duplicate spaces
        // Result 1-3: Assign final phrase to `placeholderForModifiedPhrase`
        // Challenge 4 (extra credit): Extract up to middle 3 characters when possible (beginning starts at middle of phrase excluding the first and last characters),
        // assign to 'placeholderForMiddleCharacters'
        
        // if not enough characters assign "Not enough characters"
 
        // Step 1: sketch out plan using comments (include ucid and date)
        // Step 2: Add/commit your outline of comments (required for full credit)
        // Step 3: Add code to solve the problem (add/commit as needed)
        String placeholderForModifiedPhrase = "";
        String placeholderForMiddleCharacters = "";
        
        for(int i = 0; i <arr.length; i++){
            // Start Solution Edits
            // the line below takes a string and deletes any index that isnt a letter or a Number 
            String cleaned= arr[i].replaceAll("[^a-zA-Z0-9 ]", "").trim();
            //the line takes the string and places them into a array and makes them lowercase 
            String[] words= cleaned.toLowerCase().split("\\s+");
        
            // this line  takes the word and amkes the first index of the word Upper case and keeps the rest lowercase
            for(String w: words) placeholderForModifiedPhrase += w.substring(0,1).toUpperCase()+ w.substring(1)+" ";
            placeholderForModifiedPhrase= placeholderForModifiedPhrase.trim();

            // line checks if the phrase is 2 characters or shorter, and if it is, it prints "not enough characters"
            if (placeholderForModifiedPhrase.length() <= 2) {
                placeholderForModifiedPhrase= "Not enough Characters";
                    //else statement takes the middle index of the word and stores it as a substring String --(PlaceholderForMiddlecharacters);
            } else {
                int mid= placeholderForModifiedPhrase.length()/2;
                int start = Math.max(1,mid -1);
                int end= Math.min(placeholderForModifiedPhrase.length() -1, start +3);
                placeholderForMiddleCharacters = placeholderForModifiedPhrase.substring(start,end);
            }


            
             // End Solution Edits
            System.out.println(String.format("Index[%d] \"%s\" | Middle: \"%s\"",i, placeholderForModifiedPhrase, placeholderForMiddleCharacters));
        }

       

        
        System.out.println("\n______________________________________");
    }

    public static void main(String[] args) {
        final String ucid = "ajm292"; // <-- change to your UCID
        // No edits below this line
        printHeader(ucid, 4);

        transformText(array1, 1);
        transformText(array2, 2);
        transformText(array3, 3);
        transformText(array4, 4);
        printFooter(ucid, 4);
    }

}