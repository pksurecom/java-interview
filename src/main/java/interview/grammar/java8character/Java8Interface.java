package interview.grammar.java8character;

/**
 * Created by pksure on 16/9/24.
 */
public interface Java8Interface {

    /**
     * 老版本中接口的方法所有都是抽象方法
     */
    public abstract void add();

    /**
     * 新版本(>=Java7)之后新增的默认(default)方法
     * 接口的实现类可以重写该方法
     */
    public default void display(){
        System.out.println("default method of interface");
    }

    /**
     * 新版本(>=Java7)之后新增的静态(static)方法
     */
    public static void show(){
        System.out.println("static method of interface");
    }

}
