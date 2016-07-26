package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import com.mongodb.util.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test{
   public static void main( String args[] ){
      try{   
		
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
      
         DB db = mongoClient.getDB( "test" );
		 System.out.println("Connect to database successfully");
        
         DBCollection collection = db.getCollection("ppp1000000");
         System.out.println("Collection mycol selected successfully");
     
      
  /*       
                 
   List datas = new ArrayList(); 
         for (int i=0; i < 100000; i++) { 
      /*   BasicDBObject bo = new BasicDBObject();
         BasicDBObject bo2 = new BasicDBObject();
         BasicDBObject bo3 = new BasicDBObject();
         BasicDBObject bo4 = new BasicDBObject();
         BasicDBObject bo5 = new BasicDBObject();
         BasicDBObject bo6 = new BasicDBObject();
         BasicDBObject bo7 = new BasicDBObject();
         BasicDBObject bo8 = new BasicDBObject();
         BasicDBObject bo9 = new BasicDBObject();
         BasicDBObject bo10 = new BasicDBObject();
         
         
               
         
         bo.put("_id", x);  
         bo.put("pname", "Mary"); 
         bo.put("cid", 6);
         datas.add(bo); 
         
         bo2.put("_id", i*10+2);  
         bo2.put("pname", "Ann"); 
         bo2.put("cid", 5);
         datas.add(bo2); 
         
         bo3.put("_id", i*10+3);  
         bo3.put("pname", "Bob"); 
         bo3.put("cid", 8);
         datas.add(bo3); 
         
         bo4.put("_id", i*10+4);  
         bo4.put("pname", "Rachel"); 
         bo4.put("cid", 4);
         datas.add(bo4); 
         
         bo5.put("_id", i*10+5);  
         bo5.put("pname", "Helen"); 
         bo5.put("cid", 3);
         datas.add(bo5); 
         
         bo6.put("_id", i*10+6);  
         bo6.put("pname", "Steven"); 
         bo6.put("cid", 2);
         datas.add(bo6); 
         
         bo7.put("_id", i*10+7);  
         bo7.put("pname", "Carrie"); 
         bo7.put("cid", 1);
         datas.add(bo7); 
         
         bo8.put("_id", i*10+8);  
         bo8.put("pname", "John"); 
         bo8.put("cid", 8);
         datas.add(bo8); 
         
         bo9.put("_id", i*10+9);  
         bo9.put("pname", "Jim"); 
         bo9.put("cid", 4);
         datas.add(bo9); 
         
         bo10.put("_id", i*10+10);  
         bo10.put("pname", "Zach"); 
         bo10.put("cid", 7);
         datas.add(bo10); 
   */
     
      /*       String s1 = String.valueOf(i*10+1); 
        	 String s2 = String.valueOf(i*10+2);
        	 String s3 = String.valueOf(i*10+3);
        	 String s4 = String.valueOf(i*10+4);
        	 String s5 = String.valueOf(i*10+5);
        	 String s6 = String.valueOf(i*10+6);
        	 String s7 = String.valueOf(i*10+7);
        	 String s8 = String.valueOf(i*10+8);
        	 String s9 = String.valueOf(i*10+9);
        	 String s10 = String.valueOf(i*10+10);
        	 
        	 
        	  String json = "{'_id' : "+ s1+ ",'pname' : 'Mary',"+
        		         "'cid':6}";            
              DBObject dbObject = (DBObject)JSON.parse(json);
              datas.add(dbObject);
        
              
        String json2 = "{'_id' : "+ s2+ ",'pname' : 'Ann',"+
		         "'cid':5}";         
           DBObject dbObject2 = (DBObject)JSON.parse(json2);
            datas.add(dbObject2);
        	
            String json3 = "{'_id' : "+ s3+ ",'pname' : 'Bob',"+
   		         "'cid':8}";         
              DBObject dbObject3 = (DBObject)JSON.parse(json3);
               datas.add(dbObject3);
               
               String json4 = "{'_id' :"+ s4+ ",'pname' : 'Rachel',"+
      		         "'cid':4}";         
                 DBObject dbObject4 = (DBObject)JSON.parse(json4);
                  datas.add(dbObject4);
         
                  String json5 = "{'_id' :"+  s5+ ",'pname' : 'Helen',"+
         		         "'cid':3}";         
                    DBObject dbObject5 = (DBObject)JSON.parse(json5);
                     datas.add(dbObject5);
            
                     String json6 = "{'_id' :"+ s6+ ",'pname' : 'Steven',"+
            		         "'cid':2}";         
                       DBObject dbObject6 = (DBObject)JSON.parse(json6);
                        datas.add(dbObject6);
                        
                        String json7 = "{'_id' :"+ s7+ ",'pname' : 'Carrie',"+
               		         "'cid':1}";         
                          DBObject dbObject7 = (DBObject)JSON.parse(json7);
                           datas.add(dbObject7);
                           
                           String json8 = "{'_id' : "+ s8+ ",'pname' : 'John',"+
                  		         "'cid':8}";         
                             DBObject dbObject8 = (DBObject)JSON.parse(json8);
                              datas.add(dbObject8);
                              
                              String json9 = "{'_id' : "+ s9+ ",'pname' : 'Jim',"+
                     		         "'cid':4}";         
                                DBObject dbObject9 = (DBObject)JSON.parse(json9);
                                 datas.add(dbObject9);
                                 
                                 String json10 = "{'_id' :"+  s10+ ",'pname' : 'Zach',"+
                        		         "'cid':7}";         
                                   DBObject dbObject10 = (DBObject)JSON.parse(json10);
                                    datas.add(dbObject10);
                                 
                                 
         } 
         
         
         collection.insert(datas); 
              System.out.println("Document inserted successfully");
           
       */    
           
          
           
       
            
           DBObject myDoc = collection.findOne();
              System.out.println(myDoc);
          
              DBCursor cursor = collection.find();
              int i=1;
              while (cursor.hasNext()) { 
                 System.out.println("Inserted Document: "+i); 
                 System.out.println(cursor.next()); 
                 i++;
          }

              
              
              
              
    /*          
      
       //    DBCursor cursor = collection.find();
              while (cursor.hasNext()) { 
                 DBObject updateDocument = cursor.next();
                 updateDocument.put("likes","200");
                 //change.add(updateDocument);
                 collection.update(updateDocument,updateDocument); 
              }
              System.out.println("Document updated successfully");
            //  cursor = collection.find();
              int j=1;
              while (cursor.hasNext()) { 
                 System.out.println("Updated Document: "+j); 
                 System.out.println(cursor.next()); 
                 j++;
        
    } 
   */ 
              
              
              
      }
          
      
      
      
      catch(Exception e){
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	  }
   }
   };
   

