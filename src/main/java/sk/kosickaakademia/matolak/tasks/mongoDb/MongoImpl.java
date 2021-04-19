package sk.kosickaakademia.matolak.tasks.mongoDb;

import sk.kosickaakademia.matolak.tasks.collection.Task;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Date;
import java.util.List;


import java.util.List;

public class MongoImpl implements MongoDb {

    //dbname: TaskDB
    //collection: Tasks
    private static final MongoClient mongoClient = new MongoClient();
    private static MongoDatabase database;
    private static Document docs;
    private static MongoCollection<Document> collection;
    private static Date date = new Date();

    public boolean insertTask(String title, String task, int priority, double price) {
        if(title==null || title.equals("") || task==null || task.equals("") || priority<1 || priority>3 || price<=0)
            return false;
        database=mongoClient.getDatabase("TasksDB");
        collection = database.getCollection("Tasks");
        docs=new Document("task",task);
        docs= new Document();
        docs.append("date", date);
        docs.append("title", title);
        docs.append("task", task);
        docs.append("priority", priority);
        docs.append("price", price);
        docs.append("done", false);
        collection.insertOne(docs);
        return true;
    }

    @Override
    public void insertTask(Task task) {

    }

    @Override
    public void makeTaskDone( int id) {

    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public List<Task> getAllTasks(boolean done) {
        return null;
    }

    @Override
    public List<Task> getTasksByPriority(int priority) {
        return null;
    }

    @Override
    public List<Task> getTasksByName(String name) {
        return null;
    }

    @Override
    public void DeleteFinishedTasks() {

    }
}
