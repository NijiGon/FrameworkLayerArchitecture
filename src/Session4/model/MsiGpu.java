package Session4.model;

public class MsiGpu extends Gpu{

    public MsiGpu(String name, int vram) {
        super(name, vram);
    }

    @Override
    public void assemble() {
        System.out.println("An msi gpu is being assembled");
    }
}
