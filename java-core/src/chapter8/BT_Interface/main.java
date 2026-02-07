package chapter8.BT_Interface;

public class main {
    static void main(String[] args) {
        Song mySong = new Song("last time", "drt");
        video java = new video("Interface", 1200);

        Playable[] myList = {mySong, java};
        for (Playable playable : myList) {
            playable.play();
            playable.pause();
        }
    }
}
