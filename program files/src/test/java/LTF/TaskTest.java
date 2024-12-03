package LTF;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TaskTest {

    Task testtask = new Task("testclass", 60, null);

    @Test
    public void testCreate(){
        assertEquals("testclass", testtask.getName(), "Object access test complete");
    }

    @Test
    public void testDurationFormat(){
        assertEquals("1 hour(s)", testtask.getDurationString());
    }
}
