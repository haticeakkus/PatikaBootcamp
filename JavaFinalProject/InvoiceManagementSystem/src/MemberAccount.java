/*  Representing customer account information, this class includes first name, last name, ID, code and balance information.
The account code is created by combining the customer ID and the first 2 letters of the name.   */

class MemberAccount {
    private String id;
    private String firstName;
    private String lastName;
    private String code;
    private double balance;

    public MemberAccount(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = id + firstName.substring(0, 2).toUpperCase();
        this.balance = 0.0;
    }

    public String getCode() {
        return code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}