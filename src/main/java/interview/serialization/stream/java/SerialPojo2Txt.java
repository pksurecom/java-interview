package interview.serialization.stream.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;

/**
 * Created by pksure on 16/9/2.
 */
public class SerialPojo2Txt extends Thread {

    public static void main(String[] args){
        System.out.println("Start serializable ...");
        SimplePojo pojo = new SimplePojo();
        pojo.setName("张三");
        pojo.setAge(28);
        File file = new File("src/main/java/interview/serialization/stream/java/serial.txt");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(pojo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
