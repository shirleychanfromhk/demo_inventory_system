# How to Start
 - Use any IDE to import my project
 - Set up a springbootdb with any persistent db software
 - change the database password and port to your database password and port  in application.properties
 - If IDE show buildpath error after import my project. Please right click the project and choose properties
   then go to java build path and choose libraries tag, then edit JRE System libraries to any version you have. Last, click apply and close.

# How to compile
 - right click InventoryApplicationDemoApplication and select run as java application
 - If you see Started InventoryApplicationDemoApplication in XXX seconds means sever running
 - Open browser and go to http://localhost:8080 which is the home page of this web application

# Version 1.0
###Function
 - Search inventory by product id
 - Update inventory quantity and location
 - Upload csv to insert data to db (you can download my csv to test)

# Daily
###Day 1
 - Using Spring Initializer online to build the environment
 - Search how to connect MariaDB to spring project
 - Use other Spring Boot project as reference
 - Difficulties: Nothing happen after run the test class by JUnit

###Day 2
 - insert data by controller successfully
 - plan to create a page to show data from "products" table by product Id
 - Complete basic display function at afternoon, all example can find online
 - Need to find solution for user input product id and search or update inventory
 
###Day3
 - Retrieve form data and display query result success, thanks to friend and internet
 - Start to code upload csv function
 - So far I only can read csv by index, don't know why the csvRecord cannot read the csv header. If anyone can tell me by email, I will very appreciate. 
 - My Email address: shirleychanfromhk@gmail.com
 - Not complete change inventory from one location to other location

###future plan 
 - Try to add one more object class to handle inventory update
 - Modify controller to findbyProductIdAndLocation for deducting the original inventory
 - Modify upload complete page to show the database after change

