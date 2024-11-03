package api.logfomo;

import api.logfomo.ErrorLog;

public class MethodNotFoundException extends Exception {
    public MethodNotFoundException(String message) {
        try {
            new Exception(message);
        } catch (Exception e) {
            ErrorLog.log(e.toString());
        }
    }
}
