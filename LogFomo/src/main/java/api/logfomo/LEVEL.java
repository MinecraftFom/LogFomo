package api.logfomo;

public enum LEVEL
{
    /*public static int LEVEL_INFO         = 0;
    public static int LEVEL_DEBUG        = 1;
    public static int LEVEL_WARNING      = 2;
    public static int LEVEL_TRACE        = 3;
    public static int LEVEL_ERRNO        = 4;
    public static int LEVEL_ERRNO_DETAIL = 5;
    public static int LEVEL_ERROR        = 6;
    public static int LEVEL_ERROR_DETAIL = 7;
    public static int LEVEL_FATAL        = 8;
    public static int LEVEL_FATAL_DETAIL = 9;
    public static int LEVEL_CRASH        = 10;
    protected static int LEVEL_ADMIN     = 11;
    protected static int LEVEL_DANGER    = 12;
    protected static int LEVEL_DAMAGE    = 13;*/

    LEVEL_INFO(0x0),
    LEVEL_DEBUG(0x1),
    LEVEL_WARNING(0x2),
    LEVEL_TRACE(0x3),
    LEVEL_ERRNO(0x4),
    LEVEL_ERRNO_DETAIL(0x5),
    LEVEL_ERROR(0x6),
    LEVEL_ERROR_DETAIL(0x7),
    LEVEL_FATAL(0x8),
    LEVEL_FATAL_DETAIL(0x9),
    LEVEL_CRASH(0xa);

    public int nvalue;

    LEVEL(int nvalue)
    {
        this.nvalue = nvalue;
    }
}
