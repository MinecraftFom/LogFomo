package api.logfomo;

import api.logfomo.ADMINLEVEL;

public @interface AdminLog {
    ADMINLEVEL value() default ADMINLEVEL.LEVEL_ADMIN;
}
