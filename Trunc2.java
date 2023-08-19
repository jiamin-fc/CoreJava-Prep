import java.util.Scanner;

public class Trunc2 {
    public static void main(String[] args) {
        Scanner kBoard = new Scanner(System.in);
        // String inputString = "";
        

        System.out.println("Enter a string with a maximum length of 30:");
        String inputString = kBoard.nextLine();
        

        if (inputString.length() > 30) {
            System.out.println("The string is too long. Please enter again.");
            inputString = kBoard.nextLine();
        }

        char[] inputArray = inputString.toCharArray();
        char[] vowelArray = new char[inputArray.length];
        int vowelCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            char c = Character.toLowerCase(inputArray[i]);
            if (isVowel(c)) {
                vowelArray[vowelCount] = c;
                vowelCount++;
            }
        }

        System.out.print("The output of the second array is: ");
        for (int i = 0; i < vowelCount; i++) {
            System.out.print(vowelArray[i]);
        }
        System.out.println();

        System.out.println("The counts are as follows:");
        countAndDisplayOccurrences(vowelArray, vowelCount);

        System.out.println("The index of the second array where each vowel first appeared:");
        findFirstOccurrences(vowelArray, vowelCount);

        kBoard.close();
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    static void countAndDisplayOccurrences(char[] vowelArray, int vowelCount) {
        int[] counts = new int[5]; // Array to store occurrence count of each vowel

        for (int i = 0; i < vowelCount; i++) {
            char c = vowelArray[i];
            switch (c) {
                case 'a':
                    counts[0]++;
                    break;
                case 'e':
                    counts[1]++;
                    break;
                case 'i':
                    counts[2]++;
                    break;
                case 'o':
                    counts[3]++;
                    break;
                case 'u':
                    counts[4]++;
                    break;
            }
        }

        System.out.println("a=" + counts[0]);
        System.out.println("e=" + counts[1]);
        System.out.println("i=" + counts[2]);
        System.out.println("o=" + counts[3]);
        System.out.println("u=" + counts[4]);
    }

    static void findFirstOccurrences(char[] vowelArray, int vowelCount) {
        int[] firstOccurrences = new int[5]; // Array to store index of first occurrence for each vowel
        for (int i = 0; i < firstOccurrences.length; i++) {
            firstOccurrences[i] = -1; // Initialize with -1 to indicate vowel not found
        }

        for (int i = 0; i < vowelCount; i++) {
            char c = vowelArray[i];
            switch (c) {
                case 'a':
                    if (firstOccurrences[0] == -1) {
                        firstOccurrences[0] = i;
                    }
                    break;
                case 'e':
                    if (firstOccurrences[1] == -1) {
                        firstOccurrences[1] = i;
                    }
                    break;
                case 'i':
                    if (firstOccurrences[2] == -1) {
                        firstOccurrences[2] = i;
                    }
                    break;
                case 'o':
                    if (firstOccurrences[3] == -1) {
                                            firstOccurrences[3] = i;
                }
                break;
            case 'u':
                if (firstOccurrences[4] == -1) {
                    firstOccurrences[4] = i;
                }
                break;
            }
        }

        for (int i = 0; i < firstOccurrences.length; i++) {
            if (firstOccurrences[i] != -1) {
                char vowel = (char) ('a' + i);
                System.out.println(vowel + "=" + firstOccurrences[i]);
            } else {
                char vowel = (char) ('a' + i);
                System.out.println(vowel + " not found");
            }
        }
    }
}

