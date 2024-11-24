package observer;

import java.util.ArrayList;
import java.util.List;

public class EmergencyMonitoringSystem {
    private List<EmergencyObserver> observers = new ArrayList<>();
    
    public void attach(EmergencyObserver observer) {
        observers.add(observer);
    }
    
    public void detach(EmergencyObserver observer) {
        observers.remove(observer);
    }
    
    public void notifyEmergency(Emergency emergency) {
        for (EmergencyObserver observer : observers) {
            observer.update(emergency);
        }
    }
}
