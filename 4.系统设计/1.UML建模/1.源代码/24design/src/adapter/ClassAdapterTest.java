package adapter;
//��ͻ���
public class ClassAdapterTest
{
    public static void main(String[] args)
    {
        System.out.println("��������ģʽ���ԣ�");
        Target target = new ClassAdapter();
        target.request();
    }
}