package Session8Proxy3_Cache.videodownloader;

import Session8Proxy3_Cache.model.Video;

public class VideoDownloader implements IDownloader {

	@Override
	public Video getVideo(String videoName) {
		System.out.println("Connecting to https://www.youtube.com/");
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print("Downloading video " + videoName);
		for(int i = 0; i < 5; i ++) {
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println();
		
		System.out.println("Retrieving video metadata");
		
		return new Video(videoName);
	}

}
