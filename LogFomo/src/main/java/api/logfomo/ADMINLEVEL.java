package api.logfomo;

public enum ADMINLEVEL {
    LEVEL_ADMIN(0xb),
    LEVEL_DANGER(0xc),
    LEVEL_DAMAGE(0xd);

    public int pvalue;

    ADMINLEVEL(int pvalue)
    {
        this.pvalue = pvalue;
    }
}
