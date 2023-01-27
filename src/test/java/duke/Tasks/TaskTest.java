package duke.Tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaskTest {
    @Test
    public void testGetDescription() {
        assertEquals("study",
                new Task("study").getDescription());
    }

    @Test
    public void testGetStatusIcon() {
        assertEquals(" ", new Task("book").getStatusIcon());
        Task t = new Task("book1");
        t.isDone = true;
        assertEquals("X", t.getStatusIcon());
    }
}