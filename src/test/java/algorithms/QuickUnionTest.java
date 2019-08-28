package algorithms;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class QuickUnionTest {

    @Test
    public void shouldReturnQuickUnionInstance() {
        QuickUnion QuickUnion = new QuickUnion(10);
        assertNotNull(QuickUnion);
    }

    @Test
    public void findOnInitialStateShouldReturnNotConnected(){
        QuickUnion QuickUnion = new QuickUnion(10);
        assertEquals(QuickUnion.find(0,5), "Not Connected");
    }

    @Test
    public void afterUnion1and5findOf1and5ShouldReturnConnected() {
        QuickUnion QuickUnion = new QuickUnion(10);
        QuickUnion.union(1,5);
        assertEquals("Connected", QuickUnion.find(1,5));
    }

    @Test
    public void rootReturnsCorrectValue() {

        class QuickUnionMock extends QuickUnion {
            public QuickUnionMock(int n, int[] ids) {
                super(n);
                this.ids = ids;
            }
        }
        QuickUnionMock quickUnionMock = new QuickUnionMock(10, new int[]{0,1,2,8,3,5,5,7,8,8});
        assertEquals(8,quickUnionMock.root(4));
    }


    @Test
    public void unionShouldModifyStateCorrectly() {
        QuickUnion QuickUnion = new QuickUnion(10);
        QuickUnion.union(4,3);
        Assert.assertArrayEquals(new int[]{0,1,2,3,3,5,6,7,8,9},QuickUnion.getIds());
        QuickUnion.union(3,8);
        Assert.assertArrayEquals(new int[]{0,1,2,8,3,5,6,7,8,9}, QuickUnion.getIds());
        QuickUnion.union(6,5);
        QuickUnion.union(9,4);
        Assert.assertArrayEquals(new int[]{0,1,2,8,3,5,5,7,8,8}, QuickUnion.getIds());
        assertEquals(QuickUnion.find(9,3), "Connected");
    }
}
