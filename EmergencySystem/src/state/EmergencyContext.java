package state;

import observer.Emergency;

public class EmergencyContext {
    private EmergencyState currentState;
    private Emergency emergency;

    public EmergencyContext(Emergency emergency) {
        this.emergency = emergency;
        this.currentState = new DetectedState();
    }

    public void setState(EmergencyState state) {
        this.currentState = state;
    }

    public void evaluate() {
        currentState.evaluate(this);
        // Usar el campo emergency
        System.out.println("Evaluando emergencia tipo: " + emergency.getType() + 
                         " en ubicación: " + emergency.getLocation());
    }

    public void respond() {
        currentState.respond(this);
        // Usar el campo emergency
        System.out.println("Respondiendo a emergencia con severidad: " + 
                         emergency.getSeverity());
    }

    public void resolve() {
        currentState.resolve(this);
        // Usar el campo emergency
        System.out.println("Resolviendo emergencia en: " + emergency.getLocation());
    }

    public String getCurrentState() {
        return currentState.getStateName();
    }

    // Getter para emergency
    public Emergency getEmergency() {
        return emergency;
    }
}