package com.example.batman.trackmymoney;

public class SaveData {
    String expense,merchant,amount,date;

    public SaveData(String expense, String merchant, String amount, String date) {
        this.expense = expense;
        this.merchant = merchant;
        this.amount = amount;
        this.date = date;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
