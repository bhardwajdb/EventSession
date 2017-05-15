/**
 * Created by MMT5932 on 15-05-2017.
 *
  */
enum SessionEnum {
    MORNING('M'), LUNCH('L'),EVENING('E'),NETWORKING('N');

    private char value;
    private SessionEnum(char value)
    {
        this.value = value;
    }
    public char getValue()
    {
        return this.value;
    }
    public static SessionEnum getSessionEnum(char c)
    {
        SessionEnum toRet = SessionEnum.MORNING;
        if (c == 'M')
            toRet = SessionEnum.MORNING;
        else if (c == 'L')
            toRet = SessionEnum.LUNCH;
        else if (c == 'E')
            toRet = SessionEnum.EVENING;
        else
            toRet = SessionEnum.NETWORKING;
        return toRet;
    }
}
