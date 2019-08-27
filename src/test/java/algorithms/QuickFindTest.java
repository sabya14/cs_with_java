package algorithms;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class QuickFindTest {

    @Test
    public void shouldReturnQuickFindInstance() {
        QuickFind quickFind = new QuickFind(10);
        assertNotNull(quickFind);
    }

    @Test
    public void findOnInitialStateShouldReturnNotConnected(){
        QuickFind quickFind = new QuickFind(10);
        assertEquals(quickFind.find(0,5), "Not Connected");
    }

    @Test
    public void afterUnion1and5findOf1and5ShouldReturnConnected() {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(1,5);
        assertEquals(quickFind.find(1,5), "Connected");
    }

    @Test
    public void unionShouldModifyStateCorrectly() {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(4,3);
        Assert.assertArrayEquals(new int[]{0,1,2,3,3,5,6,7,8,9},quickFind.getId());
        quickFind.union(3,8);
        Assert.assertArrayEquals(new int[]{0,1,2,8,8,5,6,7,8,9}, quickFind.getId());
        quickFind.union(6,5);
        quickFind.union(9,4);
        Assert.assertArrayEquals(new int[]{0,1,2,8,8,5,5,7,8,8}, quickFind.getId());
        assertEquals(quickFind.find(9,3), "Connected");
    }
}
