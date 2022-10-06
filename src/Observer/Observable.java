package Observer;


//criação da interface observable para fazer a adiçã o e notificação
public interface Observable {

    public void addObserver( Observer observer);

    public  void  removeObserver(Observer observer);

    public  void notify(String message);
}
