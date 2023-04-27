package regnos.chapter11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LcmTest {
@Test
    public void lcmTest(){
    int y= -26;
    var array=Lcm.lcm(y);
    int[] check = {2, 13};
    assertEquals(Arrays.toString(check), Arrays.toString(array));
}
}