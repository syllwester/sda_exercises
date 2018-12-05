package programming1exercises.exercises001.exercise22;


import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


public class MyRun implements Runnable{

    Thread thread;
    private String name;
    public MyRun(String name){
        thread = new Thread(this, name);
        this.name = name;
    }

    @Override
    public void run() {
        Person person = new Person(ListsWithNames.randomName(), ListsWithNames.randomSurname(), ListsWithNames.randomAge());
//        JSONObject objJSON = new JSONObject();
//        objJSON.put("person",person);
        System.out.println(person.toString());
        System.out.println("cos");
//        try (FileWriter file = new FileWriter("C:/"+randomFileName()+".json")){
//            file.write(objJSON.toString());
//            file.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    }


