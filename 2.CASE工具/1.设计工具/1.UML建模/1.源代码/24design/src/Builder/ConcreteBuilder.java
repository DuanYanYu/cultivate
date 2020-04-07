package Builder;

public class ConcreteBuilder extends Builder
{
    public void buildPartA()
    {
        product.setPartA("���� PartA");
    }
    public void buildPartB()
    {
        product.setPartB("���� PartB");
    }
    public void buildPartC()
    {
        product.setPartC("���� PartC");
    }
}