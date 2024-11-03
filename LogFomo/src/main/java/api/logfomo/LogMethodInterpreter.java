package api.logfomo;

import api.logfomo.LogMethod;
import api.logfomo.Logged;
import api.logfomo.LEVEL;

import java.lang.reflect.Field;

public class LogMethodInterpreter {
    public static void proc(Object obj) throws IllegalAccessException {
        LogFomo logFomo = null;
        if (logFomo.parent == null) {
            new LogNotInitedException("Customize Log ERROR: LOG NOT INITALIZED EXCEPTION ");
            return;
        }
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(LogMethod.class)) {
                LogMethod logMethod = field.getAnnotation(LogMethod.class);
                System.out.println(logFomo.parent + "[   " + logMethod.value() + "   ] " + field.getName() + "  " + field.get(obj));
            }
        }
    }
}

class LoggedMethodInterpreter {
    public static void proc(Object obj) throws IllegalAccessException {
        LogFomo logFomo = null;
        if (logFomo.parent == null) {
            new LogNotInitedException("Log ERROR: LOG NOT INITALIZED EXCEPTION ");
            return;
        }
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Logged.class)) {
                Logged logged = field.getAnnotation(Logged.class);
                switch (logged.value()) {
                    case LEVEL_INFO: {
                        System.out.print("\033[0m");
                        System.out.print("\033[39m");
                        System.out.print(logFomo.parent + "[   INFO/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    case LEVEL_DEBUG: {
                        System.out.print("\033[0m");
                        System.out.print("\033[3;4;90m");
                        System.out.print(logFomo.parent + "[   DEBUG/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    case LEVEL_WARNING: {
                        System.out.print("\033[0m");
                        System.out.print("\033[3;4;33m");
                        System.out.print(logFomo.parent + "[   WARNING/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    case LEVEL_TRACE: {
                        System.out.print("\033[0m");
                        System.out.print("\033[1;4;32m");
                        System.out.print(logFomo.parent + "[   TRACE/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    case LEVEL_ERRNO: {
                        System.out.print("\033[0m");
                        System.out.print("\033[1;3;5;95m");
                        System.out.print(logFomo.parent + "[   ERRNO/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    case LEVEL_ERRNO_DETAIL: {
                        System.out.print("\033[0m");
                        System.out.print("\033[3;4;95m");
                        System.out.print(logFomo.parent + "[   ERRNO_DETAIL/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    case LEVEL_ERROR: {
                        System.out.print("\033[0m");
                        System.out.print("\033[1;3;5;35m");
                        System.out.print(logFomo.parent + "[   ERROR/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    case LEVEL_ERROR_DETAIL: {
                        System.out.print("\033[0m");
                        System.out.print("\033[3;4;35m");
                        System.out.print(logFomo.parent + "[ERROR] [DETAIL] [" + field.getName() + "   ] [" + field.get(obj) + "] at ");
                        break;
                    }
                    case LEVEL_FATAL: {
                        System.out.print("\033[0m");
                        System.out.print("\033[1;3;5;31m");
                        System.out.print(logFomo.parent + "[   FATAL/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    case LEVEL_FATAL_DETAIL: {
                        System.out.print("\033[0m");
                        System.out.print("\033[3;4;31m");
                        System.out.print(logFomo.parent + "[FATAL] [DETAIL] [" + field.getName() + "   ] [" + field.get(obj) + "] at ");
                        break;
                    }
                    case LEVEL_CRASH: {
                        System.out.print("\033[0m");
                        System.out.print("\033[1;3;4;5;47;30m");
                        System.out.print(logFomo.parent + "[   CRASH/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                    default: {
                        System.out.print("\033[0m");
                        System.out.print(logFomo.parent + "[   UNKNOWN/" + field.getName() + "   ] [" + field.get(obj) + "]");
                        System.out.print("\033[0m");
                        break;
                    }
                }
            }

        }
    }
}
