import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void countHomogenousTest1(){
        String  s ="abbcccaa";
        int expected = 13;
        int actual = new Solution().countHomogenous(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void countHomogenousTest2(){
        String  s ="zzzzz";
        int expected = 15;
        int actual = new Solution().countHomogenous(s);

        Assert.assertEquals(expected, actual);
    }
}
