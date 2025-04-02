package NetworkMessage;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;
    private String Message;

    public As1_Message(String m) {
        Message = m;
    }//constructior








    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }

    public boolean scanWarnin(String Keyword) {
        return false;
    }

    public String getMessage() {
        return Message;
    }
}//class

