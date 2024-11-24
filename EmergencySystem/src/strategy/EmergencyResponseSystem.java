package strategy;

import observer.Emergency;

public class EmergencyResponseSystem {
    private EmergencyResponseStrategy strategy;
    
    public void setStrategy(EmergencyResponseStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void handleEmergency(Emergency emergency) {
        strategy.executeResponse(emergency);
    }
}
