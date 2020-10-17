package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject
{
    protected List<Observer> observers=new ArrayList<Observer>();   
    //���ӹ۲��߷���
    public void add(Observer observer)
    {
        observers.add(observer);
    }    
    //ɾ���۲��߷���
    public void remove(Observer observer)
    {
        observers.remove(observer);
    }   
    public abstract void notifyObserver(); //֪ͨ�۲��߷���
}
