import java.util.*;

class StringMenu {
    String sentence; // Fixed spelling

    // Read a sentence from user input
    public void read(Scanner sc) {
        sentence = sc.nextLine();
    }

    // Count occurrences of each word
    public void count() {
        String[] words = sentence.split("\\s+"); // Handles multiple spaces
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Replace a word in the sentence
    public void replace(Scanner sc) {
        System.out.print("Enter the word to replace: ");
        String word = sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        sentence = sentence.replaceAll("\\b" + word + "\\b", newWord); // Ensures full word replacement
    }

    // Reverse each word in the sentence
    public void reverse() {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            reversedSentence.append(new StringBuilder(word).reverse()).append(" ");
        }

        sentence = reversedSentence.toString().trim(); // Trim to remove extra space
    }

    // Display the sentence
    public String dis() {
        return sentence;
    }

    public static void main(String[] args) {
        StringMenu obj = new StringMenu();
        Scanner sc = new Scanner(System.in); // Single Scanner instance

        while (true) {
            System.out.println("\n1) Enter Sentence");
            System.out.println("2) Display Sentence");
            System.out.println("3) Count Words");
            System.out.println("4) Replace Word");
            System.out.println("5) Reverse Each Word");
            System.out.println("6) Exit");

            System.out.print("Option: ");
            int opt = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (opt) {
                case 1:
                    System.out.print("Enter the sentence: ");
                    obj.read(sc);
                    break;
                case 2:
                    System.out.println("Sentence: " + obj.dis());
                    break;
                case 3:
                    System.out.println("Word Counts:");
                    obj.count();
                    break;
                case 4:
                    obj.replace(sc);
                    break;
                case 5:
                    obj.reverse();
                    System.out.println("Reversed Words Sentence: " + obj.dis());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
