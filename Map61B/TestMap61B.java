// exe 5.3
package Map61B;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMap61B {
    @Test
    public void testTest() {
        Map61B<String, Integer> bench = new ArrayMap<String, Integer>();
        bench.put("apple", 3);
        assertEquals(bench.size(), 1);
        assertEquals((int) bench.get("apple"), 3);
        assertTrue(bench.containsKey("apple"));
        assertFalse(bench.containsKey("bed"));


        System.out.println(MapHelper.get(bench, "apple"));
    }
    //@Test
    public void test() {
        Map61B<Integer, Integer> aMap = new ArrayMap<Integer, Integer>();
        aMap.put(2, 5);
        int expected = 5;
        //  assertEquals(expected, am.get(2)); compile err
        assertEquals(expected, (long) aMap.get(2)); // work
        assertEquals(expected, (int) aMap.get(2)); // work
        assertEquals((Integer) expected, aMap.get(2)); // work

    }
}
