package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;;

public class Agent implements InvocationHandler
{
    
    private Object realObject;
    
    public Agent(Object object)
    {
        realObject = object;
    }
    
    public Object newProxyInstance()
    {
        Class<?> type = realObject.getClass();
        return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), this);
    }
    
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        preEnhancement();
        Object result = method.invoke(realObject, args);
        postEnhancement();
        return result;
    }
    
    private void preEnhancement()
    {
        System.out.println("Conduct survey; communicate between factory and consumer");
    }

    private void postEnhancement()
    {
        System.out.println("Buy; pack up load; contact logistics for delivery");
    }
}
