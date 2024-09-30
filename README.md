# SentenceValidator

## Description
This Java program validates a sentence by checking that it meets specific criteria: it must be between 3 and 50 characters long, contain both uppercase and lowercase letters, and include at least one punctuation mark (either `.`, `!`, or `?`). The project demonstrates string manipulation, character checks, and conditionals in Java.

## Author
Written by Mohammed Qutu on 4/7/2024.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `SentenceValidatorApp.java` file and execute it. The user will be prompted to enter a sentence, and the program will validate the sentence based on the specified criteria.

### Example Output
Enter a sentence 3 to 50 characters long with at least one uppercase, lowercase, and one of these symbols (. ! ?): Hello World! Valid

### Validation Criteria:
- The sentence must be between 3 and 50 characters long.
- The sentence must contain at least one uppercase and one lowercase letter.
- The sentence must include at least one punctuation mark: `.`, `!`, or `?`.

### Methods:
- `isValidSentence(String sentence)`: Returns `true` if the sentence meets all validation criteria, otherwise returns `false`.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
