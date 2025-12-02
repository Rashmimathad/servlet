package com.xworkz.tables.president;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainInsertPresident {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/servletschema";
        String userName="root";
        String password="Root@1102";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO president VALUES" +
                    "(1,'Dr. Rajendra Prasad','India','Bihar','1884-12-03','Male',1950,1962,'INC',12,'First President of India','PhD in Law','Freedom Fighter',500000,85)," +
                    "(2,'Dr. Sarvepalli Radhakrishnan','India','Tamil Nadu','1888-09-05','Male',1962,1967,'Independent',5,'Promoted education reforms','MA Philosophy','Vice President',450000,88)," +
                    "(3,'Dr. Zakir Husain','India','Telangana','1897-02-08','Male',1967,1969,'Independent',2,'Strengthened cultural relations','PhD','Governor of Bihar',400000,82)," +
                    "(4,'V.V. Giri','India','Andhra Pradesh','1894-08-10','Male',1969,1974,'Independent',5,'Focused on labour welfare','MA Law','Vice President',450000,78)," +
                    "(5,'Fakhruddin Ali Ahmed','India','Delhi','1905-05-13','Male',1974,1977,'INC',3,'Emergency period decisions','LLB','Minister',420000,65)," +
                    "(6,'Neelam Sanjiva Reddy','India','Andhra Pradesh','1913-05-19','Male',1977,1982,'Janata Party',5,'Improved parliamentary functioning','BA','Speaker of Lok Sabha',460000,79)," +
                    "(7,'Giani Zail Singh','India','Punjab','1916-05-05','Male',1982,1987,'INC',5,'Strengthened internal security','Religious Studies','Home Minister',480000,74)," +
                    "(8,'R. Venkataraman','India','Tamil Nadu','1910-12-04','Male',1987,1992,'INC',5,'Economic liberalisation support','MA Economics','Finance Minister',500000,81)," +
                    "(9,'Dr. Shankar Dayal Sharma','India','Madhya Pradesh','1918-08-19','Male',1992,1997,'INC',5,'Judicial transparency initiatives','PhD Law','Vice President',510000,84)," +
                    "(10,'K. R. Narayanan','India','Kerala','1920-10-27','Male',1997,2002,'Independent',5,'Social justice reforms','MA English','Vice President',520000,86)," +
                    "(11,'Dr. A. P. J. Abdul Kalam','India','Tamil Nadu','1931-10-15','Male',2002,2007,'Independent',5,'Missile Program, Vision 2020','Aeronautical Engineering','Scientific Advisor',550000,95)," +
                    "(12,'Pratibha Patil','India','Maharashtra','1934-12-19','Female',2007,2012,'INC',5,'Women empowerment programs','MA Political Science','Governor of Rajasthan',530000,75)," +
                    "(13,'Pranab Mukherjee','India','West Bengal','1935-12-11','Male',2012,2017,'INC',5,'Economic policy strengthening','MA History','Finance Minister',560000,80)," +
                    "(14,'Ram Nath Kovind','India','Uttar Pradesh','1945-10-01','Male',2017,2022,'BJP',5,'Judicial reforms support','LLB','Governor of Bihar',580000,82)," +
                    "(15,'Droupadi Murmu','India','Odisha','1958-06-20','Female',2022,2025,'BJP',3,'Tribal welfare initiatives','BA','Governor of Jharkhand',600000,90)," +
                    "(16,'Arun Dev Varma','India','Kerala','1960-04-10','Male',2025,2030,'Independent',5,'Digital governance expansion','PhD Politics','Chief Justice',620000,88)," +
                    "(17,'Meera Kulkarni','India','Maharashtra','1965-07-22','Female',2030,2035,'INC',5,'Primary education reform','MA Sociology','Education Minister',610000,87)," +
                    "(18,'Raghav Singh Chauhan','India','Rajasthan','1962-01-15','Male',2035,2040,'BJP',5,'Agricultural modernization','MBA','Governor of Gujarat',650000,84)," +
                    "(19,'Kavitha Reddy','India','Telangana','1970-11-19','Female',2040,2045,'Independent',5,'Healthcare digitalization','MBBS','Health Secretary',6400/00,89)," +
                    "(20,'Aditya Bose','India','West Bengal','1972-04-04','Male',2045,2050,'AIJP',5,'AI governance framework','PhD AI','Technology Advisor',700000,92)," +
                    "(21,'Sanjana Iyer','India','Karnataka','1975-09-25','Female',2050,2055,'INC',5,'Startup ecosystem reforms','MBA','IT Minister',680000,88)," +
                    "(22,'Mahesh Tripathi','India','Uttar Pradesh','1971-06-02','Male',2055,2060,'BJP',5,'Infrastructure expansion','BTech Civil','Public Works Chair',690000,86)," +
                    "(23,'Rohit Verghese','India','Kerala','1974-12-12','Male',2060,2065,'Independent',5,'Climate action policies','PhD Climate Science','UN Ambassador',710000,93)," +
                    "(24,'Anita Sahu','India','Odisha','1980-03-19','Female',2065,2070,'INC',5,'Women safety initiatives','MA Psychology','Social Welfare Minister',720000,90)," +
                    "(25,'Vivaan Malhotra','India','Delhi','1978-01-08','Male',2070,2075,'BJP',5,'Defence modernization','LLM','Defence Secretary',740000,88)," +
                    "(26,'Suresh Menon','India','Kerala','1981-04-21','Male',2075,2080,'Independent',5,'Tourism growth plan','MBA','Trade Commissioner',690000,84)," +
                    "(27,'Priya Rathod','India','Gujarat','1983-10-16','Female',2080,2085,'INC',5,'Rural empowerment','PhD Rural Dev','NGO Head',710000,85)," +
                    "(28,'Arvind Khanna','India','Punjab','1982-07-11','Male',2085,2090,'BJP',5,'Food security programs','MA Economics','Agriculture Minister',720000,87)," +
                    "(29,'Rekha Pillai','India','Tamil Nadu','1984-12-29','Female',2090,2095,'Independent',5,'Cybersecurity reforms','BTech IT','Cyber Cell Director',750000,91)," +
                    "(30,'Dev Raj Sharma','India','Haryana','1985-05-01','Male',2095,2100,'INC',5,'Industrial policy strengthening','BCom','Commerce Secretary',740000,86)," +
                    "(31,'Siddharth Nair','India','Kerala','1990-02-20','Male',2100,2105,'AIJP',5,'Green economy initiatives','PhD Energy','ISRO Scientist',760000,94)," +
                    "(32,'Rita Patel','India','Gujarat','1988-03-17','Female',2105,2110,'BJP',5,'Smart city expansion','MBA','Urban Minister',780000,89)," +
                    "(33,'Kabir Thapa','India','Sikkim','1991-06-28','Male',2110,2115,'Independent',5,'Mountain development projects','MA Geography','Environment Officer',750000,83)," +
                    "(34,'Leena D’Souza','India','Goa','1992-01-05','Female',2115,2120,'INC',5,'Tourism and culture growth','MA Tourism','Travel Board Chair',770000,86)," +
                    "(35,'Arjun Deshmukh','India','Maharashtra','1989-09-09','Male',2120,2125,'BJP',5,'Railway modernization','BTech Mechanical','Railway Board Head',800000,92)," +
                    "(36,'Maya Chandel','India','MP','1993-10-14','Female',2125,2130,'Independent',5,'Digital rural access','MA Economics','Govt Advisor',790000,88)," +
                    "(37,'Harish Gowda','India','Karnataka','1987-11-11','Male',2130,2135,'INC',5,'Agritech reforms','BSc Agriculture','Agri Minister',770000,85)," +
                    "(38,'Sonal Mehta','India','Gujarat','1994-05-18','Female',2135,2140,'BJP',5,'Manufacturing expansion','MBA','Industry Secretary',810000,89)," +
                    "(39,'R. P. Chatterjee','India','West Bengal','1986-12-18','Male',2140,2145,'Independent',5,'Education digitization','PhD Education','University Dean',800000,87)," +
                    "(40,'Neha Bhat','India','Punjab','1995-08-30','Female',2145,2150,'INC',5,'Social justice reforms','LLM','Legal Activist',820000,90)," +
                    "(41,'Amit Thakur','India','Uttarakhand','1996-02-11','Male',2150,2155,'Independent',5,'Disaster management systems','BTech Civil','Disaster Head',830000,91)," +
                    "(42,'Sara Joseph','India','Kerala','1996-03-22','Female',2155,2160,'INC',5,'Healthcare AI integration','MBBS','Hospital Director',845000,93)," +
                    "(43,'Ajeet Rana','India','UP','1992-09-12','Male',2160,2165,'BJP',5,'Electric mobility reforms','BTech Electrical','Transport Minister',860000,88)," +
                    "(44,'Tanya Menon','India','Tamil Nadu','1997-07-14','Female',2165,2170,'Independent',5,'Arts & cultural preservation','MA Arts','Culture Officer',840000,87)," +
                    "(45,'Vikram Chauhan','India','Rajasthan','1998-04-07','Male',2170,2175,'INC',5,'Water management reforms','PhD Hydrology','Irrigation Head',870000,92)," +
                    "(46,'Isha Sharma','India','Haryana','1999-05-19','Female',2175,2180,'BJP',5,'Cyber law modernization','LLB','Cyber Judge',880000,90)," +
                    "(47,'Rohan Iyer','India','Karnataka','2000-08-15','Male',2180,2185,'Independent',5,'Space tech expansion','Aerospace Eng','ISRO Advisor',900000,94)," +
                    "(48,'Deepika Reddy','India','AP','2001-09-21','Female',2185,2190,'INC',5,'Child welfare reforms','Psychology','NGO Leader',870000,86)," +
                    "(49,'Manoj Patil','India','Maharashtra','1998-11-11','Male',2190,2195,'BJP',5,'IT & data protection','BSc CS','IT Board Head',910000,89)," +
                    "(50,'Sahana Rao','India','Tamil Nadu','2000-12-01','Female',2195,2200,'Independent',5,'Environmental reforms','PhD Ecology','Forest Officer',925000,95)," +
                    "(51,'Arvind Joshi','India','Gujarat','1999-01-18','Male',2200,2205,'INC',5,'Export policy strengthening','MBA','Trade Minister',890000,84)," +
                    "(52,'Ritu Singh','India','UP','2002-02-18','Female',2205,2210,'BJP',5,'AI-based policing','Criminology','IPS Officer',905000,86)," +
                    "(53,'Nikhil Verma','India','MP','2003-04-22','Male',2210,2215,'Independent',5,'Welfare finance overhaul','MCom','Finance Officer',890000,87)," +
                    "(54,'Sana Qureshi','India','Delhi','2001-09-09','Female',2215,2220,'INC',5,'Urban housing reforms','MA Urban Dev','Urban Planner',880000,83)," +
                    "(55,'Karan Patel','India','Gujarat','2002-05-10','Male',2220,2225,'BJP',5,'Electric grid modernization','Electrical Eng','Energy Board Chair',930000,92)," +
                    "(56,'Lalita Desai','India','Maharashtra','2003-01-29','Female',2225,2230,'Independent',5,'Women leadership programs','MA Sociology','NGO Director',880000,88)," +
                    "(57,'Raghav Jha','India','Bihar','2004-03-12','Male',2230,2235,'INC',5,'Agricultural subsidies reform','MSc Agriculture','Farmer Union Leader',900000,84)," +
                    "(58,'Aarav Kapoor','India','Delhi','2002-10-10','Male',2235,2240,'Independent',5,'Tech startup reforms','MBA','Startup CEO',940000,93)," +
                    "(59,'Nisha Mehra','India','Punjab','2005-06-05','Female',2240,2245,'BJP',5,'Public safety modernization','LLB','High Court Judge',910000,89)," +
                    "(60,'Yashwant Reddy','India','AP','2004-08-17','Male',2245,2250,'INC',5,'Education reforms','MA Education','Board of Studies',890000,86)," +
                    "(61,'Ananya Pillai','India','Kerala','2003-09-10','Female',2250,2255,'Independent',5,'Digital ID reforms','BTech CS','UIDAI Officer',930000,91)," +
                    "(62,'Harshit Chauhan','India','Rajasthan','2005-04-14','Male',2255,2260,'BJP',5,'Smart agriculture','PhD AgriTech','Agri Scientist',960000,92)," +
                    "(63,'Tara Sen','India','West Bengal','2004-12-18','Female',2260,2265,'INC',5,'Public healthcare systems','MBBS','Chief Surgeon',920000,88)," +
                    "(64,'Advik Shetty','India','Karnataka','2005-02-27','Male',2265,2270,'Independent',5,'Marine research expansion','Ocean Science','Research Head',880000,84)," +
                    "(65,'Megha Chawla','India','Haryana','2003-03-03','Female',2270,2275,'INC',5,'Traffic management modernization','Civil Eng','Transport Planner',910000,86)," +
                    "(66,'Dev Singh','India','UP','2004-11-29','Male',2275,2280,'BJP',5,'Skill development reforms','MBA','Skill Council Head',950000,89)," +
                    "(67,'Simran Gill','India','Punjab','2004-01-05','Female',2280,2285,'Independent',5,'Green transport initiatives','Mechanical Eng','EV Specialist',940000,90)," +
                    "(68,'Rudra Deshmukh','India','Maharashtra','2006-04-07','Male',2285,2290,'INC',5,'Sports development policies','BA Sports','Sports Director',875000,82)," +
                    "(69,'Aarohi Sharma','India','Delhi','2006-07-22','Female',2290,2295,'BJP',5,'Cyber citizen safety','MSc Data Science','Cybersecurity Analyst',980000,94)," +
                    "(70,'Veer Reddy','India','Telangana','2005-12-18','Male',2295,2300,'Independent',5,'National AI policy','AI Engineering','AI Lab Director',990000,96)," +
                    "(71,'Shreya Iyer','India','Tamil Nadu','2006-02-15','Female',2300,2305,'INC',5,'Education for all','MA Education','School Board Officer',910000,89)," +
                    "(72,'Kabir Das','India','UP','2007-01-09','Male',2305,2310,'BJP',5,'Rail freight modernization','Mechanical Eng','Rail Board Head',950000,91)," +
                    "(73,'Ria Nair','India','Kerala','2006-06-30','Female',2310,2315,'Independent',5,'Public sanitation revolution','PhD Public Health','WHO Delegate',985000,95)," +
                    "(74,'Harshad Mehta','India','Gujarat','2007-03-02','Male',2315,2320,'INC',5,'Trade & export reforms','MBA Finance','Export Council Head',930000,84)," +
                    "(75,'Anvi Rathore','India','Rajasthan','2007-08-08','Female',2320,2325,'BJP',5,'National innovation mission','MTech Robotics','Innovation Head',990000,97);";
            int rowsAffected =  statement.executeUpdate(sql);
            System.out.println("Rows Affected : "+rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
