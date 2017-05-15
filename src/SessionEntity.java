import java.util.HashMap;
import java.util.List;

/**
 * Created by MMT5932 on 15-05-2017.
 */
public class SessionEntity {
    private int startTime;
    private int endTime;
    private SessionEnum type;
    private HashMap<Integer,List<TalkEntity>> lstTalks;

    public SessionEntity(int startTime, int endTime, SessionEnum type) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
    }

    public int getDurationLeftToAllocate(int dayNum)
    {
        int originalDuration = endTime - startTime;
        int temp = 0;
        List<TalkEntity> lstTalk = lstTalks.get(dayNum);
        for (TalkEntity e: lstTalk)
        {
            temp += e.getDuration();
        }
        return originalDuration - temp;
    }

    public void addTalk(int dayNum, TalkEntity talk)
    {
        lstTalks.get(dayNum).add(talk);
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public SessionEnum getType() {
        return type;
    }

    public void setType(SessionEnum type) {
        this.type = type;
    }

    public HashMap<Integer,List<TalkEntity>> getLstTalks() {
        return lstTalks;
    }

    public void setLstTalks(HashMap<Integer,List<TalkEntity>> lstTalks) {
        this.lstTalks = lstTalks;
    }

}
