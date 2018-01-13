/*****************************************************************************

File        : TestData.java

Date        : 20 November 2017

Description : A class for a testData object which stores the results

Author      : Ali Jarjis

******************************************************************************/

package subseriessearch;

/**
 *
 * @author Ali Jarjis
 */
public class TestData {
    private int dataSize;
    private double timeTaken;
    
    public TestData (int dataSize, double timeTaken) {
        this.dataSize = dataSize;
        this.timeTaken =  timeTaken;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public double getTimeTaken() {
        return this.timeTaken;
    }
}
