package Session4.factory;

import Session4.model.*;

public class MsiFactory extends ProductFactory{
    @Override
    public Gpu createGpu(String name, int vram) {
        Gpu createdGpu = new MsiGpu(name, vram);
        createdGpu.assemble();
        return createdGpu;
    }

    @Override
    public Monitor createMonitor(int refreshRate, int resolution) {
        Monitor createdMonitor = new MsiMonitor(refreshRate, resolution);
        createdMonitor.assemble();
        return createdMonitor;
    }
}
