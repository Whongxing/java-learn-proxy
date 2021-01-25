package staticProxy;

public class StaticTest {
    public static void main(String[] args) {
        StaticProxy p = new StaticProxy(new BuyXiGuaProxyImpl());
        p.say();
    }
}
