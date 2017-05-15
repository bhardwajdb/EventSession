import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by MMT5932 on 15-05-2017.
 */
public class Scheduler {
    public static void schedule(SessionInput sessionInput, TalkInput talkInput)
    {
        int dayNum = 1;
        Collections.sort(talkInput.getLstEvent());
        List<SessionEntity> lstSession = sessionInput.getLstSession();
        Iterator it = talkInput.getLstEvent().iterator();
        while (it.hasNext())
        {
            TalkEntity talkEntity = (TalkEntity)it.next();
            boolean flag = false;
            for (SessionEntity sessionEntity: lstSession)
            {
                if (sessionEntity.getDurationLeftToAllocate(dayNum) >= talkEntity.getDuration()){
                    sessionEntity.addTalk(dayNum, talkEntity);
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                dayNum ++;
                continue;
            }
        }
    }
}
