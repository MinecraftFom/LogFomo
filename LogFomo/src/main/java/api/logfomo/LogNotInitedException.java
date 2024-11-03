package api.logfomo;

import api.logfomo.LEVEL;
import api.logfomo.Logged;
import api.logfomo.ErrorLog;

public class LogNotInitedException extends Exception {
    public LogNotInitedException(String message) {
        try
        {
            new Exception(message);
        } catch (Exception e) {
            ErrorLog.log(e.toString());
        }
    }
}
