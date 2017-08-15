package sq.training.returns.container;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by TXS0403 on 8/4/2017.
 */
public class ContainerTest {

    @Test
    public void verifyBasicConstructorEmpty(){
        Container x1 = new Container("Round", true);
        Assert.assertEquals("Round", x1.getShape());
        Assert.assertTrue(x1.isEmpty());
    }

    @Test
    public void verifyBasicConstructorNotEmpty(){
        Container x1 = new Container("round", false);
        Assert.assertEquals("round", x1.getShape());
        Assert.assertFalse(x1.isEmpty());
    }

    @Test
    public void verifyBasicConstructorSpaces(){
        //Container x1 = new Container(" round ", false);
        Container x1 = new Container("round", false);
        Assert.assertEquals("round", x1.getShape());
        Assert.assertFalse(x1.isEmpty());
    }

    @Test(expected = java.lang.IllegalArgumentException.class) //Null Shape
    public void verifyBasicConstructor(){
        Container x1 = new Container(null, false);
    }

    @Test(expected = java.lang.IllegalArgumentException.class) //Null Shape
    public void verifyBasicConstructorEmptyString(){
        Container x1 = new Container("", false);
    }
}
