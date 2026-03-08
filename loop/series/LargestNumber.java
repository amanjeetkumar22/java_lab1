package loop.series;
public class LargestNumber {
    public static void main(String[] args) {

        int num = 57294;
        int max = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit > max)
                max = digit;

            num = num / 10;
        }

        System.out.println("Largest digit = " + max);
    }
}