package factory;

//���幤��2��ʵ���˳�Ʒ�����ɷ���
public class ConcreteFactory2 implements AbstractFactory
{
  public Product newProduct()
  {
      System.out.println("���幤��2����-->�����Ʒ2...");
      return new ConcreteProduct2();
  }
}