package interview.serialization.stream.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;

/**
 * Created by pksure on 16/9/2.
 */
public class SerialAndUnSerialPojo {

    public static void main(String[] args){
        try {
            /* 序列化 */
            SimplePojo pojo = new SimplePojo("李四", 28);
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(pojo);
            byte[] byteArray = os.toByteArray();
            System.out.println("序列化后的二进制: " + new BigInteger(1, byteArray).toString(2));

            /* 反序列化 */
            ByteArrayInputStream is = new ByteArrayInputStream(byteArray);
            ObjectInputStream ois = new ObjectInputStream(is);
            System.out.println("反序列化后的对象: " + ois.readObject().getClass().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
