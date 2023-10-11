package Session4.model;

public abstract class Monitor {
	public int refreshRate;
	public int resolution;

	public Monitor(int refreshRate, int resolution) {
		this.refreshRate = refreshRate;
		this.resolution = resolution;
	}

	public abstract void assemble();
}

