package state;

public class DetectedState implements EmergencyState {
    @Override
    public void evaluate(EmergencyContext context) {
        System.out.println("Iniciando evaluación de la emergencia tipo: " + 
                         context.getEmergency().getType());
        context.setState(new EvaluationState());
    }
    
    @Override
    public void respond(EmergencyContext context) {
        System.out.println("Error: Debe evaluarse primero la emergencia en " + 
                         context.getEmergency().getLocation());
    }
    
    @Override
    public void resolve(EmergencyContext context) {
        System.out.println("Error: No se puede resolver una emergencia no evaluada. Severidad: " + 
                         context.getEmergency().getSeverity());
    }
    
    @Override
    public String getStateName() {
        return "Detectada";
    }
}