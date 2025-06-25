public class RecursiveSum {

            public static int sum(int[] arr, int index) {
                // Base case: if index reaches the end of array
                if (index == arr.length) {
                    return 0;
                }
                // Recursive case: current element + sum of remaining
                return arr[index] + sum(arr, index + 1);
            }

            public static void main(String[] args) {
                int[] numbers = {2, 4, 6, 8, 10};

                int result = sum(numbers, 0);

                System.out.println("Sum of array elements: " + result);
            }
        }



