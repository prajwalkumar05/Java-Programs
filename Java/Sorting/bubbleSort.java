
class BubbleSort {

    public static void main(String argss[]) {

        int[] numbers = { 100, 35, 24, 46, 2, 69 };

        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = 0; j < (numbers.length - 1) - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            // 24 35 46 100
        }

    }

}
