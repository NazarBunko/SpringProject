package spring.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    private Music music;
    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer() {}
    public void playMusic(){
        System.out.println("Today music is " + music.getSong() + ".");
    }
    public void setMusic(Music music){
        this.music = music;
    }
}
