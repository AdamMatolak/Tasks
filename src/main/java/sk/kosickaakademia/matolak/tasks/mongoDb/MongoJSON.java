package sk.kosickaakademia.matolak.tasks.mongoDb;

import org.json.simple.JSONObject;

public interface MongoJSON {

    public void insertTaskJSON(JSONObject task);

    public JSONObject getAllTasksJSON();
}
