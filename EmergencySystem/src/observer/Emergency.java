package observer;

public class Emergency {
    private String type;
    private String location;
    private int severity;

    public Emergency(String type, String location, int severity) {
        this.type = type;
        this.location = location;
        this.severity = severity;
    }

    // Getters
    public String getType() { return type; }
    public String getLocation() { return location; }
    public int getSeverity() { return severity; }
}