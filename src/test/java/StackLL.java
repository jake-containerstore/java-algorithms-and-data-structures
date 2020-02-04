import com.jacobperez.data_structures.StackLL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

class StackLLTests {

    @Test
    @DisplayName("Stack<String> Initialization")
    void initStringStack() {
        StackLL<String> stringStack = new StackLL<>();
        stringStack.add("world");
        assertEquals(1, stringStack.size(), "test stack count");
        assertEquals("world", stringStack.pop(), "test stack pop");
        assertEquals(0, stringStack.size());
    }

    @Test
    @DisplayName("Stack<Double> Initialization")
    void initDoubleStack() {
        StackLL<Double> doubleStackLL = new StackLL<>();
        doubleStackLL.add(2.25);
        doubleStackLL.add(3.75);
        assertEquals(2, doubleStackLL.size(), "test stack count");
        assertEquals(3.75, (double) doubleStackLL.pop(), "test stack pop");
        assertEquals(1, doubleStackLL.size());
    }

    @Test
    @DisplayName("Test pop on empty stack")
    void exceptionTesting() {
        StackLL<Integer> stack = new StackLL<>();
        Exception exception = assertThrows(NoSuchElementException.class, () -> stack.pop());
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test Iterator")
    void iterateIntegerStack() {
        final int[] values = { 5, 2, 3, 1 };
        final int[] insertValues = { 1, 3, 2, 5 };
        int j = 0;
        StackLL<Integer> stack = new StackLL<>();
        for (int item : insertValues) {
            stack.add(item);
        }
        for (int value : stack) {
            assertEquals(values[j++], value);
        }
    }

    @Test
    @DisplayName("Test Iterator exception")
    void iterateIntegerStackException() {
        StackLL<Integer> stack = new StackLL<>();
        Iterator<Integer> it = stack.iterator();
        Exception exception = assertThrows(NoSuchElementException.class, () -> it.next());
        assertEquals("No more items in StackLL", exception.getMessage());
    }
}
