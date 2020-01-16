package hw0;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PassingCountTest {
    // testWithoutFailure1
    @Test
    public void FirstTest(){
        int[] a = {1,0};
        int result = Count.numZero(a);
        assertEquals(1,result);
    }
    // testWithoutFailure2
    @Test
    public void SecondTest(){
        int[] a = {1,0,0};
        int result = Count.numZero(a);
        assertEquals(2,result);
    }
    // testWithoutFailure3
    @Test
    public void ThirdTest(){
        int[] a = {3,0,0};
        int result = Count.numZero(a);
        assertEquals(2,result);
    }
}
