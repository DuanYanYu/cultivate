package factory;

//���幤��1��ʵ���˳�Ʒ�����ɷ���
public class ConcreteFactory1 implements AbstractFactory
{
  public Product newProduct()
  {
      System.out.println("���幤��1����-->�����Ʒ1...");
      return new ConcreteProduct1();
  }
}