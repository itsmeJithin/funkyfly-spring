package main.com.ovaqlab.funkyfly.domain;

public class ChatMessage {
    private String userName;

    private String message;

    private String getUserName() {
        return userName;
    }

    private String getMessage() {
        return message;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ChatMessage [user=" + userName +", message=" + message +"]";
    }
}
