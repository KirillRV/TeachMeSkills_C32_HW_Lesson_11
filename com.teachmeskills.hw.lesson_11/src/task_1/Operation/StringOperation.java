package task_1.Operation;

public class StringOperation {

    // Method to display the first two blocks of 4 digits
    public static void showFirstTwoBlocks(String documentNumber) {
        String[] parts = documentNumber.split("-");
        System.out.println(parts[0] + parts[2]);
    }

    // Method to display the document number with masked letter blocks
    public static void showDocumentWithMask(String documentNumber) {
        String maskedDocument = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(maskedDocument);
    }

    // Method to display only letters in the format yyy/yyy/y/y in lowercase
    public static void showOnlyLettersLowercase(String documentNumber) {
        String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String formattedLetters = lettersOnly.substring(0, 3) + "/" + lettersOnly.substring(3, 6) + "/" +
                lettersOnly.substring(6, 7) + "/" + lettersOnly.substring(7, 8);
        System.out.println(formattedLetters);
    }

    // Method to display letters in the format "Letters: yyy/yyy/y/y" in uppercase using StringBuilder
    public static void showLettersUppercase(String documentNumber) {
        String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "").toUpperCase();
        StringBuilder formattedLetters = new StringBuilder("Letters:");
        formattedLetters.append(lettersOnly.substring(0, 3)).append("/")
                .append(lettersOnly.substring(3, 6)).append("/")
                .append(lettersOnly.substring(6, 7)).append("/")
                .append(lettersOnly.substring(7, 8));
        System.out.println(formattedLetters.toString());
    }

    // Method to check if the document number contains the sequence "abc"
    public static void checkForABC(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("The document number contains 'abc' sequence.");
        } else {
            System.out.println("The document number does not contain 'abc' sequence.");
        }
    }

    // Method to check if the document number starts with "555"
    public static void checkStartsWith555(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("The document number starts with '555'.");
        } else {
            System.out.println("The document number does not start with '555'.");
        }
    }

    // Method to check if the document number ends with "1a2b"
    public static void checkEndsWith1a2b(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("The document number ends with '1a2b'.");
        } else {
            System.out.println("The document number does not end with '1a2b'.");
        }
    }
}