package interview.grammar.java8character;

import java.util.Arrays;

/**
 * Created by pksure on 16/9/25.
 */
public class Java8MethodRef {

    public static void main(String[] args){
        Arrays.asList("j", "a", "v", "a", "8").forEach(new Java8MethodRef()::show);
    }

    public void show(String obj){
        System.out.println(obj);
    }

}
