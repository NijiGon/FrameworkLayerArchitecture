package Session8Proxy2_Virtual.image.proxy;

import Session8Proxy2_Virtual.image.IDisplayable;
import Session8Proxy2_Virtual.image.ImageDisplay;

public class ImageDisplayProxy implements IDisplayable {

    private ImageDisplay imgd;

    String filepath;

    public ImageDisplayProxy(String filepath) {
        this.filepath = filepath;
        // untuk virtual proxy service asil dibiarkan null
    }

    @Override
    public void display() {
        if(imgd == null){
            imgd = new ImageDisplay(filepath);
        }
        imgd.display();
    }
}
