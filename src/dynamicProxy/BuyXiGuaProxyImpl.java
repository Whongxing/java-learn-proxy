package dynamicProxy;

/**
 * 代理接口的实现类
 */
public class BuyXiGuaProxyImpl implements BuyXiGuaProxy {

    @Override
    public void say() {
        System.out.println("小明去买了西瓜");
    }
}
