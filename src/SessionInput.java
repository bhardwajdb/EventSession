import java.util.ArrayList;
import java.util.List;

/**
 * Created by MMT5932 on 15-05-2017.
 */
public class SessionInput {

    private List<SessionEntity> lstSession;

    public SessionInput(List<String> lstInput)
    {
        lstSession = new ArrayList<SessionEntity>();
        for (String item: lstInput)
        {
            String[] lst = item.split("\t");
            SessionEntity e = new SessionEntity(Integer.parseInt(lst[0]),Integer.parseInt(lst[1]),SessionEnum.getSessionEnum(lst[2].charAt(0)));
            lstSession.add(e);
        }
    }

    public List<SessionEntity> getLstSession() {
        return lstSession;
    }

    public void setLstSession(List<SessionEntity> lstSession) {
        this.lstSession = lstSession;
    }
}
