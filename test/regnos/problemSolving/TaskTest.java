package regnos.problemSolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void task() {
        assertEquals(9, Task.task(new String[]{"Ab135?96", "Q2RB s", "G381ac"}));
    }
}