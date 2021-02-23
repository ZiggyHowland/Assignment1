package assignment;

import java.util.ArrayList;

public class StoreData {
    ArrayList<Object> objects = new ArrayList<>();

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void addObject(Object object) {
        objects.add(object);
    }
}
