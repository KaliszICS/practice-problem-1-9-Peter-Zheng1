
class Notes {

    public static void main(String[] args) {

        // =============================================
        // TRACING TABLE PRACTICE TEMPLATE
        // =============================================
        // HOW TO USE THIS TEMPLATE:
        // 1. Set a breakpoint on the first line of code (click the line number)
        // 2. Run the program in DEBUG mode
        // 3. Use "Step Over" to move one line at a time
        // 4. Watch the Variables panel to see values change
        // 5. Fill in your tracing table as you go!
        // =============================================

        // --- TRACING TABLE ---
        // Draw this table in your book and fill it in as you step through:
        //
        // | Line | Variable: name | Variable: age | Variable: greeting | Output Printed |
        // |------|----------------|---------------|--------------------|----------------|
        // |  15  |      ???       |      ???      |        ???         |                |
        // |  16  |      ???       |      ???      |        ???         |                |
        // ... keep going for each line!
        // ---------------------

        // === VARIABLES ===
        String name = "Alice";       // Line 1 - what is name now?
        int age = 16;                // Line 2 - what is age now?
        String greeting = "Hello";  // Line 3 - what is greeting now?

        // === CALCULATIONS ===
        int nextAge = age + 1;       // Line 4 - what is nextAge now?
        greeting = greeting + ", " + name + "!";  // Line 5 - what is greeting now?

        // === OUTPUT ===
        System.out.println(greeting);           // Line 6 - what gets printed?
        System.out.println("You are " + age + " years old.");   // Line 7 - what gets printed?
        System.out.println("Next year you will be " + nextAge); // Line 8 - what gets printed?

        // === TRY IT YOURSELF ===
        // Change the values of name and age above, then:
        // 1. Predict what the output will be BEFORE running
        // 2. Run in debug mode and check if you were right!
        // 3. Update your tracing table with the new values

    }
}
