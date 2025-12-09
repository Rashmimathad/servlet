package com.xworkz.weaponapp.constant;

public enum DBConstants {
    DB("jdbc:mysql://localhost:3306/weapondatabase","root","Root@1102");

    private String url;
    private String userName;
    private String password;

    DBConstants(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
