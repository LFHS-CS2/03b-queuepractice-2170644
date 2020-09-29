import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 * The test class TestMain.
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.test_reorder();
    }

    @Test
    public void test_reorder() {
        Queue<Integer> q = new LinkedList<Integer>();
        int[] nums = {1, 2, -2, 4, -5, 8, -8, 12, -15, 23};
        int[] answer = {-15, -8, -5, -2, 1, 2, 4, 8, 12, 23};
        for (int i = 0; i < nums.length; i++)
            q.add(nums[i]);

        Main.reorder(q);
        for (int i = 0; i < answer.length; i++) {
            assertEquals(answer[i], (int)q.remove());
        }
        assertTrue(q.isEmpty());
    }

  
}
