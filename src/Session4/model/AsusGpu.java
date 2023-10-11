package Session4.model;

public class AsusGpu extends Gpu{

    public AsusGpu(String name, int vram) {
        super(name, vram);
    }

    @Override
    public void assemble() {
        System.out.println("An asus gpu is being assembled");
    }
}
