package Session8Proxy3_Cache.videodownloader.proxy;

import Session8Proxy3_Cache.model.Video;
import Session8Proxy3_Cache.videodownloader.IDownloader;
import Session8Proxy3_Cache.videodownloader.VideoDownloader;

import java.util.HashMap;

public class VideoDownloaderProxy implements IDownloader {
    private VideoDownloader vd;

    private HashMap<String, Video> history;

    public VideoDownloaderProxy() {
        // proxy protection & cache hrs initialize service asli
        vd = new VideoDownloader();
        history = new HashMap<>();
    }

    @Override
    public Video getVideo(String videoName) {
        if(history.containsKey(videoName)){
            return history.get(videoName);
        }
        Video vid = vd.getVideo(videoName);
        history.put(videoName, vid);
        return vid;
    }
}
