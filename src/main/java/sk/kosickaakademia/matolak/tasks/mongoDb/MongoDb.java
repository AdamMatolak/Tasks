package sk.kosickaakademia.matolak.tasks.mongoDb;

import sk.kosickaakademia.matolak.tasks.collection.Task;

import java.util.List;

public interface MongoDb {
    /**
     * description
     * @param task
     * @author Adam
     * @version 1.0
     */
    public void insertTask(Task task);

    public void makeTaskDone(int id);

    public List<Task> getAllTasks();

    public List<Task> getAllTasks(boolean done);

    public List<Task> getTasksByPriority(int priority);

    public List<Task> getTasksByName(String name);

    public void DeleteFinishedTasks();

}
