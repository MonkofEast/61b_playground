import org.junit.Test;
import static org.junit.Assert.*;

public class TestWordUtils {
    @Test
    public void testLongest() {
        AList<String> list = new AList();
        list.addLast("a");
        list.addLast("aa");
        list.addLast("aaa");
        list.addLast("aaaa");
        list.addLast("aaaaa");
        list.addLast("aaaaaa");
        list.addLast("aaaaaaa");
        assertEquals(WordUtils.longest(list), "aaaaaaa");
    }
}
