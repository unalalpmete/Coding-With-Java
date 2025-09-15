public class Practice1 {
    public static void main(String[] args) {
        // Find the largest and smallest number in the array
        int[] numbers = {26, 7, 19, 3, 37, 13};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
