package interview.grammar.java8character;

/**
 * Created by pksure on 16/9/24.
 */
public class Java8InterfaceImpl implements Java8Interface{

    /**
     * 实现接口中的add方法
     */
    public void add() {
        System.out.println("implement method of interface");
    }

    /**
     * 重写接口中的默认(default)方法,也可以不用重写
     */
    public void display(){
        System.out.println("override method of interface");
        // 调用接口的静态方法
        Java8Interface.show();
    }

}
