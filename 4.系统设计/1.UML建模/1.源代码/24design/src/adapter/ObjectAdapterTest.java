package adapter;

//�ͻ��˴���
public class ObjectAdapterTest
{
  public static void main(String[] args)
  {
      System.out.println("����������ģʽ���ԣ�");
      Adaptee adaptee = new Adaptee();
      Target target = new ObjectAdapter(adaptee);
      target.request();
  }
}