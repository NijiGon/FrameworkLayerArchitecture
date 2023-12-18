package Session8Proxy2_Virtual.image;

public class ImageDisplay implements IDisplayable {
	
	String filePath;

	public ImageDisplay(String filepath) {
		this.filePath = filepath;
		loadConfig();
	}
	
	void loadConfig() {
		// Heavy task
		System.out.print("Pre-initializing image");
		for(int i = 0; i < 5; i ++) {
			System.out.print(".");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

	@Override
	public void display() {
		System.out.println("Displaying image: " + filePath);
	}
}
