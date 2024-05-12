package ru.javapro;

public class Product {

    private Long id;
    private Long userId;
    private String accountNumber;
    private double balance;
    private ProductType type;

    public Product(Long id, Long userId, String accountNumber, double balance, ProductType type) {
        this.id = id;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
    }

    public Long getId() {
        return  id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public ProductType getType() {
        return type;
    }
}
