package com.xworkz.flipkart.constants;

public enum DBConstants {
        DB("jdbc:mysql://localhost:3306/flipkartdatabase","root","Root@1102");
        private String url;
        private String userName;
        private String password;

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

        public String getUrl() {
            return url;
        }

        private DBConstants(String url, String userName, String password) {
            this.url = url;
            this.userName = userName;
            this.password = password;
        }
}
