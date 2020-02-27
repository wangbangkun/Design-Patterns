package staticproxy;

public class Consumer
{
    
    public static void main(String[] args)
    {
        Agent a = new Agent(new Factory());
        a.productFoo();
    }
}
