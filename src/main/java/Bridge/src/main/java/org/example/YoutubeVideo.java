package org.example;

public class YoutubeVideo extends Video{
    public YoutubeVideo(VideoProcessor processor) {
        super(processor);
    }
    @Override
    public void play(String videoFile) {
      processor.process(videoFile);
    }
}
