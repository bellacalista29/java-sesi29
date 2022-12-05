import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadWorldTest {

    @Test
    public void testRun() {
        for(int i = 0; i < 5; i++)
        {
            ThreadWorld instance = new ThreadWorld();
            instance.setName("" + i);
            instance.start();
        }
        assertTrue(true);
    }
    
}
