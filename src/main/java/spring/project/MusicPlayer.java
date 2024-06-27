package spring.project;

import java.util.List;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer() {}
    public void playMusic(){
        System.out.println("Today music is " + music.getSong());
    }

    public void setMusic(Music music){
        this.music = music;
    }
}
