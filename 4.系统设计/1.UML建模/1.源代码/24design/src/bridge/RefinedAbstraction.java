package bridge;

public class RefinedAbstraction extends Abstraction
{
	  //���췽��
	   protected RefinedAbstraction(Implementor imple)
	   {
	       super(imple);
	   }
	   public void Operation()
	   {
	       System.out.println("��չ����(Refined Abstraction)��ɫ������" );
	       //����ʵ�����е����Ի򷽷�
	       imple.OperationImpl();
	   }
	}
