/*  The class that manages invoice transactions. Performs invoice processing using InvoiceService's methods.
It also offers three different payment methods according to the invoice type.  */

import java.time.LocalDate;

class Client extends InvoiceService {
    public void payInvoice(MemberAccount account, Invoice invoice, double amount, LocalDate paymentDate) throws InsufficientBalanceException {
        Invoice paymentInvoice = new Invoice(amount, paymentDate, invoice.getBillType());
        super.payInvoice(account, paymentInvoice);
    }

}