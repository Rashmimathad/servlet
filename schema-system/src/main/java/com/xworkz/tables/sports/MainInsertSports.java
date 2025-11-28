package com.xworkz.tables.sports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainInsertSports {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            String sql = "insert into sports values(1,'Cricket','Outdoor',11,300,'ICC World Cup','Cricket Stadium','England','All ages','High'),(2,'Football','outdoor',11,90,'FIFA World Cup','Ground','England','All Ages','Very High'),(3,'Hockey','Outdoor',11,60,'Hockey World Cup','Turf','Canada','All Ages','High')" +
                    ",(4,'Basketball','Indoor',5,48,'NBA Finals','Court','USA','All Ages','Very High'),(5,'Volleyball','Indoor',6,60,'FIVB Championship','Court','USA','All Ages','High'),(6,'Tennis','Outdoor',1,40,'Wimbledon','Court','France','Adults','Very High')" +
                    ",(7,'Badminton','Indoor',1,40,'BWF Championship','Court','India','All Ages','High'),(8,'Baseball','Outdoor',9,180,'World Series','Ground','USA','All Ages','High'),(9,'Rugby','Outdoor',15,80,'Rugby World Cup','Ground','England','Adults','High')" +
                    ",(10,'Golf','Outdoor',9,240,'Masters Tournament','Ground','Scotland','Adults','Medium'),(11,'Table Tennis','Indoor',1,30,'ITTF Championship','Court','China','All Ages','High'),(12,'Kabaddi','Outdoor',7,40,'Pro Kabaddi League','Court','India','All Ages','High')" +
                    ",(13,'Kho kho','Outdoor',9,40,'National Kho kho Championship','Ground','India','All Ages','Medium'),(14,'Handball','Indoor',7,60,'IHF Championship','Court','Germany','All Ages','Medium'),(15,'Swimming','Indoor',1,15,'FINA World Cup','Pool','Greece','All Ages','High')" +
                    ",(16,'Boxing','Indoor',1,12,'WBA Championship','Ring','Greece','Adults','High'),(17,'Wrestling','Indoor',1,10,'WWE Main Event','Ring','Greece','Adults','Very High'),(18,'MMA','Indoor',1,25,'UFC Championship','Ring','USA','Adults','Very High')" +
                    ",(19,'Archery','Outdoor',1,15,'World Archery Cup','Ground','Mongolia','All Ages','Medium'),(20,'Shooting','Indoor',1,20,'ISSF Championship','Range','Germany','Adults','Medium'),(21,'Cycling','Outdoor',1,300,'Tour de France','Track','France','Adults','High')" +
                    ",(22,'Formula 1','Outdoor',1,120,'F1 Championship','Track','UK','Adults','Very High'),(23,'Motocross','Outdoor',1,60,'MXGP','Track','USA','Adults','Very High'),(24,'Skating','Outdoor',1,15,'Skating Championship','Rink','Netherlands','All Ages','Medium')" +
                    ",(25,'Ice Hockey','Indoor',6,60,'NHL Finals','Rink','Canada','All Ages','High'),(26,'Snowboarding','Outdoor',1,30,'Winter X Games','Slope','USA','Adults','Medium'),(27,'Skiing','Outdoor',1,25,'Winter Olympics','Slope','Switzerland','All Ages','Medium')" +
                    ",(28,'Surfing','Outdoor',1,30,'World Surf League','Beach','Hawaii','All Ages','Medium'),(29,'Rowing','Outdoor',9,20,'World Rowing Cup','Water','England','Adults','Medium'),(30,'Kayaking','Outdoor',1,15,'Canoe Sprint Championship','Water','Canada','All Ages','Medium')" +
                    ",(31,'Canoeing','Outdoor',1,30,'Canoe World Cup','Water','Germany','All Ages','Medium'),(32,'Sailing','Outdoor',1,120,'Americas Cup','Water','UK','Adults','Low'),(33,'Chess','Indoor',1,300,'World Chess Championship','Table','India','All Ages','High')" +
                    ",(34,'Carrom','Indoor',1,25,'Carrom World Cup','Carrom Board','India','All Ages','Medium'),(35,'Snooker','Indoor',1,120,'World Snooker Championship','Table','India','All Ages','Medium'),(36,'Pool','Indoor',1,60,'World Pool Masters','Table','India','All Ages','Medium')" +
                    ",(37,'Darts','Indoor',1,30,'PDC Championhip','Hall','UK','Adults','Medium'),(38,'Esports','Indoor',5,40,'Valorant Champions','Arena','USA','Teens','Very High'),(39,'Throwball','Outdoor',7,50,'Asian Throwball Championship','Court','India','Women','Medium')" +
                    ",(40,'Softball','Outdoor',9,120,'Softball World Cup','Ground','USA','All Ages','Medium'),(41,'Bowling','Indoor',1,10,'World Bowling Tour','Lane','USA','All Ages','Medium'),(42,'Lacrosse','Outdoor',10,60,'World Lacrosse Championship','Ground','USA','All Ages','Medium')" +
                    ",(43,'Polo','Outdoor',4,90,'World Polo Championship','Field','India','Adults','Low'),(44,'Horse Racing','Outdoor',1,30,'Royal Ascot','Track','UK','Adults','Medium'),(45,'Kickboxing','Indoor',1,15,'World Kickboxing Championship','Ring','Japan','Adults','High')" +
                    ",(46,'Taekwondo','Indoor',1,10,'WT World Championship','Hall','Korea','All Ages','High'),(47,'Karate','Indoor',1,10,'WKF Championship','Hall','Japan','All Ages','High'),(48,'Judo','Indoor',1,10,'World Judo Championship','Hall','Japan','All Ages','High')" +
                    ",(49,'Muay Thai','Indoor',1,10,'Muay Thai World Cup','Ring','Thailand','Adults','High'),(50,'Sumo','Indoor',1,5,'Grand Sumo Tournament','Ring','Japan','Adults','Medium'),(51,'Fencing','Indoor',1,10,'FIE World Cup','Hall','France','Adults','Medium')" +
                    ",(52,'Gymnastics','Indoor',1,5,'World Gymnastics','Hall','Greece','Kids','High'),(53,'Parkour','Outdoor',1,5,'Urban Games','Ground','France','Teens','Medium'),(54,'Triathlon','Outdoor',1,240,'World Triathlon Series','Track','USA','Adults','Medium')" +
                    ",(55,'Marathon','Outdoor',1,240,'Boston Marathon','Road','Greece','Adults','High'),(56,'Sprint Running','Outdoor',1,10,'Olympic Sprint','Track','Jamaica','All Ages','Very High'),(57,'Long Jump','Outdoor',1,3,'Diamond League','Ground','Greece','All Ages','High')" +
                    ",(58,'High Jump','Outdoor',1,3,'World Athletics Championship','Ground','Greece','All Ages','High'),(59,'Shot Put','Outdoor',1,2,'World Athletics','Field','Greece','Adults','Medium'),(60,'Discus Throw','Outdoor',1,3,'World Throws Cup','Field','Greece','Adults','Medium')" +
                    ",(61,'Hammer Throw','Outdoor',1,3,'World Athletics','Field','Greece','Adults','Medium'),(62,'Archery Team','Outdoor',3,15,'Archery World Cup','Ground','Korea','All Ages','Medium'),(63,'Beach Volleyball','Outdoor',9,45,'Beach Pro tour','Beach','USA','Adults','High')" +
                    ",(64,'Racquetball','Indoor',1,20,'International Racquetball open','Court','USA','All Ages','Medium'),(65,'Squash','Indoor',1,40,'PSA World Tour','Court','Egypt','Adults','High'),(66,'Paddle Tennis','Outdoor',2,30,'APT Padel Tour','Court','Spain','All Ages','High')" +
                    ",(67,'Sepak Takraw','Outdoor',3,45,'ISTAF Championship','Court','Malaysia','All Ages','Medium'),(68,'Dodgeball','Indoor',6,30,'World Dodgeball Championship','Court','USA','All Ages','Medium'),(69,'Ultimate Frisbee','Outdoor',7,60,'WFDF Championship','Ground','USA','All Ages','Medium')" +
                    ",(70,'Billiards','Indoor',1,60,'ISBF World Championship','Table','India','Adults','Medium'),(71,'Petanque','Outdoor',3,30,'World Petanque Championship','Ground','Italy','Adults','Low'),(72,'Bocce','Outdoor',3,40,'Bocce World Cup','Ground','Italy','Adults','Low')" +
                    ",(73,'Paddleboarding','Outdoor',1,30,'Paddle World tour','Water','Hawaii','All Ages','Medium'),(74,'Climbing','Outdoor',1,20,'IFSC Climbing Cup','Wall','Germany','Teens','Medium'),(75,'Mountaineering','Outdoor',1,600,'Everest Expedition','Mountain','Nepal','Adults','Medium');";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Rows Affected by insert : "+rowsAffected);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
