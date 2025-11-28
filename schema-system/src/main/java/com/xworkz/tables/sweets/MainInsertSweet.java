package com.xworkz.tables.sweets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainInsertSweet {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try {
          Connection connection = DriverManager.getConnection(url, userName, password);
          String sql ="insert into sweet values (1,'Jalebi',55.0,5,'Rajasthan','Anand sweets','Medium'),(2,'Laddu',40.0,10,'Karnataka','Anand sweets','Low')," +
                  "(3,'Kaju Katli',75.0,7,'Delhi','Royal sweets','Medium'),(4,'Mysore Pak',105.0,3,'Mysore','Royal sweets','High'),(5,'Rasgulla',125,7,'West Bengal','Bengal  sweets','Medium')," +
                  "(6,'Gulab Jamun',60.0,5,'UP','Gagan sweets','High'),(7,'Barfi',40.0,9,'Punjab','Anand sweets','Medium'),(8,'Peda',150.0,5,'Mathura','Royal sweets','Medium')," +
                  "(9,'Malpua',90.0,10,'Rajasthan','Anand sweets','High'),(10,'Soan Papdi',30.0,15,'Gujrat','Raj sweets','Medium'),(11,'Rabri',125.0,5,'UP','Gagan sweets','Medium')," +
                  "(12,'Modak',70.0,21,'Maharashtra','Mumbai sweets','Low'),(13,'Chikki',50.0,20,'Maharashtra','Mumbai sweets','Low'),(14,'Sandesh',75.0,3,'Bengal','Bengal sweets','Low')," +
                  "(15,'Kalakand',90.0,15,'Rajasthan','Raj sweets','Low'),(16,'Kesari Bath',35.0,5,'Karnataka','Udupi sweets','Medium'),(17,'Obbattu',150.0,25,'Karnataka','Mysore sweets','Medium')," +
                  "(18,'Kheer',60.0,10,'Bengal','Bengal sweets','Low'),(19,'Ghevar',200.0,15,'Rajasthan','Raj sweets','High'),(20,'Phirni',150.0,3,'Kashmir','kashmir sweets','Low')," +
                  "(21,'Sweet Pongal',70.0,3,'Tamil Nadu','Chennai Sweets','Medium'),(22,'Dharwad Peda',250.0,30,'Dharwad','Dharwad sweets','Low'),(23,'Karadantu',50.0,20,'Karnataka','Anand sweets','Low')," +
                  "(24,'Badam Halwa',125.0,20,'Tamil Nadu','Tanjore sweets','Medium'),(25,'Coconut Barfi',90.0,25,'Kerala','Cochin sweets','Low'),(26,'Boondi Laddu',80.0,50,'Anantapur','Annapurna sweets','Medium')," +
                  "(27,'Dry Fruit Laddu',120.0,30,'Delhi','Royal sweets','Low'),(28,'Milk Cake',250.0,2,'Rajasthan','Raj sweets','Low'),(29,'Arisa',70.0,6,'Odisha','Odisha sweets','Low')," +
                  "(30,'Besan Laddu',50.0,10,'Punjab','Anand sweets','Low'),(31,'Milk Peda',100.0,25,'Mathura','Mathura sweets','Low'),(32,'Dry Kova',150.0,3,'Karnataka','Hubli sweets','Medium')," +
                  "(33,'Pista Roll',250.0,3,'Delhi','Pista House','Medium'),(34,'Anjeer Burfi',100.0,5,'Maharashtra','Mumbai sweets','Low'),(35,'Apple Halwa',125.0,25,'Kashmir','Kashmir sweets','Medium')," +
                  "(36,'Ellu Unde',50.0,7,'Karnataka','Udupi sweets','Low'),(37,'Banana Halwa',40.0,5,'Kerala','Cochin sweets','Low'),(38,'Dry Kunda',125.0,5,'Belagavi','Belgaum sweets','Low')," +
                  "(39,'Rava Laddu',30.0,50,'Karnataka','Udupi sweets','Low'),(40,'Dry Gulkand',90.0,6,'Maharashtra','Mumbai sweets','High'),(41,'Milk Kova',150.0,6,'Tamil Nadu','Anand sweets','Medium')," +
                  "(42,'Sweet Semiya',50.0,6,'Tamil Nadu','Raj sweets','Low'),(43,'Apricot Delight',250.0,2,'Kashmir','Kashmir sweets','Low'),(44,'Rasmalai',90.0,7,'West Bengal','Bengal Sweets','Medium')," +
                  "(45,'Dry Jamun',50.0,6,'UP','Raj sweets','Low'),(46,'Badusha',50.0,7,'Karnataka','Anand sweets','Low'),(47,'Sweet Bread Halwa',70.0,5,'Delhi','Royal sweets','Medium')," +
                  "(48,'Chiroti',50.0,15,'Karnatak','Udupi sweets','Low'),(49,'Motichoor Laddu',90.0,25,'Rajasthan','Raj sweets','Low'),(50,'Madatha Kaja',60.0,25,'Andhra Pradesh','Kakinada sweets','Medium')," +
                  "(51,'Kakinada Kaja',60.0,8,'Kakinada','Kakinada sweets','Medium'),(52,'Bandar Laddu',40.0,7,'Machilipatnam','Bandar Mithai Shop','High'),(53,'Ariselu',80.0,10,'Telangana','Pulla Reddy sweets','Medium')," +
                  "(54,'Sakinalu',50.0,25,'Telangana','Anand sweets','Low'),(55,'Pootharekulu',100.0,35,'Athreyapuram','Pulla Reddy sweets','Low'),(56,'Bellam Pootharekulu',80.0,60,'Athreyapuram','Pulla Reddy sweets','Low')," +
                  "(57,'Kobbari Mithai',30.0,20,'Andhra Pradesh','Kakinada sweets','Medium'),(58,'Nuvvula Ariselu',50.0,10,'Andhra Pradesh','Kakinada sweets','Medium'),(59,'Sunnundalu',40.0,15,'Rayalaseema','Rayalaseema sweets','Low')," +
                  "(60,'Moong Dal Halwa',50.0,10,'Rajasthan','Raj sweets','Low'),(61,'Mango Shrikhand',100.0,10,'Maharashtra','Royal sweets','Medium'),(62,'Plain Shrikhand',75.0,5,'Maharashtra','Royal sweets','Medium')," +
                  "(63,'Rajbhog Shrikhand',150.0,2,'Bengal','Bengal sweetas','High'),(64,'Jhangri',60.0,5,'Bihar','Raj sweets','Medium'),(65,'Gajar Halwa',50.0,10,'Maharashtra','Royal sweets','Low')," +
                  "(66,'Chhena Barfi',40.0,20,'West Bengal','Bengal sweets','Low'),(67,'Balushahi',60.0,6,'UP','Royal sweets','Medium'),(68,'Shahi Tukda',125.0,5,'UP','Royal sweets','High')," +
                  "(69,'Patisa',50.0,7,'Kanpur','Anand sweets','Medium'),(70,'Doodh Peda',60.0,75,'Delhi','Royal sweets','Low'),(71,'Anarsa',80.0,5,'Bihar','Raj sweets','Low')," +
                  "(72,'Malai Ghevar',150.0,75,'UP','Anand sweets','High'),(73,'Double Ka Meetha',90.0,5,'Hyderabad','Royal sweets','High'),(74,'Malai Khaja',125.0,10,'Maharashtra','Mumbai sweets','Medium')," +
                  "(75,'Kunafa',200.0,10,'Delhi','Royal sweets','High');";

            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Rows Affected : "+rowsAffected);
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
