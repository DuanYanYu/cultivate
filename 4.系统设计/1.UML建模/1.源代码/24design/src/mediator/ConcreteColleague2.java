package mediator;

public class ConcreteColleague2 extends Colleague
{
    public void receive()
    {
        System.out.println("����ͬ����2�յ�����");
    }   
    public void send()
    {
        System.out.println("����ͬ����2��������");
        mediator.relay(this); //���н���ת��
    }
}
