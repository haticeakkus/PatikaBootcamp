import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MemberAccount account = new MemberAccount("123", "John", "Doe");
        Invoice invoice = new Invoice(150.0, LocalDate.now(), BillType.TELEPHONE);

        Client client = new Client();
        client.queryInvoice(account, invoice);

        try {
            client.payInvoice(account, invoice, 100.0, LocalDate.now());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        client.queryInvoice(account, invoice);

        client.cancelPayment(account, invoice);
        client.queryInvoice(account, invoice);
    }
}