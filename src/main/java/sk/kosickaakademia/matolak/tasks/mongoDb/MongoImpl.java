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

    @Override
    public void insertTask(Task task) {
        if(task==null){
            return;
        }
        Document newTask = new Document("name",task.getName()).
                append("priority",task.getPriority()).
                append("done",task.isDone()).
                append("date",task.getDate());
        if (task.getPrice()>=0){
            newTask.append("price",task.getPrice());
        }
        if (task.getId()!=null){
            newTask.append("_id",task.getId());
        }
        try{
            MongoCollection<Document> collection = getDocumentMongoCollection();
            collection.insertOne(newTask);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private MongoCollection<Document> getDocumentMongoCollection() {
        MongoClient mongoClient = new MongoClient();
        MongoDatabase db = mongoClient.getDatabase("TaskDB");
        MongoCollection<Document> collection = db.getCollection("Tasks");
        return collection;
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
