package staticProxy;

public class StaticTest {
    public static void main(String[] args) {
        Proxy p = new Proxy(new BuyXiGuaProxyImpl());
        p.say();
    }
}
