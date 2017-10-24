//import java.util.*;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * Type BankAccountType.
     */
    public enum BankAccountType {
        /**
         * Type Checkings.
         */
        CHECKINGS,
        /**
         * Type Savings.
         */
        SAVINGS,
        /**
         * Type Student.
         */
        STUDENT,
        /**
         * Type Workplace.
         */
        WORKPLACE
    }

    /**
     * Type BankAccountType.
     */
    private int accountNumber;
    /**
     * Type BankAccountType.
     */
    private BankAccountType accountType;
    /**
     * Type BankAccountType.
     */
    private double accountBalance;
    /**
     * Type BankAccountType.
     */
    private String ownerName;
    /**
     * Type BankAccountType.
     */
    private double interestRate;
    /**
     * Type BankAccountType.
     */
    private double interestEarned;

    /**
     *
     * @param name Name.
     * @param accountCategory Account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.accountType = accountCategory;
        this.ownerName = name;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     *
     * @return Account Balance.
     */
    public double getBalance() {
        return this.accountBalance;
    }

    /**
     *
     * @param newName Name to change to.
     */
    public void changeName(final String newName) {
        this.ownerName = newName;
    }

    /**
     *
     * @param amount Amount to withdraw.
     * @return Boolean - if transaction was successful.
     */
    public boolean withdraw(final double amount) {
        if (this.accountBalance > amount) {
            this.accountBalance = this.accountBalance - amount;
            return true;
        }
        return false;
    }
}
