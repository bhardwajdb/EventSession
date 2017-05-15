import java.util.List;

/**
 * Created by MMT5932 on 15-05-2017.
 */
public class TalkInput {
    private List<TalkEntity> lstEvent;

    public TalkInput(List<String> lst) {
        for (String eventStr : lst)
        {
            String[] arr = eventStr.split("\t");
            lstEvent.add(new TalkEntity(Integer.parseInt(arr[0]),arr[1]));
        }
    }

    public List<TalkEntity> getLstEvent() {
        return lstEvent;
    }

    public void setLstEvent(List<TalkEntity> lstEvent) {
        this.lstEvent = lstEvent;
    }


}
