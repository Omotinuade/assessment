package regnos.chapter17.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamSampleOneTest {
@Test
    void testThatMapReturnsElementOfAListMultiplyingEachElementByTwo(){
    List<Integer> numbers = List.of(1,2,3,4);
    var actual = StreamSampleOne.mapMethod(numbers);
    var expected = List.of(2,4,6,8);
    assertEquals(expected, actual);
}
}