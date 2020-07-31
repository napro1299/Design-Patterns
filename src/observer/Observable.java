package observer;

public interface Observable {
    void register(Observer observer);

    void deregister(Observer observer);

    void notifyAllObservers();
}

