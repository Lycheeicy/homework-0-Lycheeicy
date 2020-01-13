package hw0;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
public class FailingCountTest {
    // testWithFailure1
    @Test
    public void FirstTest(){
        int[] a = {0,1,0};
        int result = Count.numZero(a);
        assertEquals(2,result);
    }
    // testWithFailure2
    @Test
    public void SecondTest(){
        int[] a = {0,1,0,0};
        int result = Count.numZero(a);
        assertEquals(3,result);
    }
    // testWithFailure3
    @Test
    public void ThirdTest(){
        int[] a = {0,0,0};
        int result = Count.numZero(a);
        assertEquals(3,result);
    }
}
