package LowLevelDesigns.splitwise.model;

public class User {
    private Integer id;
    private String name;
    private String emailId;
    private Integer mobileNumber;

    public User(Integer id, String name, String emailId, Integer mobileNumber) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
