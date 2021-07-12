package baseprinciples;

import lombok.Data;


public class UserData {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UserData(String username, String emailAddress) {
        this.username = username;
        this.emailAddress = emailAddress;
    }

    private String username;
    private String emailAddress;
}
