public class MainString {
    static String sentence = "This is a global variable sentence.";
    public static void main(String[] args) {

        // Show: Sentence: 'This is a global variable sentence.'
        System.out.println("Sentence: '"+sentence+"'");

        // Show: String length:
        System.out.println("String length: "+ sentence.length());

        // Show: words count in sentence
        System.out.println("Words in sentence: "+sentence.split(" ").length);

        // Show: T h i s   i s   a   g l o b a l   v a r i a b l e   s e n t e n c e .
        for(char c : sentence.toCharArray()) {
            System.out.print(c+" ");
        }
        System.out.println();

        // Substring from sentence
        // This is
        System.out.println(sentence.substring(0, 7)); // First 7 chars

        // a global variable sentence.
        System.out.println(sentence.substring(8)); // from 8 to end

        // global
        System.out.println(sentence.substring(10, 16));

        // TASK: length of fourth word
            // Short
        System.out.println("Length of the fourth word: "+sentence.split(" ")[3].length()); // Split by SPACE, get fourth element's length
            // Long
        String[] words = sentence.split(" ");
        int wordLength = words[3].length();
        System.out.println("Length of the fourth word: "+wordLength);

    }
}
