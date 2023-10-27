import java.util.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
        var positive = 0;
        var negative = 0;
        var zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) positive++;
            if (arr.get(i) < 0) negative++;
            if (arr.get(i) == 0) zero++;
        }

        double positiveRes = (double) positive / arr.size();
        double negativeRes = (double) negative / arr.size();
        double zeroRes = (double) zero / arr.size();

        System.out.printf("%.6f%n", positiveRes);
        System.out.printf("%.6f%n", negativeRes);
        System.out.printf("%.6f%n", zeroRes);

    }

}