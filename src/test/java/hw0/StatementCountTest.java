package hw0;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class StatementCountTest {
    // tests that execute all statements in numZero
    @Test
    public void FirstTest(){
        int[] a = {0,0,0,0};
        int result = Count.numZero(a);
        assertEquals(4,result);
    }
}
