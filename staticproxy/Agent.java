package staticproxy;

public class Agent implements ProductInterface
{
    private Factory factory;
    
    public Agent(Factory factory)
    {
        this.factory = factory;
    }
    
    
    @Override
    public void productFoo()
    {
        preEnhancement();
        
        factory.productFoo();
        
        postEnhancement();
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
