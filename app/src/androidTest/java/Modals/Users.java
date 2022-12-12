package Modals;

public class Users {
    String profilePic,userName,mail,password,userId,lastMsg;

    public Users(String profilePic, String userName, String mail, String password, String userId, String lastMsg) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMsg = lastMsg;
    }

    public Users() {}
    // empty constructor for firebase use

    // signup constructor
    public Users(String userName,String mail,String password)
    {
        this.userName=userName;
        this.mail=mail;
        this.password=password;
    }
}
