package Session4.model;

public class MsiMonitor extends Monitor{
    public MsiMonitor(int refreshRate, int resolution) {
        super(refreshRate, resolution);
    }

    @Override
    public void assemble() {
        System.out.println("An msi monitor is being assembled");
    }
}
