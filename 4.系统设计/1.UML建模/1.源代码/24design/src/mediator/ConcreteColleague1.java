package mediator;

public class ConcreteColleague1 extends Colleague
{
    public void receive()
    {
        System.out.println("����ͬ����1�յ�����");
    }   
    public void send()
    {
        System.out.println("����ͬ����1��������");
        mediator.relay(this); //���н���ת��
    }
}

