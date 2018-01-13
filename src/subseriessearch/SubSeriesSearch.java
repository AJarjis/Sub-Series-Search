/** ***************************************************************************
 *
 * File        : SubSeriesSearch.java
 *
 * Date        : 21 November 2017
 *
 * Description : Source code for an algorithm which finds the closest match between
 *             a subsequence and a list of series.
 *
 * Author      : Ali Jarjis
 *
 ***************************************************************************** */
package subseriessearch;

/**
 *
 * @author Ali Jarjis
 */
public class SubSeriesSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] s = {1, 0, 3};
        double[][] t = {{3, 6, 8, 9}, {4, 5, 1, 0, 3, 6, 4, 1, 0, 1, 0, 6, 3}};
        int[] position = subSeriesSearch(s, t);

        System.out.println("Position: " + position[0] + ":"+ position[1]);
    }

    public static int[] subSeriesSearch(double[] s, double[][] t) {
        int k = s.length;
        int n = t.length;

        double closestDistance = -1;
        int[] position = new int[2];

        for (int i = 0; i < n; i++) {
            int m = t[i].length;

            printArray(s);
            printArray(t[i]);

            for (int j = 0; j <= (m - k); j++) {
                double distance = 0;

                for (int l = 0; l < k; l++) {
                    System.out.println(s[l] + " - " + t[i][j + l]);
                    distance += Math.pow((s[l] - t[i][j + l]), 2);
                }

                System.out.println("");

                distance = Math.sqrt(distance);

                if (closestDistance == -1 || distance < closestDistance) {
                    position[0] = i;
                    position[1] = j;
                    closestDistance = distance;
                }
            }
            System.out.println("");

        }

        return position;
    }

    public static void printArray(double[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print((i == array.length - 1) ? "" : ", ");
        }
        System.out.println("}");
    }

}
