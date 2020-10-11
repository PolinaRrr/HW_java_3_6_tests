import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import org.junit.Assert;
import org.junit.Test;


public class TestProcessingArray {


    @Test
    public void testSliceArrayAfterLast4() {
        Assert.assertArrayEquals(new int[]{5, 6, 9, 8, 7},Main.sliceArrayAfterLast4(new int[]{1, 2, 3, 3, 5, 4, 7, 8, 9, 1, 2, 3, 4, 5, 6, 9, 8, 7}));
    }
    @Test
    public void testSliceArrayAfterLast4_1() {
        Assert.assertArrayEquals(new int[]{7, 8, 9},Main.sliceArrayAfterLast4(new int[]{1, 2, 3, 3, 5, 4, 7, 8, 9}));
    }

    @Test(expected = RuntimeException.class)
    public void testSliceArrayAfterLast4Exception(){
        Main.sliceArrayAfterLast4(new int[]{5,7,8,9,3,0});
    }

    @Test
    public void testCheckArrayForContents1And4() {
        Assert.assertEquals(Main.checkArrayForContents1And4(new int[]{1,4,1,4,1,4,1,4,4}),true);
    }

    @Test
    public void testCheckArrayForContents1And4_1() {
        Assert.assertEquals(Main.checkArrayForContents1And4(new int[]{1,4,1,6,1,4,1,8,4}),false);
    }
}
