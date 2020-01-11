package hw0;
import java.lang.Integer;

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
	int len = args.length;
	int[] a = new int[len];
	for(int i=0;i<len;i++){
		a[i]=Integer.parseInt(args[i]);
	}
	int count = numZero(a);
	System.out.println("NUM ZEROS: "+count);
        // (a) Modify the main method to contain exactly one call to the
        // numZero method. The arguments for the call should be read from
        // the command line (parsing args).
    }
}
