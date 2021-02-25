package assignment;

import java.util.ArrayList;

public class StoreData {

    ArrayList<Object> objects = new ArrayList<>();

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public int getObjectsSize() {
        return objects.size();
    }

    public void addObject(Object object) {
        objects.add(object);
    }

    public Object getItem(int index) {
        return objects.get(index);
    }

    public int sizeOfReport (){
        return objects.size();
    }
}
