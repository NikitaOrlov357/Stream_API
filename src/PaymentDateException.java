public class PaymentDateException extends RuntimeException {
    public PaymentDateException(){
        super("the payment date is earlier than the registration date");
    }
}
