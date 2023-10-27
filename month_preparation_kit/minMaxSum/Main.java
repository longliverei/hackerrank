public class Main {
    class Result {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here
            Collections.sort(arr);
            Long sort = sum(arr);

            Collections.reverse(arr);
            Long reverseSort = sum(arr);

            System.out.println(sort + " " + reverseSort);
        }

        private static Long sum(List<Integer> arr) {
            Long res = 0L;

            for (int i = 0; i < arr.size() - 1; i++) {
                res = res + arr.get(i);
            }

            return res;
        }
    }
}
