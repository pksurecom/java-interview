package interview.serialization.stream.java;

import java.io.Serializable;

/**
 * Created by pksure on 16/9/2.
 */
public class SimplePojo implements Serializable{

    private static final long serializationUID = 2l;
    private String name;
    private int age;

    public SimplePojo(){}

    public SimplePojo(String name, int age){
        this.name = name;
        this.age = age;
    }

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
}
