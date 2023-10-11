package Session4.model;

public class AsusMonitor extends Monitor{
    public AsusMonitor(int refreshRate, int resolution) {
        super(refreshRate, resolution);
    }

    @Override
    public void assemble() {
        System.out.println("An asus monitor is being assembled");
    }
}
