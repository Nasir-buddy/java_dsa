package Collection_FrameWOrk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Learn_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Nasir Ali");
        list.add("Adarsh");
        list.add("Prachi");
        list.add("Anjali");

        // normal method
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // for each loop
        for(String str : list){
            System.out.println(str);
        }

        // java iterator framework 
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
