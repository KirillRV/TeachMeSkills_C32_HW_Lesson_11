package task_1.ApplicationRunner;

import static task_1.Operation.StringOperation.*;

public class ApplicationRunner {
    public static void main(String[] args) {
        String documentNumber = "5554-abc-5678-def-9g0h";

        showFirstTwoBlocks(documentNumber);
        showDocumentWithMask(documentNumber);
        showOnlyLettersLowercase(documentNumber);
        showLettersUppercase(documentNumber);
        checkForABC(documentNumber);
        checkStartsWith555(documentNumber);
        checkEndsWith1a2b(documentNumber);
    }
}
