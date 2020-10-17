package iterator;

public class IteratorPattern
{
    public static void main(String[] args)
    {
        Aggregate ag=new ConcreteAggregate(); 
        ag.add("��ɽ��ѧ"); 
        ag.add("������"); 
        ag.add("�ع�ѧԺ");
        System.out.print("�ۺϵ������У�");
        Iterator it=ag.getIterator(); 
        while(it.hasNext())
        { 
            Object ob=it.next(); 
            System.out.print(ob.toString()+"\t"); 
        }
        Object ob=it.first();
        System.out.println("\nFirst��"+ob.toString());
    }
}
