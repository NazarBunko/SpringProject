package spring.project;

import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {
    public ClassicalMusic() {}
    @Override
    public String getSong() {
        return "Classical";
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Init");
    }

    public void doMyDestroy(){
        System.out.println("Destroy");
    }
}