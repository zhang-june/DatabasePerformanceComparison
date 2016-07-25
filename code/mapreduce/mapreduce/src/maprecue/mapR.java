package maprecue;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceOutput;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceOutput;

public class mapR {
 


 public static void main(String[] args) {


  try {
	  
	    MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	    
	     DB db = mongoClient.getDB( "test" );
		 System.out.println("Connect to database successfully");
	    
	     DBCollection collection = db.getCollection("employee1");
	     DBCollection collection2 =db.getCollection("department");
	     System.out.println("Collection  selected successfully");

 //  mongo = new Mongo("localhost", 27017);

 // DB db = mongo.getDB("library");

 

  // DBCollection books = db.getCollection("books");

  
   
   String mapemployee1 = "function() { "+
             "var output= {departmentid : this.department,firstname:this.name.first, lastname:this.name.last , department:null} " + 
             "emit(this.department, output);}; ";
   
   String mapdepartment = "function() { "+
		   "var output= {departmentid : this._id,firstname:null, lastname:null , department:this.department} " + 
           " emit(this._id, output);}; ";
 
   
     
   String reduce = "function(key, values) { " +
                            "var outs = {firstname:null, lastname:null , department:null}; " +
                            " values.forEach(function(v){ " +
                            "if(outs.firstname ==null){ "+
                          "outs.firstname = v.firstname} " +
                            "if(outs.lastname ==null){ "+
                          "outs.lastname = v.lastname}"+
                            "if(outs.department ==null){"+
                          "outs.department = v.department}"+
                            "});"+
                          "return outs;"+
                            "};";
   
   
   MapReduceCommand cmd = new MapReduceCommand(collection, mapemployee1, reduce,
		        null, MapReduceCommand.OutputType.INLINE, null);
		   		    
		      MapReduceOutput out = collection.mapReduce(cmd); 
		      }
  catch (Exception e) {
	
	     // TODO Auto-generated catch block
	
	     e.printStackTrace();
	  
	    }

		   

  
 }
 
 
 }
