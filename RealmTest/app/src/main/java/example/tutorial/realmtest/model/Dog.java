package example.tutorial.realmtest.model;

import io.realm.RealmObject;

/**
 * Created by Jakub on 2017-07-25.
 */

public class Dog extends RealmObject {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // ... Generated getters and setters ...
}