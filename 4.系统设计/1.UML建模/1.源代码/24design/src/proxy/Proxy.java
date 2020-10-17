package proxy;

public class  Proxy implements Subject
{
    private RealSubject realSubject;
    public void Request()
    {
        if (realSubject==null)
        {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }
    public void preRequest()
    {
        System.out.println("������ʵ����֮ǰ��Ԥ����");
    }
    public void postRequest()
    {
        System.out.println("������ʵ����֮��ĺ�������");
    }
}