package state;

public interface EmergencyState {
    void evaluate(EmergencyContext context);
    void respond(EmergencyContext context);
    void resolve(EmergencyContext context);
    String getStateName();
}