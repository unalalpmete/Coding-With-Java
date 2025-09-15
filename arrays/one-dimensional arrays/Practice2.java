public class Practice2 {
    public static void main(String[] args) {
        // Separate even and odd numbers from an array
        int[] numbers = {12, 5, 7, 8, 19, 24};

        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
