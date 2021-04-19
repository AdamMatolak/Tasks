package sk.kosickaakademia.matolak.tasks;

import sk.kosickaakademia.matolak.tasks.collection.Task;
import sk.kosickaakademia.matolak.tasks.mongoDb.MongoImpl;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static void testAddNewTask(){
        Task task = new Task("Vyrajbať",3,false, new Date(),2.50);
        MongoImpl mongo = new MongoImpl();
        mongo.insertTask(task);
    }
}