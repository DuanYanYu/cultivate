package visitor;

public class ConcreteVisitorB implements Visitor
{
    public void visit(ConcreteElementA element)
    {
        System.out.println("���������B����-->"+element.operationA());
    }
    public void visit(ConcreteElementB element)
    {
        System.out.println("���������B����-->"+element.operationB());
    }
}
