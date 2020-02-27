package staticproxy;

public class Factory implements ProductInterface
{

    @Override
    public void productFoo()
    {
        System.out.println("product foo");
    }

}
