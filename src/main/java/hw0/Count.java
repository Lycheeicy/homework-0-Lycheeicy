package hw0;

public class Count {
    // Effects: return the number of occurrences of 0 in a
    public static int numZero(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // (a) Modify the main method to contain exactly one call to the
        // numZero method. The arguments for the call should be read from
        // the command line (parsing args).

        ..................
    }
}
