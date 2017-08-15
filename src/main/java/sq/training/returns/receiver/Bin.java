package sq.training.returns.receiver;

import sq.training.returns.container.Container;

/**
 * Created by TXS0403 on 8/4/2017.
 */
public class Bin {
    public Bin(String shape, int maximumItems){
        if (shape == null ) {
            throw new IllegalArgumentException("A container shape must be declared");
        }
        if (shape.isEmpty() ) {
            throw new IllegalArgumentException("A container shape cannot be blank");
        }
        if (maximumItems <= 0 ) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        acceptsShape = shape;
        capacity = maximumItems;
        itemCount = 0; //Create the bin - holding no items.
    }

    public String getShape(){
        return acceptsShape;
    }

    public boolean acceptContainer(Container item){
        //reject if not empty
        if(item.isEmpty() == false){
            rejectCount++;
        }
        else
        if(itemCount < capacity){
            itemCount++;
            return true;
        }
        else
            overcapacityCount++;
        //reject if capacity exceeded

        //otherwise accept item
        return false;
    }

    public int getCapacity(){
        return capacity;
    }
    private String acceptsShape; // The acceptable item shape for this bin
    private int capacity; // Maximum number of items that can be held
    private int itemCount; //Number of items currently in the bin
    private int rejectCount; // # items rejected (not empty)
    private int overcapacityCount; // # of items rejected due to bin capacity reached
    private  Bin bin;
 }
