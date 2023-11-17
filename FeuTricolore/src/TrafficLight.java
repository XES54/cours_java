import java.util.ArrayList;
import java.util.List;
class TrafficLight {
    private final List<Observer> observers = new ArrayList<>();

    private String currentState;

    TrafficLight() {
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentState);
        }
    }

    public void changeState(String newState) {
        currentState = newState;
        System.out.println("Traffic Light changed state to: " + newState);
        notifyObservers();
    }
}
