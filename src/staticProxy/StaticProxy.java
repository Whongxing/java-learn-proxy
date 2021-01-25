package staticProxy;

/**
 * 代理类，代理小明去买西瓜
 */
public class StaticProxy implements BuyXiGuaProxy {
    private BuyXiGuaProxyImpl a;

    public StaticProxy(BuyXiGuaProxyImpl a) {
        this.a = a;
    }

    @Override
    public void say() {
        System.out.println("小明即将去买西瓜.....");
        a.say();
    }
}
