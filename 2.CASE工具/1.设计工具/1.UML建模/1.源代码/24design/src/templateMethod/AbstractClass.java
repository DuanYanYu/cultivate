package templateMethod;

public abstract class AbstractClass
{
    public void TemplateMethod() //ģ�巽��
    {
        SpecificMethod();
        abstractMethod1();          
         abstractMethod2();
    }  
    public void SpecificMethod() //���巽��
    {
        System.out.println("�������еľ��巽��������...");
    }   
    public abstract void abstractMethod1(); //���󷽷�1
    public abstract void abstractMethod2(); //���󷽷�2
}