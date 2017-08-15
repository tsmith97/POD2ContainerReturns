package sq.training.returns.container;
import java.lang.IllegalArgumentException;

import static javax.print.attribute.standard.MediaSizeName.A;

/**
 * Created by TXS0403 on 8/4/2017.
 */
public class Container
{
    // Constructor
    public Container( String containerShape, boolean containerIsEmpty )
    {
        if ( containerShape == null ) {
            throw new IllegalArgumentException("A container shape must be declared");
        }

        if ( containerShape.isEmpty() ) {
            throw new IllegalArgumentException("A container shape cannot be blank");
        }
        shape = containerShape;
        empty = containerIsEmpty;
    }

    public String getShape()
    {
        return shape;
    }

    public boolean isEmpty()
    {
        return empty;
    }

    private String  shape;        //<! the shape of the container
    private boolean empty;        //<! the container is empty
}

