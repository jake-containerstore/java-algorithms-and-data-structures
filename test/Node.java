import com.jakeperez.datastructures.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

class NodeTests {

    @Test
    @DisplayName("Node instantiated with 5")
    void addsTwoNumbers() {
        Node<Integer> node = new Node<>(5);
        assertEquals(5, node.getItem(), "Should equal 5");
    }

//    @ParameterizedTest(name = "{0} + {1} = {2}")
//    @CsvSource({
//            "0,    1,   1",
//            "1,    2,   3",
//            "49,  51, 100",
//            "1,  100, 101"
//    })
//    void add(int first, int second, int expectedResult) {
//        Calculator calculator = new Calculator();
//        assertEquals(expectedResult, calculator.add(first, second),
//                () -> first + " + " + second + " should equal " + expectedResult);
//    }
}