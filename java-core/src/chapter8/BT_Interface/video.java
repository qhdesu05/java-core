package chapter8.BT_Interface;

public class video implements Playable {
    private String title;
    private int duration;

    public video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + this.title + "([" + this.duration + "] seconds)");
    }

    @Override
    public void pause() {
        System.out.println("Pausing song: " + this.title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
