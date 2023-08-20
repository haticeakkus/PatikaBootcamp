/*  Special class of exception to be thrown in case of insufficient balance.    */
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}