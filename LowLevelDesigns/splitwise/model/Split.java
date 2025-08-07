package LowLevelDesigns.splitwise.model;

public class Split {
    private User user;
    private Double amount;

    public Split(User user, Double amount) {
        this.amount = amount;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Double getAmount() {
        return amount;
    }
}
