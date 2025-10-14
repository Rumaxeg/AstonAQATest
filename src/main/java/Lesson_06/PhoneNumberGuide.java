package Lesson_06;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberGuide {

    Map<Integer,String> guide = new HashMap<>();

    public void add(int number, String name){
        guide.put(number,name);
    }

    public void get(String name){
        for(Map.Entry<Integer, String> value : guide.entrySet()){
            if(value.getValue().equals(name)){
                System.out.println(value.getKey());
            }
        }
    }
}
