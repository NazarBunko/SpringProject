package spring.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    public void startPlayer(){
        musicPlayer.playMusic();
    }
}