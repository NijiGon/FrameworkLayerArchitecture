package Session8Proxy2_Virtual.main;

import Session8Proxy2_Virtual.image.IDisplayable;
import Session8Proxy2_Virtual.image.ImageDisplay;
import Session8Proxy2_Virtual.image.proxy.ImageDisplayProxy;
import Session8Proxy2_Virtual.image.IDisplayable;


public class Main {

	public Main() {
		IDisplayable img1 = new ImageDisplayProxy("dog.jpg");
		IDisplayable img2 = new ImageDisplayProxy("cat.jpg");
		IDisplayable img3 = new ImageDisplayProxy("frog.jpg");
		
		img1.display();
		img2.display();
		img3.display();
	}

	public static void main(String[] args) {
		new Main();
	}
}
