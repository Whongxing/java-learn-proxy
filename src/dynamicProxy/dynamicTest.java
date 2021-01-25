package dynamicProxy;

import java.lang.reflect.Proxy;

public class dynamicTest {
    public static void main(String[] args) {
        BuyXiGuaProxy test = new BuyXiGuaProxyImpl();
        BuyXiGuaProxy buy =
                (BuyXiGuaProxy) Proxy.newProxyInstance(
                        test.getClass().getClassLoader(),
                        new Class[]{BuyXiGuaProxy.class},
                        new dynamicProxy(test));
        buy.say();

    }
}
