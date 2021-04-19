package sk.kosickaakademia.matolak.tasks.collection;

import org.bson.types.ObjectId;

import java.util.Date;

public class Task {

    private ObjectId id;
    private String name;
    private int priority;
    private boolean done;
    private Date date;
    private double price;

    public Task(String name, int priority, boolean done, Date date) {
        this.name = name;
        this.priority = priority;
        this.done = done;
        this.date = date;
        this.price = -1;
        id = null;
    }

    public Task(String name, int priority, boolean done, Date date, double price) {
        this(name, priority, done, date);
        this.price = price;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isDone() {
        return done;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
}
