import com.jakeperez.datastructures.QueueLL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;


class QueueLLTests {

    @Test
    @DisplayName("Initialize QueueLL<String>")
    void initStringQueue() {
        QueueLL<String> queue = new QueueLL<>();
        queue.enqueue("hello");
        queue.enqueue("world");
        assertEquals(2, queue.size());
        assertEquals("hello", queue.dequeue());
    }

    @Test
    @DisplayName("Catch Empty Queue exception")
    void emptyQueueException() {
        QueueLL<Integer> queue = new QueueLL<>();
        Exception exception = assertThrows(NoSuchElementException.class, () -> queue.dequeue());
        assertEquals("Empty Queue", exception.getMessage());
    }

    @Test
    @DisplayName("Iterator and Exception")
    void iteratorQueueException() {
        final int[] items = {1, 2, 3, 4};
        int i = 0;
        QueueLL<Integer> queue = new QueueLL<>();
        for (int item: items) {
            queue.enqueue(item);
        }
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            assertEquals(items[i++], iterator.next());
        }
        Exception exception = assertThrows(NoSuchElementException.class, () -> iterator.next());
        assertEquals("No more elements in Queue", exception.getMessage());
    }


}
