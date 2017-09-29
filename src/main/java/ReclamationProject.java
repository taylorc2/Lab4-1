/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * A class that prints Reclaims something maybe.
 *
 */
public class ReclamationProject {
    /**
     *
     * @param args al;fdj
     */
   public static void main(final String[] args) {
    }
    /**
     *
     * @param alpha String from user
     * @param beta String from user
     * @return r
     */
    public static String pleaseDo(final String alpha, final String beta) {
        String a = alpha;
        String b = beta;
        if (a.length() > b.length()) {
            String c = a;  // set c to a
            a = b;
            b = c;
            }
        String r = "";
                //(a.equals(b)) ? "" : ""; // I love the ternary operator!
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    boolean forR = a.regionMatches(i, b, k, j) && (j > r.length());
                    String chance = a.substring(i, i + j);
                    if (forR) {
                        r =  chance; // Do it!
                    }
                        }
                } // Ah yeah
        }
        return r;
        }

}
