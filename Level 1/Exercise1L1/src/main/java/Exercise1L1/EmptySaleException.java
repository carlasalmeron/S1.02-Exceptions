package Exercise1L1;

public class EmptySaleException extends RuntimeException {
    public EmptySaleException() {
        super ("To make a sale first you have to add products");
    }
}
