package command;

public class CommandPattern
{
    public static void main(String[] args)
    {
        Command cmd=new ConcreteCommand();
        Invoker ir=new Invoker(cmd);
        System.out.println("�ͻ����ʵ����ߵ�call()����...");
        ir.call();
    }
}
