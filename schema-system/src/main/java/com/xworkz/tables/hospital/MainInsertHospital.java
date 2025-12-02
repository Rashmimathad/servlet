package com.xworkz.tables.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainInsertHospital {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
            String insertsql = " INSERT INTO hospital VALUES" +
                    "(1,'Apollo Hospital','Private','Bengaluru, Karnataka',1983,850,'080-22558899','apollo1@hospital.com',4.7,'Yes')," +
                    "(2,'Fortis Hospital','Private','Mumbai, Maharashtra',1996,500,'022-66448855','fortis2@hospital.com',4.5,'Yes')," +
                    "(3,'AIIMS Delhi','Government','New Delhi',1956,2400,'011-26588500','aiims3@hospital.com',4.9,'Yes')," +
                    "(4,'Manipal Hospital','Private','Mangalore, Karnataka',1991,600,'0824-2422270','manipal4@hospital.com',4.6,'Yes')," +
                    "(5,'Narayana Health','Private','Bengaluru, Karnataka',2000,1200,'080-71223344','narayana5@hospital.com',4.4,'Yes')," +
                    "(6,'Max Healthcare','Private','New Delhi',2004,700,'011-40554055','max6@hospital.com',4.3,'Yes')," +
                    "(7,'Tata Memorial','Government','Mumbai, Maharashtra',1941,1000,'022-24177000','tata7@hospital.com',4.8,'Yes')," +
                    "(8,'KIMS Hospital','Private','Hyderabad, Telangana',2004,900,'040-44885000','kims8@hospital.com',4.4,'Yes')," +
                    "(9,'Ruby Hall Clinic','Private','Pune, Maharashtra',1959,750,'020-26163391','ruby9@hospital.com',4.2,'Yes')," +
                    "(10,'CMC Vellore','Trust','Vellore, Tamil Nadu',1900,3200,'0416-2281000','cmc10@hospital.com',4.9,'Yes')," +
                    "(11,'Aster Hospital','Private','Kochi, Kerala',2014,500,'0484-6699999','aster11@hospital.com',4.5,'Yes')," +
                    "(12,'Sanjay Gandhi Hospital','Government','Delhi',1986,400,'011-25317797','sgh12@hospital.com',3.8,'Yes')," +
                    "(13,'JJ Hospital','Government','Mumbai, Maharashtra',1845,1100,'022-22621974','jj13@hospital.com',4.1,'Yes')," +
                    "(14,'Columbia Asia','Private','Bengaluru, Karnataka',2008,300,'080-61656666','col14@hospital.com',4.0,'Yes')," +
                    "(15,'Hinduja Hospital','Private','Mumbai, Maharashtra',1951,750,'022-24451515','hind15@hospital.com',4.7,'Yes')," +
                    "(16,'BLK Hospital','Private','Delhi',1959,650,'011-30403040','blk16@hospital.com',4.5,'Yes')," +
                    "(17,'Yashoda Hospital','Private','Hyderabad, Telangana',1990,1000,'040-45674567','yash17@hospital.com',4.4,'Yes')," +
                    "(18,'Care Hospital','Private','Visakhapatnam, AP',1997,600,'0891-6699666','care18@hospital.com',4.3,'Yes')," +
                    "(19,'SevenHills Hospital','Private','Mumbai, Maharashtra',2010,1500,'022-67676767','sh19@hospital.com',4.6,'Yes')," +
                    "(20,'Rainbow Children Hospital','Private','Bengaluru, Karnataka',1999,400,'080-22556677','rain20@hospital.com',4.4,'Yes')," +
                    "(21,'Sunrise Hospital','Private','Kochi, Kerala',2005,250,'0484-2423456','sun21@hospital.com',4.2,'Yes')," +
                    "(22,'Global Hospital','Private','Chennai, Tamil Nadu',1999,500,'044-44777000','global22@hospital.com',4.3,'Yes')," +
                    "(23,'Aditya Birla Hospital','Private','Pune, Maharashtra',2006,500,'020-30717676','ab23@hospital.com',4.5,'Yes')," +
                    "(24,'Sir Ganga Ram Hospital','Private','Delhi',1954,675,'011-25750000','sgr24@hospital.com',4.7,'Yes')," +
                    "(25,'Kokilaben Ambani Hospital','Private','Mumbai',2009,750,'022-42696969','kok25@hospital.com',4.6,'Yes')," +
                    "(26,'Shalby Hospital','Private','Ahmedabad, Gujarat',1994,450,'079-40203000','shal26@hospital.com',4.2,'Yes')," +
                    "(27,'IMS Hospital','Private','Bhubaneswar, Odisha',2010,550,'0674-2300200','ims27@hospital.com',4.1,'Yes')," +
                    "(28,'Sparsh Hospital','Private','Bengaluru, Karnataka',2006,400,'080-61222000','spa28@hospital.com',4.0,'Yes')," +
                    "(29,'Malabar Cancer Centre','Government','Kannur, Kerala',2001,500,'0497-2808123','mcc29@hospital.com',4.3,'Yes')," +
                    "(30,'Rajiv Gandhi Hospital','Government','Chennai, Tamil Nadu',1980,1400,'044-24532000','rg30@hospital.com',3.9,'Yes')," +
                    "(31,'Breach Candy Hospital','Private','Mumbai',1950,300,'022-23667809','bc31@hospital.com',4.6,'Yes')," +
                    "(32,'NIMS','Government','Hyderabad, Telangana',1961,1200,'040-23489000','nims32@hospital.com',4.2,'Yes')," +
                    "(33,'Gandhi Hospital','Government','Hyderabad',1954,1600,'040-27505566','gand33@hospital.com',3.8,'Yes')," +
                    "(34,'KLE Hospital','Private','Belagavi, Karnataka',1984,650,'0831-2444444','kle34@hospital.com',4.1,'Yes')," +
                    "(35,'St. John’s Medical College','Trust','Bengaluru',1963,1350,'080-49466000','sj35@hospital.com',4.7,'Yes')," +
                    "(36,'Apex Hospital','Private','Jaipur, Rajasthan',1994,350,'0141-2788000','apex36@hospital.com',4.0,'Yes')," +
                    "(37,'SMS Hospital','Government','Jaipur, Rajasthan',1947,2200,'0141-2560291','sms37@hospital.com',4.3,'Yes')," +
                    "(38,'Geetha Hospital','Private','Madurai, Tamil Nadu',2005,200,'0452-2655000','gee38@hospital.com',4.1,'Yes')," +
                    "(39,'Omni Hospital','Private','Hyderabad, Telangana',2010,300,'040-49165000','omni39@hospital.com',4.0,'Yes')," +
                    "(40,'MGM Hospital','Private','Mumbai, Maharashtra',1982,500,'022-66508777','mgm40@hospital.com',4.2,'Yes')," +
                    "(41,'Lotus Hospital','Private','Chennai, Tamil Nadu',2007,250,'044-44556677','lot41@hospital.com',4.1,'Yes')," +
                    "(42,'Trustwell Hospital','Private','Bengaluru',2010,220,'080-45678900','tw42@hospital.com',4.0,'Yes')," +
                    "(43,'Unity Hospital','Private','Mangalore, Karnataka',1978,300,'0824-2421234','uni43@hospital.com',4.3,'Yes')," +
                    "(44,'Aarogya Hospital','Private','Delhi NCR',2003,180,'011-45256600','aar44@hospital.com',4.0,'Yes')," +
                    "(45,'Prime Hospital','Private','Hyderabad, Telangana',2012,280,'040-44556677','pri45@hospital.com',4.2,'Yes')," +
                    "(46,'Hope Hospital','Private','Mumbai, Maharashtra',2014,200,'022-67890000','hope46@hospital.com',4.1,'Yes')," +
                    "(47,'Sahara Hospital','Private','Lucknow, UP',2009,350,'0522-6789000','sah47@hospital.com',4.4,'Yes')," +
                    "(48,'Vinayaka Hospital','Private','Coimbatore, Tamil Nadu',2001,300,'0422-2233445','vin48@hospital.com',4.1,'Yes')," +
                    "(49,'Parvathi Hospital','Private','Hyderabad',2008,220,'040-22335544','par49@hospital.com',4.0,'Yes')," +
                    "(50,'Meenakshi Mission','Private','Madurai, Tamil Nadu',1985,1000,'0452-2581210','mm50@hospital.com',4.3,'Yes')," +
                    "(51,'Green City Hospital','Private','Bengaluru',2015,150,'080-23456677','gc51@hospital.com',4.1,'Yes')," +
                    "(52,'Holy Cross Hospital','Trust','Kollam, Kerala',1952,500,'0474-2760165','hc52@hospital.com',4.4,'Yes')," +
                    "(53,'Mission Hospital','Trust','Durgapur, WB',1971,700,'0343-2531451','mis53@hospital.com',4.2,'Yes')," +
                    "(54,'General Hospital','Government','Ernakulam, Kerala',1845,1600,'0484-2351122','gh54@hospital.com',4.0,'Yes')," +
                    "(55,'City Care Hospital','Private','Nagpur, Maharashtra',2002,280,'0712-2233445','cc55@hospital.com',4.1,'Yes')," +
                    "(56,'Apollo Clinic South','Private','Kolkata, WB',2010,200,'033-44556677','ap56@hospital.com',4.3,'Yes')," +
                    "(57,'Heritage Hospital','Private','Varanasi, UP',1995,400,'0542-2509999','her57@hospital.com',4.0,'Yes')," +
                    "(58,'Sterling Hospital','Private','Vadodara, Gujarat',2006,350,'0265-2355667','ste58@hospital.com',4.1,'Yes')," +
                    "(59,'Care Plus Hospital','Private','Bhopal, MP',2011,250,'0755-2244667','cp59@hospital.com',4.0,'Yes')," +
                    "(60,'Balaji Hospital','Private','Chennai',1998,300,'044-22446655','bal60@hospital.com',4.2,'Yes')," +
                    "(61,'Sakra World Hospital','Private','Bengaluru',2014,350,'080-49694969','sak61@hospital.com',4.5,'Yes')," +
                    "(62,'Excel Hospital','Private','Patna, Bihar',2007,200,'0612-2233554','exc62@hospital.com',4.0,'Yes')," +
                    "(63,'Orchid Hospital','Private','Ranchi, Jharkhand',2010,220,'0651-2233667','orch63@hospital.com',4.1,'Yes')," +
                    "(64,'Gleneagles Global','Private','Hyderabad',1999,800,'040-44777000','gle64@hospital.com',4.6,'Yes')," +
                    "(65,'Access Hospital','Private','Hubballi, Karnataka',2008,180,'0836-2233445','acc65@hospital.com',4.0,'Yes')," +
                    "(66,'Vijaya Hospital','Private','Chennai',1972,750,'044-24801171','vij66@hospital.com',4.5,'Yes')," +
                    "(67,'Kaveri Hospital','Private','Trichy, Tamil Nadu',1999,400,'0431-2770777','kav67@hospital.com',4.2,'Yes')," +
                    "(68,'Govt. Medical College Hospital','Government','Kozhikode, Kerala',1957,1800,'0495-2350216','gmch68@hospital.com',4.3,'Yes')," +
                    "(69,'Sunrise MultiCare','Private','Indore, MP',2012,200,'0731-2244667','sun69@hospital.com',4.0,'Yes')," +
                    "(70,'Royal Care Hospital','Private','Coimbatore',2015,450,'0422-4567890','roy70@hospital.com',4.4,'Yes')," +
                    "(71,'Unity Life Hospital','Private','Delhi NCR',2013,240,'011-33445566','ul71@hospital.com',4.0,'Yes')," +
                    "(72,'Nova Hospital','Private','Guwahati, Assam',2009,260,'0361-2233445','nov72@hospital.com',4.1,'Yes')," +
                    "(73,'City Hospital Central','Private','Bengaluru',2016,150,'080-22882288','chc73@hospital.com',4.0,'Yes')," +
                    "(74,'Metro Hospital','Private','Faridabad, Haryana',2002,300,'0129-2244667','met74@hospital.com',4.2,'Yes')," +
                    "(75,'Sunshine Hospital','Private','Hyderabad',2009,350,'040-44557788','sun75@hospital.com',4.3,'Yes');";
            int rowsAffected = statement.executeUpdate(insertsql);
            System.out.println("Rows Affected : "+rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
