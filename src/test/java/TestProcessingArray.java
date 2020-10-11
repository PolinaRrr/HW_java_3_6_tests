import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class TestProcessingArray {

    @Parameterized.Parameters
    public static List<Object[]> data(){

        return Arrays.asList(new Object[][] {
                {new int[]{7, 8, 9, 6, 4, 2, 1, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 6, 7, 8, 9}},
                {new int[]{7, 8, 4, 6, 2, 2, 1, 3, 5, 5, 6, 7, 8, 9}, new int[]{6, 2, 2, 1, 3, 5, 5, 6, 7, 8, 9}}
        } );
    }

    private int[] arr;
    private int[] arrCopy;
    private int[] expArr;
    private Main main;

    public TestProcessingArray(int[] arr, int[] arrCopy, int[] expArr) {
        this.arr = arr;
        this.arrCopy = arrCopy;
        this.expArr = expArr;
    }

    @Before
    public void start(){
        main = new Main();
    }


    @Test
    public void testProcessingArray() {
        Assert.assertArrayEquals(arrCopy,Main.sliceArrayAfter4(arr));
    }
    @Test
    public void testProcessingArray1() {
        Assert.assertArrayEquals(arrCopy,Main.sliceArrayAfter4(arr));
    }

    @Test(expected = RuntimeException.class)
    public void processingArrayAfter4(){
        Main.sliceArrayAfter4(new int[]{5,7,8,9,33,0});
    }

}
