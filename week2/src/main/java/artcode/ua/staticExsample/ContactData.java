package artcode.ua.staticExsample;

/**
 * Created by User on 5/2/2017.
 */
public class ContactData {
    private String email;
    private String phone;

    public ContactData(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
