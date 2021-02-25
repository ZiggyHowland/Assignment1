package InternalTesting;

import java.util.ArrayList;

public class AllItems {

    ArrayList<LineItem> allItems = new ArrayList<>();


    public ArrayList<LineItem> getAllItems () {
        return allItems;
    }

    public void setItem(LineItem item) {
        allItems.add(item);
    }

    public LineItem getItem( int index){
        return allItems.get(index);
    }

    public int sizeOfDB() {
        return allItems.size();
    }


}
