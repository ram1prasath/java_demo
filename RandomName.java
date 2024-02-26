import java.util.Random;

public class RandomName {
    public static void main(String[] args) {
        String[] firstNameList = {"Ram", "Udhay", "Aarthi", "Udhay"};
       
        Random random = new Random();

        // Generate a random index for the first and last name lists
        int firstNameIndex = random.nextInt(firstNameList.length);

        // Get the random names
        String firstName = firstNameList[firstNameIndex];

        // Print the random name
        System.out.println("Random Name: " + firstName );
    }
}
