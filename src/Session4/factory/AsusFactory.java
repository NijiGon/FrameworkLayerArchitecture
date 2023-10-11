package Session4.factory;

import Session4.model.AsusGpu;
import Session4.model.AsusMonitor;
import Session4.model.Gpu;
import Session4.model.Monitor;

public class AsusFactory extends ProductFactory{
    @Override
    public Gpu createGpu(String name, int vram) {
        Gpu createdGpu = new AsusGpu(name, vram);
        createdGpu.assemble();
        return createdGpu;
    }

    @Override
    public Monitor createMonitor(int refreshRate, int resolution) {
        Monitor createdMonitor = new AsusMonitor(refreshRate, resolution);
        createdMonitor.assemble();
        return createdMonitor;
    }
}
