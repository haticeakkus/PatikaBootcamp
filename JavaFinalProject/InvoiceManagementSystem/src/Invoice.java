/*   class, which has invoice properties, contains information about quantity, transaction date and invoice type.   */

import java.time.LocalDate;

class Invoice {
    private double amount;
    private LocalDate processDate;
    private BillType billType;

    public Invoice(double amount, LocalDate processDate, BillType billType) {
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getProcessDate() {
        return processDate;
    }

    public BillType getBillType() {
        return billType;
    }
}