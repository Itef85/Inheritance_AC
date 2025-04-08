package NetworkMessage;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;
//private String Message;

    public As1_Message(String message) {

        machineId = message.substring(0,message.indexOf(":") -1);
        machineType = message.substring(message.indexOf(":") -1, message.indexOf(":"));
        String wtemp = message.substring(message.indexOf(":") +1, message.length());
        warning = wtemp.trim();
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

//    public String getMessage() {
//        return Message;
//    }
}//class

