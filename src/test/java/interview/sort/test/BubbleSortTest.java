package interview.sort.test;

import interview.sort.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by pksure on 16/9/1.
 */
public class BubbleSortTest {

    @Test
    public void testSort(){
        int[] unSortArr1 = {1, 4, 3, 2, 8};
        System.out.println("排序前: " + Arrays.toString(unSortArr1));
        BubbleSort.sort(unSortArr1);
        System.out.println("排序后: " + Arrays.toString(unSortArr1));
        // 对应Arrays.sort()排序
    }

}
