import java.util.Scanner;

public class findingMissingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1; // If no missing number is found (should not occur if array is valid)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        findingMissingNum mn = new findingMissingNum();
        int missingNumber = mn.missingNumber(nums);
        System.out.println("Missing number: " + missingNumber);

        scanner.close();
    }
}
