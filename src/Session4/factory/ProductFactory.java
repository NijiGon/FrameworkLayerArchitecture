package Session4.factory;

import Session4.model.Gpu;
import Session4.model.Monitor;

public abstract class ProductFactory {
    public abstract Gpu createGpu(String name, int vram);
    public abstract Monitor createMonitor(int refreshRare, int resolution);
}
