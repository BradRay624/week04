package week04;

public class Week4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Step 1: Create an array of integers called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // a. Programmatically subtract the value from the first element from the last element
        int ageDifference = ages[ages.length - 1] - ages[0]; // Using ages.length to get the last element
        System.out.println("Difference between last and first age: " + ageDifference);

        // b. Create a new array of integers called ages2
        int[] ages2 = new int[9]; // ages2 will have 9 elements

        // i. Fill the ages2 array with example values
        ages2[0] = 5;
        ages2[1] = 10;
        ages2[2] = 20;
        ages2[3] = 30;
        ages2[4] = 40;
        ages2[5] = 50;
        ages2[6] = 60;
        ages2[7] = 70;
        ages2[8] = 80;

        // ii. Repeat the subtraction from Step 1.a
        int ageDifferenceAges2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Difference between last and first age in ages2: " + ageDifferenceAges2);

        // iii. Demonstrating dynamic access
        System.out.println("Dynamic access test (ages2 length): " + ages2.length);

        // Step 2: Create an array of Strings called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);

        // b. Concatenate the names together
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("Concatenated names: " + concatenatedNames.toString());

        // Step 3: Accessing the last element of an array
        int lastElement = ages[ages.length - 1];
        System.out.println("Last element of ages: " + lastElement);

        // Step 4: Accessing the first element of an array
        int firstElement = ages[0];
        System.out.println("First element of ages: " + firstElement);

        // Step 5: Create a new array called nameLengths
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Step 6: Calculate the sum of all elements in nameLengths
        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println("Sum of name lengths: " + sumOfNameLengths);

        // Step 7: Method to concatenate a string n times
        System.out.println(concatenateWord("Hello", 3));

        // Step 8: Method to return full name
        System.out.println(getFullName("Brad", "Ray"));

        // Step 9: Method to check if sum of array is greater than 100
        int[] sampleArray = {50, 30, 40};
        System.out.println("Is sum greater than 100? " + isSumGreaterThan100(sampleArray));

        // Step 10: Method to calculate the average of double array
        double[] doubleArray = {2.5, 3.0, 4.0};
        System.out.println("Average of double array: " + calculateAverage(doubleArray));

        // Step 11: Compare averages of two double arrays
        double[] array1 = {1.0, 2.0, 3.0};
        double[] array2 = {2.0, 3.0, 4.0};
        System.out.println("Is average of array1 greater than array2? " + isAverageGreater(array1, array2));

        // Step 12: Method to check if will buy drink
        System.out.println("Will buy drink? " + willBuyDrink(true, 15.0));

        // Step 13: Custom method example
        System.out.println("Result of custom method: " + multiplyByTwo(15));
    }

    // Step 7 Method: Concatenate word n times
    public static String concatenateWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    // Step 8 Method: Return full name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // Step 9 Method: Check if sum of array is greater than 100
    public static boolean isSumGreaterThan100(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum > 100;
    }

    // Step 10 Method: Calculate average of double array
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    // Step 11 Method: Compare averages of two double arrays
    public static boolean isAverageGreater(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2);
    }

    // Step 12 Method: Determine if will buy drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // Step 13: Custom method example
    // This method takes an integer input and returns the input multiplied by 2
    public static int multiplyByTwo(int input) {
        return input * 2;
	}

}
