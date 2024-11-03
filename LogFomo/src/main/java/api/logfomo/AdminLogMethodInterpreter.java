package api.logfomo;

import api.logfomo.AdminLog;
import api.logfomo.LogFomo;
import api.logfomo.LogNotInitedException;

import java.lang.reflect.Field;

public class AdminLogMethodInterpreter extends LogFomo{
    public static void proc(Object obj) throws IllegalAccessException
    {
        LogFomo logFomo = null;
        if (logFomo.parent == null) {
            new LogNotInitedException("Administrative Log ERROR: LOG NOT INITALIZED EXCEPTION ");
            return;
        }
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            AdminLog adminLog = field.getAnnotation(AdminLog.class);


            switch (adminLog.value())
            {
                case LEVEL_ADMIN: {
                    System.out.print("\033[0m");
                    System.out.print("\033[1;3;4;5;39m");
                    System.out.print(logFomo.parent + "[   ADMIN/" + field.getName() + "   ] [" + field.get(obj) + "] ");
                    System.out.print("\033[0m");
                    break;
                }
                case LEVEL_DANGER: {
                    System.out.print("\033[0m");
                    System.out.print("\033[1;3;4;5;35m");
                    System.out.print(logFomo.parent + "[   DANGER/" + field.getName() + "  ] [" + field.get(obj) + "] ");
                    System.out.print("\033[0m");
                    break;
                }
                case LEVEL_DAMAGE: {
                    System.out.print("\033[0m");
                    System.out.print("\033[1;3;4;5;31m");
                    System.out.print(logFomo.parent + "[   DAMAGE/" + field.getName() + "  ] [" + field.get(obj) + "] ");
                    System.out.print("\033[0m");
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
}
