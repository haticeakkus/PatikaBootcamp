/*  A service class that handles bill payment, inquiry, and payment cancellation. Performs transactions using invoice and account information. */

class InvoiceService {
    public void payInvoice(MemberAccount account, Invoice invoice) throws InsufficientBalanceException {
        if (account.getBalance() < invoice.getAmount()) {
            throw new InsufficientBalanceException("Insufficient balance in the account.");
        }
        account.setBalance(account.getBalance() - invoice.getAmount());
        System.out.println("Payment successful.");
    }

    public void queryInvoice(MemberAccount account, Invoice invoice) {
        System.out.println("Invoice details: Amount - " + invoice.getAmount() +
                ", Process Date - " + invoice.getProcessDate() +
                ", Bill Type - " + invoice.getBillType());
    }

    public void cancelPayment(MemberAccount account, Invoice invoice) {
        account.setBalance(account.getBalance() + invoice.getAmount());
        System.out.println("Payment canceled.");
    }
}