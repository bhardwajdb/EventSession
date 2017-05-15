/**
 * Created by MMT5932 on 15-05-2017.
 */
public class TalkEntity implements Comparable{
    private int duration;
    private String name;

    public TalkEntity(int duration, String name) {
        this.duration = duration;
        this.name = name;
    }

    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Object o) {
        return this.duration - ((TalkEntity)o).getDuration();
    }
}
