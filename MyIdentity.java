package mysql_access;

import java.util.Properties;

public class MyIdentity {

    public static void setIdentity(Properties prop) {
      prop.setProperty("database", "csci3901");
      prop.setProperty("user", "mcallist");  // Replace with your CSID for bluenose
      prop.setProperty("password", "B00123456"); // Replace with your Banner ID (which is your mysql password)
    }
}