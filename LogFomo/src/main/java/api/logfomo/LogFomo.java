package api.logfomo;

import api.logfomo.ADMINLEVEL;
import api.logfomo.LEVEL;
import api.logfomo.LogMethodInterpreter;

public class LogFomo
{
    protected static String parent = null;
    public static void init(String _para)
    {
        parent = _para;
    }
}

class InfoLog
{
    @Logged(LEVEL.LEVEL_INFO)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class DebugLog
{
    @Logged(LEVEL.LEVEL_DEBUG)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class WarningLog
{
    @Logged(LEVEL.LEVEL_WARNING)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class TraceLog
{
    @Logged(LEVEL.LEVEL_TRACE)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class ErrnoLog
{
    @Logged(LEVEL.LEVEL_ERRNO)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class ErrnoDetailLog
{
    @Logged(LEVEL.LEVEL_ERRNO_DETAIL)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class ErrorLog
{
    @Logged(LEVEL.LEVEL_ERROR)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class ErrorDetailLog
{
    @Logged(LEVEL.LEVEL_ERROR_DETAIL)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class FatalLog
{
    @Logged(LEVEL.LEVEL_FATAL)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class FatalDetailLog
{
    @Logged(LEVEL.LEVEL_FATAL_DETAIL)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class CrashLog
{
    @Logged(LEVEL.LEVEL_CRASH)
    public static void log(String message)
    {
        System.out.println(message);
    }
}

class AdminLogs
{
    @AdminLog(ADMINLEVEL.LEVEL_ADMIN)
    protected static void admin(String message)
    {
        System.out.println(message);
    }

    @AdminLog(ADMINLEVEL.LEVEL_DAMAGE)
    protected static void danger(String message)
    {
        System.out.println(message);
    }

    @AdminLog(ADMINLEVEL.LEVEL_DAMAGE)
    protected static void damage(String message)
    {
        System.out.println(message);
    }
}