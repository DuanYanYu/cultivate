package Prototype;

public class citation implements  Cloneable {
	String name;
    String info;
    String college;
    citation(String name,String info,String college)
    {
        this.name=name;
        this.info=info;
        this.college=college;
        System.out.println("��״�����ɹ���");
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return(this.name);
    }
    void display()
    {
        System.out.println(name+info+college);
    }
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("��״�����ɹ���");
        return (citation)super.clone();
    }
}
