package models;

public class Account {
    private Integer id;
    private Double balance;
    private String cardNumber;
    private String pinCode;
    private Integer accountId;
    public Account() {}

    public Account(Integer id, String accountNumber, Double balance) {
        this.id = id;
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.accountId = accountId;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

    public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }

    public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Getters
    public Integer getId() {
        return id;
    }
    public String getCardNumber() {
    return cardNumber;
  }

    public String getPinCode() {
    return pinCode;
  }

    public Integer getAccountId() {
    return accountId;
  }

    public Double getBalance() {
        return balance;
    }
}
