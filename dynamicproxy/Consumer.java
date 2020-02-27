package dynamicproxy;

import java.util.ArrayList;
import java.util.Collection;

public class Consumer
{
    public static void main(String[] args)
    {
        Agent a = null;
        a = new Agent(new Factory());
        ProductInterface factory = (ProductInterface) a.newProxyInstance();
        factory.productFoo();

        // According to this example(consumer - purchasing agent - factory), following doesn't make sense, just to show enhancement made by proxy.
        a = new Agent(new ArrayList<String>());
        @SuppressWarnings("unchecked")
        Collection<String> collection = (Collection<String>) a.newProxyInstance();
        collection.add("hello world");
    }
}
