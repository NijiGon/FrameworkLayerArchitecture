package Session8Proxy3_Cache.main;

import Session8Proxy3_Cache.model.Video;
import Session8Proxy3_Cache.videodownloader.IDownloader;
import Session8Proxy3_Cache.videodownloader.VideoDownloader;
import Session8Proxy3_Cache.videodownloader.proxy.VideoDownloaderProxy;

public class Main {

	public Main() {
//		VideoDownloader vd = new VideoDownloader();
		IDownloader vd = new VideoDownloaderProxy();
		Video vid1 = vd.getVideo("Dog");
		System.out.println(vid1.name);
		Video vid2 = vd.getVideo("Cat");
		System.out.println(vid1.name);
		Video vid3 = vd.getVideo("Dog");
		System.out.println(vid1.name);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
