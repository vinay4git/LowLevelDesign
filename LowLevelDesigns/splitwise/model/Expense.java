package LowLevelDesigns.splitwise.model;

public class Expense {
    private Double amount;
    private User paidBy;
    private SplitType splitType;

    public Expense(Double amount, User paidBy, SplitType splitType) {
        this.amount = amount;
        this.paidBy = paidBy;
        this.splitType = splitType;
    }

    public Double getAmount() {
        return amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }
}
