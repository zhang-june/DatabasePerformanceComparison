This project is to compare performance between NoSQL database MongoDB and relational database MySQL to insert, update, and select 100 to 1000000 tuples repectively.

## Run this application:

In order to run select, update and delete modules in this project, you need to populate data to database first. Change the directory to code/mysql. Run citytable.java. After this, the MongoDB database and MySQL datdabase is ready to test.

## Test performance of MySQL

To insert tuples into MySQL, change the directory to "code/mysql/src". Run "testinsert.java". After this, the time cost for insertion of different numbers of tuples will be shown on the console. 

To update tuples in MySQL, change the directory to "code/mysql/src". Run "testupdate.java". After this, the time cost for update of different numbers of tuples will be shown on the console. 

To delete tuples in MySQL, change the directory to "code/mysql/src". Run "testdelete.java". After this, the time cost for delete of different numbers of tuples will be shown on the console. 

## Test performance of MongoDB

To test the time cost of insert, update and delete data in MongoDB database, change the directory to "code/mongodb/mongodb/src". Run "test.java". After this, the time cost for insert, update and delete of different numbers of tuples will be shown on the console. 