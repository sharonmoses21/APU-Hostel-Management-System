package Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogTime {
    private String userName, dateTime;

    public LogTime(String userName){
        this.userName = userName;

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date currentTime = new Date();
        this.dateTime = df.format(currentTime);
    }

    public String logIn(){
        return userName + " logged in at " + dateTime;
    }

    public String logOut(){
        return userName + " logged out at " + dateTime;
    }

    public String currentUser(){
        return userName;
    }
}