package org.neuefische.Groupetaskpackages.Interfaces;

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        VideoPlayer vmp = new VideoPlayer();
        //this works because the VideoPlayer implements playable
//        Playable playable=new VideoPlayer();
//        Playable playable1=new MusicPlayer();
        //playable playable2=new  Book();

        MediaController mc = new MediaController();
        mc.playMedia(mp);
        mc.playMedia(vmp);
//        mc.playMedia(playable);
//        mc.playMedia(playable1);

    }
}
