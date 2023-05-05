public class Main {
    // One line comment

    /**
     * Java documentation
     *
     */

    /*
    Multi
    line
    comment
     */
    static String[] names = {"John", "Jack", "James", "Annabel"};
    public static void main(String[] args) {
        System.out.println("Hello Java World!"); // Print text to console
        String name = "Justin"; // String
        int age = 31; // Integer
        double height = 1.77; // Murdarv
        System.out.println(name + " is " + age + " years old and " + height + "m tall.");

        // Array of primitive integers
        int[] ages = {20, 17, 53, 64, 14};
        showIntegers(ages);
        ages[0] = 100;
        showIntegers(ages);
        ages[ages.length-1] = 99;
        showIntegers(ages);

        // Show names strings
        showStrings();
    }

    // Method for printing array
    private static void showIntegers(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println(); // Return carrier
    }
    public static void showStrings() {
        for(int x = 0; x < names.length; x++) {
            System.out.print(names[x] + " ");
        }
        System.out.println();
    }
}
