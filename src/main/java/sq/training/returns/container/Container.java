package sq.training.returns.container;
import java.lang.IllegalArgumentException;
/**
 * Created by TXS0403 on 8/4/2017.
 */
public class Container {
    public Container(String s, boolean empty) { //Constructor
        if (s == null) {
            throw new IllegalArgumentException("The Container Must Have a Shape");
        }
        shape = s;
        isEmpty = empty;
    }
    public String getShape() {
        return shape;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    private boolean isEmpty;

    private String shape;
}
