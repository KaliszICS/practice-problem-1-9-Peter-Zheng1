import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {

        // =============================================
        // TRACING TABLE PRACTICE TEMPLATE
        // =============================================
        // HOW TO USE THIS TEMPLATE:
        // 1. Set a breakpoint on the FIRST line of code below
        //    (click the line number in the gutter - it turns red)
        // 2. Run the program in DEBUG mode (the bug icon, NOT the play button)
        // 3. Use "Step Over" (F8) to move one line at a time
        // 4. Watch the Variables panel on the left - values appear as you go!
        // 5. Fill in your tracing table on paper as you step through each line
        // =============================================

        // =============================================
        // SECTION 1: CREATING VARIABLES
        // =============================================

        // Step through each line and watch the Variables panel.
        // After each line, write the current value in your tracing table.

        String name = "Alice";          // What does the Variables panel show for name?
        int age = 16;                   // What does the Variables panel show for age?
        int score = 45;                 // What does the Variables panel show for score?
        int bonus = 10;                 // What does the Variables panel show for bonus?
        int total = 0;                  // What does the Variables panel show for total?
        String message = "No message";  // What does the Variables panel show for message?

        // =============================================
        // SECTION 2: CHANGING VARIABLE VALUES
        // =============================================

        // Watch closely! These lines CHANGE the value of existing variables.
        // The Variables panel will highlight the variable that just changed.

        total = score + bonus;          // total was 0. What is it now?
        score = score + 5;              // score was 45. What is it now?
        age = age + 1;                  // age was 16. What is it now?
        bonus = bonus * 2;              // bonus was 10. What is it now?
        total = score + bonus;          // total already had a value. What is the new value?

        // =============================================
        // SECTION 3: WORKING WITH TEXT (String) VARIABLES
        // =============================================

        // Strings can be joined together using the + symbol.
        // This is called CONCATENATION. Watch how message changes each time!

        message = "Hello, " + name;                         // What is message now?
        message = message + "!";                            // What is message now?
        message = message + " You are " + age + " years old."; // What is message now?

        // =============================================
        // SECTION 4: OUTPUT - printing to the screen
        // =============================================

        // When you step OVER a println line, check the output console at the bottom.
        // Write exactly what appears in the Output Printed column of your table.

        System.out.println("=== Student Report ===");
        System.out.println(message);
        System.out.println("Original score: " + score);
        System.out.println("Bonus points:   " + bonus);
        System.out.println("Total score:    " + total);
        System.out.println("======================");

        // =============================================
        // SECTION 5: NEW SCORES
        // =============================================

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a new score: ");  // This prints WITHOUT a newline
        int newScore = 50;         // What value does newScore get?

        System.out.print("Enter a bonus amount: ");
        int newBonus = 60;         // What value does newBonus get?

        // =============================================
        // SECTION 6: USING SECTION 5
        // =============================================

        // Now we use what the user typed. 
        // The values below depend on what YOU entered - so your table will be different 
        // to your classmates! That is completely normal.

        int newTotal = newScore + newBonus;             // What is newTotal?
        int difference = newTotal - total;              // Is this positive or negative? Why?
        String result = "Your new total is " + newTotal;  // What is result?

        // =============================================
        // SECTION 7: FINAL OUTPUT
        // =============================================

        System.out.println();
        System.out.println("=== New Calculation ===");
        System.out.println(result);
        System.out.println("Difference from before: " + difference);

        keyboard.close();

    }

}