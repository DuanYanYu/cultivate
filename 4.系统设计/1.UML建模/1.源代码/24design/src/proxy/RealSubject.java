package proxy;
//��ʵ����
public class RealSubject implements Subject
{
    public void Request()
    {
        System.out.println("������ʵ���ⷽ��...");
    }
}
