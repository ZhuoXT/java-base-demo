package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    @Test
    public void should_return_number_five() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 5;

        assertEquals(expected, baseDemo.sum(2,3));
    }
    @Test
    public void should_return_number_six() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 6;

        assertEquals(expected, baseDemo.sum(3,3));
    }
}
