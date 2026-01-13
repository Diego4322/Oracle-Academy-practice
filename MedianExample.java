import java.util.Arrays;

public class MedianExample {
    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 4, 5};

        
        Arrays.sort(arr);

        double median;
        int n = arr.length;

        if (n % 2 == 1) {
            
            median = arr[n / 2];
        } else {
            
            median = (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }

        System.out.println("Median: " + median);
    }
}
