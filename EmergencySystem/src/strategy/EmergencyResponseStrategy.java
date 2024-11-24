package strategy;

import observer.Emergency;

public interface EmergencyResponseStrategy {
    void executeResponse(Emergency emergency);
}
