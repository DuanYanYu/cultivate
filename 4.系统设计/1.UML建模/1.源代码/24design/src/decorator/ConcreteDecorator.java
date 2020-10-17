package decorator;

public class ConcreteDecorator extends Decorator
{
    public ConcreteDecorator(Component component)
    {
        super(component);
    }   
    public void operation()
    {
        addedFunction();
        super.operation();
    }
    public void addedFunction()
    {
        System.out.println("Ϊ���幹����ɫ���Ӷ���Ĺ���addedFunction()");           
    }
}

