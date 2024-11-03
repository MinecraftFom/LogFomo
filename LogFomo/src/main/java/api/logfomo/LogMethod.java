package api.logfomo;

import api.logfomo.LEVEL;

public @interface LogMethod
{
    String value() default "LogFomo/Info";
}

@interface Logged
{
    LEVEL value() default LEVEL.LEVEL_INFO;
}