package observer;

public class ConcreteSubject extends Subject
{
    public void notifyObserver()
    {
        System.out.println("����Ŀ�귢���ı�...");
        System.out.println("--------------");       
       
        for(Object obs:observers)
        {
            ((Observer)obs).response();
        }
       
    }          
}
