package sq.training.returns.receiver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sq.training.returns.container.Container;

/**
 * Created by TXS0403 on 8/4/2017.
 */
public class BinTest {
    //Set the max capacity of the bin used in the test fixture
    public static int binTestCapacity = 6; //this gives us the ability to change the capacity in 1 spot.
    @Before //This is executed before every single test and it creates a round bin
    public void createBinFixture(){
        //bin = new Bin("round", 6);
        bin = new Bin("round", binTestCapacity);
    }

    @Test
    public void basicConstructorTest() {
        //Double check the basic bin constructed for this fixture
        Assert.assertEquals("round", bin.getShape()); //if what it created above is correct
        //Assert.assertEquals(6, bin.getCapacity());
        Assert.assertEquals(binTestCapacity, bin.getCapacity());
    }

    @Test
    public void acceptEmptyItem(){
        Container emptyItem = new Container("round", true); //container is round and empty
        Assert.assertTrue(bin.acceptContainer(emptyItem));
    }

    @Test
    public void rejectFullItem(){
        Container nonEmptyItem = new Container("round", false); //container is round and full aka not empty
        Assert.assertFalse(bin.acceptContainer(nonEmptyItem));
    }
    @Test
    public void rejectDueToOverCapacity(){
        Container emptyItem = new Container("round", true); //container is round and container is at capacity
        //Push the bin to capacity
            //for(int i = 6; i > 0; --i)
            for(int i = binTestCapacity; i > 0; --i)
            Assert.assertTrue(bin.acceptContainer(emptyItem));
            Assert.assertFalse(bin.acceptContainer(emptyItem));
    }
    private Bin bin; //each time the @Before is ran we get a new instance of bin

}
