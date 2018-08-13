package throwaway;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import throwaways.GainFinder;

@RunWith(Parameterized.class)
public class GainFinderTest {
    @Parameters
    public static Collection<Object[]> provideData() {
        return Arrays.asList(new Object[][] { // @formatter:off
                { new int[] { 1 } },
                { new int[] { 1, 2 } },
                { new int[] { 2, 1 } },
                { new int[] { 1, 2, 1 } },
                { new int[] { 2, 1, 2 } },
                { new int[] { 3, 5, 1, 4 } },
                { new int[] { 3, 2, 1, 4 } },
                { new int[] { 4, 3, 2, 1 } },
                { new int[] { 1, 5, 2, 6 } } }); //@formatter:on
    }

    private int[] data;

    public GainFinderTest(int data[]) {
        this.data = data;
    }

    @Test
    public void testFindMax() {
        System.out.println(Arrays.toString(data));
        GainFinder.findMax(data);
    }
}
