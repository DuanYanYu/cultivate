package Prototype;

public class ProtoTypeCitation
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        citation obj1=new citation("����","ͬѧ����2017ѧ���һѧ�ڱ������㣬����Ϊ����ѧ����","ɽ��������ѧ�������ѧ�뼼��ѧԺ");
        obj1.display();
        citation obj2=(citation) obj1.clone();
        obj2.setName("����"); 
        obj2.display();
    }
}