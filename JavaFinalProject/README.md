# Invoice Management System

This GitHub repository contains a core Java applet that handles bill payment, inquiry, and payment cancellation. The project has a structure that includes customer accounts, invoice management and basic operations.


## Project Content:
 - MemberAccount class: Holds customer account informatio and generates account code.
 - Invoice class: Contains invoice properties (quantity, transaction date, invoice type).
 - BillType enum: Represents invoice types (phone, internet water).
 - InvoiceService class: Manages invoice transactions (payment, inquiry, cancellation of payment).
 - InsufficientBalanceException class: Defines an out of balance exception.
 - Client class: Manages user operations, performs operations using InvoiceService's methods.
