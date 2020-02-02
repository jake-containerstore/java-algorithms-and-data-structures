import com.jakeperez.datastructures.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NodeTests {

    @Test
    @DisplayName("Node<Integer> instantiated with 5")
    void initIntegerNode() {
        Node<Integer> node = new Node<>(5);
        assertEquals(5, node.getItem(), "Should equal 5");
        assertEquals("5 null", node.toString());
        node.setItem(4);
        assertEquals(4, node.getItem(), "Should equal 4");
        assertEquals(null, node.getNext());
    }

    @Test
    @DisplayName("Node<String> instantiated with hello")
    void initStringNode() {
        Node<String> node = new Node<>("hello");
        assertEquals("hello", node.getItem(), "Should equal hello");
        node.setItem("world");
        assertEquals("world", node.getItem(), "Should equal world");
        assertEquals(null, node.getNext());
        node.setNext(new Node<String>("domination"));
        assertEquals("domination", node.getNext().getItem());
    }

    @Test
    @DisplayName("Node<Double> instantiated with 3.14")
    void initDoubleNode() {
        Node<Double> node = new Node<>(3.14);
        assertEquals(3.14, node.getItem(), "Should equal 3.14");
        node.setItem(2.17);
        assertEquals(2.17, node.getItem(), "Should equal 2.17");
        assertEquals(null, node.getNext());
    }

}