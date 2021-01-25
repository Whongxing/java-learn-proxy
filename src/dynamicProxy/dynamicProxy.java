package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class dynamicProxy implements InvocationHandler {

    private Object a;

    public dynamicProxy(Object a) {
        this.a = a;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("小明即将去买西瓜.....");
        method.invoke(a,args);
        return null;
    }
}
