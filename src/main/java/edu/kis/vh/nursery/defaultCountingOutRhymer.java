package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int LAST_INDEX = CAPACITY - 1;

    private final int[] NUMBERS = new int[CAPACITY];

    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    public void setTotal(int newValue) {
        total = newValue;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return getTotal() == EMPTY;
    }

    public boolean isFull() {
        return getTotal() == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }

}
