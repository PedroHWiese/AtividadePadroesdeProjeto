package Observer;

import java.util.ArrayList;
import java.util.List;

public class Service implements Observable {
    private String name;
    private List<Observer> observers;

    //lista de observadores não entra no construtor, ela é iniciada de uma forma alternativa
    public Service(String name) {
        super();
        this.name = name;
    }

    public void addObserver(Observer observer){
        getObservers().add(observer);
    }

    public  void  removeObserver(Observer observer) {
        getObservers().remove(observer);
    }

    private List<Observer>getObservers(){
        if (observers == null)
            this.observers = new ArrayList<Observer>();
        return observers;
    }

    public void notify(String message) {
        for (Observer o : observers)
            o.notify(this, message);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
