package visitor;

public class ConcreteVisitorA implements Visitor
{
    public void visit(ConcreteElementA element)
    {
        System.out.println("���������A����-->"+element.operationA());
    }
    public void visit(ConcreteElementB element)
    {
        System.out.println("���������A����-->"+element.operationB());
    }
}